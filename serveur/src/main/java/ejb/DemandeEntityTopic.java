package ejb;

import service.EnregistreEntity;
import utils.EcritureErreur;
import utils.MonException;
import utils.Requete;

import javax.annotation.Resource;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.ejb.MessageDrivenContext;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.naming.NamingException;

@MessageDriven(activationConfig = {
        @ActivationConfigProperty(
                propertyName = "destination",
                propertyValue = "java:jboss/exported/topic/InscriptionJmsTopic"),
        @ActivationConfigProperty(
                propertyName = "destinationType",
                propertyValue = "javax.jms.Topic")},
        mappedName = "InscriptionJmsTopic")
public class DemandeEntityTopic implements MessageListener {

    @Resource
    private MessageDrivenContext context;

    public void onMessage(Message message) {
        try {
            if (message != null) {
                ObjectMessage objectMessage = (ObjectMessage) message;
                Requete requete = (Requete) objectMessage.getObject();
                message = null;
                try {
                    Object entity = null;

                    switch(requete.getNom()){
                        case "" : break;
                    }

                    if(entity != null){
                        EnregistreEntity enregistreEntity = new EnregistreEntity();
                        enregistreEntity.insert(entity);
                    }
                } catch (NamingException er) {
                    EcritureErreur.write(er.getMessage());
                } catch (MonException e) {
                    EcritureErreur.write(e.getMessage());
                } catch (Exception ex) {
                    EcritureErreur.write(ex.getMessage());
                }
            }
        } catch (JMSException jmse) {
            System.out.println(jmse.getMessage());
            EcritureErreur.write(jmse.getMessage());
            context.setRollbackOnly();
        }
    }
}
