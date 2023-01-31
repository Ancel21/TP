#@author: Ancel Nkamngang
--------------------------------------------------------------------------------------------------------

Lien Github: 

----------TP3: DM noté: REALISATION D'UNE APPLICATION WEB AVEC SPRING BOOT------------


Nous avons généré notre projet maven et avons ajouté les dépendances suivantes:
Web, JPA, Hibernate, H2, DevTools, Thymeleaf.

- Web:  permet de développer des applications web en utilisant des technologies telles que le protocole HTTP, 
les pages HTML et les contrôleurs REST. Cette dépendance inclut les bibliothèques nécessaires pour créer des
 applications web avec Spring Boot et facilite la gestion des dépendances grâce à Maven.

- JPA: fournit un cadre pour mapper les objets Java aux tables de bases de données relationnelles, 
ce qui permet de gérer les opérations CRUD (Create, Read, Update, Delete) sur les données de manière transparente.

- Hibernate: implémente la spécification JPA (Java Persistence API) pour mapper les objets Java aux tables de bases de données relationnelles, 
ce qui permet de gérer les opérations CRUD (Create, Read, Update, Delete) sur les données de manière transparente. 
Hibernate fournit également des fonctionnalités supplémentaires telles que la gestion des sessions, 
la gestion des transactions et l'optimisation des requêtes en base de données

- H2:  bibliothèque de base de données relationnelle en mémoire pour Java. Elle peut être utilisée pour le développement et 
les tests dans un projet Spring Boot en raison de sa rapidité et de sa facilité d'utilisation

- DevTools: inclut un certain nombre d'outils et de fonctionnalités qui peuvent accélérer et simplifier le développement d'applications. 
Par exemple, elle permet de redémarrer automatiquement l'application lorsqu'un fichier source est modifié, 
ce qui peut économiser beaucoup de temps 

- Thymeleaf : permet de générer du HTML en utilisant des modèles et des données provenant du serveur,
 ce qui facilite la séparation du code HTML et du code Java.

-------------------------------------------------------------------------------------------------------------

Etape 13:

1- L'URL d'appel "/greeting" est paramétrée avec l'annotation "@GetMapping("/greeting")" qui se trouve sur la méthode "greeting". 
Cette annotation définit une correspondance entre une requête HTTP GET et la méthode "greeting"

2- Le fichier HTML à afficher est choisi avec la ligne de code "return "greeting";". 
Cette ligne de code retourne le nom de la vue "greeting". 

3-  Le nom à qui nous disons bonjour est envoyé en tant que paramètre dans l'URL lorsque le second lien est cliqué

-------------------------------------------------------------------------------------------------------------

Etape 17:

Après avoir ajouté notre première classe et relancé notre application, on constate que la table Address a été créé et
est présente sur notre console. Ceci est possible grâce à la dépendance Hibernate de spring qui permet d'associer les
classes à des tables d'une base de données relationnelle et de gerer la persistance des données.

------------------------------------------------------------------------------------------------------------

Etape 20

Lorsque l'on fait un select sur la table adress, on peut bien voir le contenu du data.sql

------------------------------------------------------------------------------------------------------------

Etape 22

L'annotation "@Autowired" utilisée dans le code précédent permet d'effectuer une injection de dépendance automatique à
partir de la classe AddressRepository

-------------------------------------------------------------------------------------------------------------

Etape 30

Pour rajouter boostsrap, 


----------TP4: DM noté: UTILISATION D'API WEB AVEC SPRING BOOT------------

Etape 6 

- Pour 








