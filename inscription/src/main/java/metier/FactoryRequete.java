package metier;

import utils.NomRequete;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.UnsupportedEncodingException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class FactoryRequete {
    public static Requete createActivite(ServletRequest request, ServletResponse response) {
        try {
            Requete requete = new Requete();
            requete.setNom(NomRequete.INSERT_ACTIVITE.name());

            Activite activite = new Activite();

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            response.setContentType("text/html;charset=UTF-8");

            String codeSport = request.getParameter("codeSport");
            String libelle = new String(request.getParameter("libelle").getBytes(), "UTF-8");

            String dateJourString = request.getParameter("dateJour");
            SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
            java.util.Date initDate = format.parse(dateJourString);
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            String parsedDate = formatter.format(initDate);
            initDate = formatter.parse(parsedDate);
            Date dateJour = new Date(initDate.getTime());

            String nbLoc = request.getParameter("nbLoc");
            String numSej = request.getParameter("numSej");

            activite.setCodeSport(Integer.parseInt(codeSport));
            activite.setLibelle(libelle);
            activite.setDateJour(dateJour);
            activite.setNbLoc(Short.parseShort(nbLoc));
            activite.setNumSej(Integer.parseInt(numSej));

            requete.setDto(activite);

            return requete;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
