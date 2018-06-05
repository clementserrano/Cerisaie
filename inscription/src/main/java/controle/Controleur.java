package controle;

import metier.FactoryRequete;
import metier.Requete;
import utils.Header;
import utils.MonException;

import javax.annotation.Resource;
import javax.jms.*;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Controleur")
public class Controleur extends HttpServlet {

    @Resource(lookup = "java:jboss/exported/topic/InscriptionJmsTopic")
    private Topic topic;

    @Resource(mappedName = "java:/ConnectionFactory")
    private TopicConnectionFactory cf;
    private TopicSession session = null;
    private TopicPublisher producer;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            TraiteRequete(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        try {
            TraiteRequete(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void TraiteRequete(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        try {
            String action = request.getParameter("action");
            Requete requete = null;
            switch (Header.valueOf(action)) {
                case ACCUEIL:
                    this.getServletContext().getRequestDispatcher("/index.jsp").include(request, response);
                    break;
                case AJOUTE_ACTIVITE:
                    request.getRequestDispatcher("AjouteActivite.jsp").forward(request, response);
                    break;
                case ENVOI_ACTIVITE:
                    requete = FactoryRequete.createActivite(request, response);
                    gererEnvoi(requete, request, response);
                    break;
            }
        } catch (MonException m) {
            request.setAttribute("MesErreurs", m.getMessage());
            request.getRequestDispatcher("PostMessage.jsp").forward(request, response);
        } catch (Exception e) {
            System.out.println("Erreur client  :" + e.getMessage());
            request.setAttribute("MesErreurs", e.getMessage());
            request.getRequestDispatcher("PostMessage.jsp").forward(request, response);
        }
    }

    private void gererEnvoi(Requete requete, ServletRequest request, ServletResponse response) throws Exception {
        if (requete != null) {
            boolean ok = envoi(requete);
            if (ok)
                this.getServletContext().getRequestDispatcher("/index.jsp").include(request, response);
            else {
                this.getServletContext().getRequestDispatcher("/Erreur.jsp").include(request, response);
            }
        }
    }

    private boolean envoi(Requete requete) throws Exception {
        boolean ok = true;
        TopicConnection connection = null;

        try {
            connection = cf.createTopicConnection();
            session = connection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
            producer = session.createPublisher(topic);
            connection.start();
            ObjectMessage message = session.createObjectMessage();
            message.setObject(requete);
            producer.publish(message);
            producer.close();
            session.close();
            connection.close();
        } catch (JMSException j) {
            new MonException(j.getMessage());
            ok = false;
        } catch (Exception e) {
            new MonException(e.getMessage());
            ok = false;
        }
        return ok;
    }
}
