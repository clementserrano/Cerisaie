package controle;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class FactoryRequete {
    public static Requete createActivite(ServletRequest request, ServletResponse response) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            response.setContentType("text/html;charset=UTF-8");
            String nom = request.getParameter("nom");
            String prenom = request.getParameter("prenom");


            String datenaissance = request.getParameter("datenaissance");
            java.util.Date initDate = new SimpleDateFormat("dd/MM/yyyy").parse(datenaissance);
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String parsedDate = formatter.format(initDate);

            initDate = formatter.parse(parsedDate);

            Date uneDate = new Date(initDate.getTime());

            String adresse = request.getParameter("adresse");
            String cpostal = request.getParameter("cpostal");
            String ville = request.getParameter("ville");
            return null;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Requete createSejour(ServletRequest request, ServletResponse response) {

        return null;
    }
}
