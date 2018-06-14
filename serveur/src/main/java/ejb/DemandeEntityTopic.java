package ejb;

import metier.Activite;
import metier.Requete;
import service.EnregistreEntity;
import utils.EcritureErreur;
import utils.NomRequete;

import javax.annotation.Resource;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.ejb.MessageDrivenContext;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

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
                    switch (NomRequete.valueOf(requete.getNom())) {
                        case INSERT_ACTIVITE:
                            entity = FactoryEntity.createActivite((Activite) requete.getDto());
                            break;
                    }

                    if (entity != null) {
                        EnregistreEntity enregistreEntity = new EnregistreEntity();
                        enregistreEntity.insert(entity);
                    }
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
