# Projet Oeuvre

### Développeurs
- Bastien JACOUD
- Victor REMOND
- Clément SERRANO

### Prérequis
- Installer Node v9.1.0

### Pour déployer l'application
- Se placer dans **/client** et lancer la commande suivante pour installer les **/node_modules**
````
npm install
````
- Puis lancer la commande suivante pour build l'application Angular
````
ng build -prod
````
- Se placer dans **/server** et lancer la commande suivante pour compiler le JAR de l'application
````
mvnw clean install
````
- Exécuter le JAR situé dans **/server/target**
````
java -jar projetoeuvre-0.0.1-SNAPSHOT.jar
````
- Ouvrir votre navigateur préféré sur **[http://localhost:8080](http://localhost:8080)** et voilà !

### Notes

L'application utilise **Angular 5** et **Spring Boot 2.0**.

Le serveur est un REST API qui écoute sur **http://localhost:8080/api**.

La configuration Maven du serveur copie les fichiers build dans **/client/dist** pour les mettre dans
**server/target/classes/static/**.

Si vous n'arrivez pas à build l'application, un JAR compilé est disponible à la racine du projet.

## Développement

### Spring (dans /server)

Pour lancer le serveur
```
mvnw spring-boot:run
```

### Angular (dans /client)

Pour lancer le client
```
npm start
```

Pour créer un nouveau component
```
ng g c nom-component
```

Pour créer un nouveau service
```
ng g s shared/nom-service/nom-service
```
