# Cerisaie

Prérequis pour JMS : 

#### Attention

Ouvrez le projet sur Intellij, ne créez pas de projet à partir des sources.
Modifiez seulement si nécessaire le chemin vers Wildly (par défaut "C:\wildfly-12.0.0.Final"), dans les dépendances et dans l'artifact du serveur.

Faites Build > Rebuild Project sur Intellij avant de lancer.

#### Rajouter dans le standalone.xml 

- La datasource : (il faut monter le connecteur mysql)

```xml
<datasource jta="true" jndi-name="java:/DSCerisaie" pool-name="DSCerisaie" enabled="true" use-ccm="true">
    <connection-url>jdbc:mysql://localhost:3306/cerisaie</connection-url>
    <driver-class>com.mysql.jdbc.Driver</driver-class>
    <driver>mysql</driver>
    <security>
        <user-name>userepul</user-name>
        <password>epul</password>
    </security>
    <validation>
        <validate-on-match>false</validate-on-match>
        <background-validation>false</background-validation>
    </validation>
    <timeout>
        <set-tx-query-timeout>false</set-tx-query-timeout>
        <blocking-timeout-millis>0</blocking-timeout-millis>
        <idle-timeout-minutes>0</idle-timeout-minutes>
        <query-timeout>0</query-timeout>
        <use-try-lock>0</use-try-lock>
        <allocation-retry>0</allocation-retry>
        <allocation-retry-wait-millis>0</allocation-retry-wait-millis>
    </timeout>
    <statement>
        <share-prepared-statements>false</share-prepared-statements>
    </statement>
</datasource>
```

- Le topic :

```xml
<jms-topic name="InscriptionJmsTopic" entries="java:jboss/exported/topic/InscriptionJmsTopic"/>
```

#### Lancer bin/add-user.bat

Rajouter jmsuser/jmsepul98! dans le groupe guest.