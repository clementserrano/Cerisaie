# Cerisaie

### Développeurs
- Bastien JACOUD
- Victor REMOND
- Clément SERRANO
- Martial TARDY

### Prérequis
- Installer Node v10.1.0

### Pour déployer l'application
- Se placer dans **/client** et lancer la commande suivante pour installer les **/node_modules**
````
npm install
````
- Puis lancer la commande suivante pour build l'application Angular en mode production, et placer son contenu dans le dossier **/resources/static** de la partie serveur.
````
npm run build
````

Les commandes suivantes sont alors exécutées (visibles dans **package.json**) :

```ng build --prod``` pour build l'application Angular

```npm run deploy``` pour exécuter les commandes suivantes

```rimraf ../serveur/src/main/resources/static && mkdirp ../serveur/src/main/resources/static``` pour créer le répertoire static

```cd dist/client && copyfiles \"./**\" ../../../serveur/src/main/resources/static``` pour copier le contenu qui vient d'être build


- Se placer dans **/serveur** et lancer la commande suivante pour compiler le JAR de l'application
````
./mvnw clean install
````
- Exécuter le JAR situé dans **/server/target**
````
java -jar projetoeuvre-0.0.1-SNAPSHOT.jar
````

- Ouvrir votre navigateur préféré sur **[http://localhost:8080](http://localhost:8080)** et voilà !

### Notes

L'application utilise **Angular 6.0.3** et **Spring Boot 2.0**.

Le serveur est un REST API qui écoute sur **http://localhost:8080/api**.

Si vous n'arrivez pas à build l'application, un JAR compilé est disponible à la racine du projet, **/gestion_app**.

## Développement

### Spring (dans /server)

Pour lancer le serveur
```
./mvnw spring-boot:run
```

### Angular (dans /client)

Pour lancer le client
```
npm start
```

Pour créer un nouveau component angular
```
ng g c nom-component
```

Pour créer un nouveau service angular
```
ng g s shared/nom-service/nom-service
```
