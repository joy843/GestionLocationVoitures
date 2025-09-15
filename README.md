# Projet JavaFX – Conception et Développement d’un Système Interactif

Projet réalisé dans le cadre du cours **INF1034-00 – Introduction aux interfaces utilisateur** 
L’objectif n’était pas uniquement de coder, mais de comprendre et d’appliquer une **démarche de conception centrée sur l’utilisateur** :

- analyser un besoin,  
- définir des *personas* et des *user-stories*,  
- concevoir des interfaces avec JavaFX,  
- tester avec de vrais utilisateurs,  
- appliquer des correctifs et itérer.  

Ce projet m’a permis de vivre l’expérience complète allant de **l’idée au système fonctionnel**, en intégrant design, accessibilité et retours utilisateurs.

## Démarche suivie

### 1. Storytelling et analyse
Nous avons démarré par une approche **storytelling** pour donner vie au projet :  

- Création de **12 personas** (profils utilisateurs réalistes).  
- Écriture de **8 user-stories** (« En tant que…, je veux…, afin de… »).  
- Identification des premières fonctionnalités et contraintes.  

 Cette phase a permis de valider que notre idée répondait à de vrais besoins utilisateurs.

### 2. Conception des interfaces
À partir de l’analyse, nous avons conçu :  

- **8 wireframes** pour poser visuellement nos idées.  
- Une **charte visuelle** (cohérence des couleurs, tailles de texte, navigation clavier).  
- L’identification de contraintes techniques (liste de données, temps de traitement, persistance).  

Chaque interface devait :  
- être claire dès les **5 premières secondes**,  
- supporter la **navigation clavier et l’accessibilité**,  
- respecter l’architecture **MVC** et le patron **Observateur**.  

### 3. Développement avec JavaFX
Nous avons implémenté **4 interfaces fonctionnelles** :  

- **Login / Inscription** : authentification des utilisateurs.  
- **Catalogue** : consultation des éléments disponibles.  
- **Réservation et paiement**.  
- **Historique** : consultation des actions passées.  

Caractéristiques techniques :  
- Architecture **MVC** (séparation modèle / vue / contrôleur).  
- Patron **Observateur** pour la réactivité des vues.  
- Accessibilité intégrée : navigation clavier, fonction annuler/répéter, taille du texte adaptable.  

### 4. Tests et évaluations utilisateurs
Les interfaces ont été évaluées avec plusieurs méthodes :  

- **Test des 5 secondes** (24 passations) → mesurer la compréhension immédiate.  
- **Tests utilisateurs** (8 passations) → vérifier la fluidité des scénarios réels.  
- **Évaluation experte** (4 passations) → revue croisée des interfaces entre membres de l’équipe.  

Ces tests ont révélé des forces (simplicité, logique de navigation) et des faiblesses (contraste de certains boutons, surcharge de texte).

### 5. Correctifs appliqués
À partir des résultats des tests, nous avons :  

- amélioré le contraste visuel et les couleurs,  
- simplifié certains libellés,  
- clarifié la disposition des écrans,  
- ajouté un guidage explicite pour les nouveaux utilisateurs.  

## Résultat final
À la fin du projet, nous avons livré :  

- Un **système JavaFX fonctionnel** avec plusieurs interfaces intégrées.  
- Une **documentation complète** (personas, user-stories, wireframes, analyses de tests).  
- Une **vidéo de démonstration** montrant les fonctionnalités principales.  

---

## Ce que j’ai appris

- Comment utiliser le **storytelling** et les **personas** pour concevoir une interface pertinente.  
- L’importance des **tests utilisateurs** et des retours pour améliorer un produit.  
- Les principes de l’**architecture MVC** et du **patron Observateur** dans JavaFX.  
- Travailler en **équipe** sur un projet structuré, de la conception au code.  

## Exécution du projet

utiliser de préference
- Java 17+   
- JavaFX SDK  

### Commandes
```bash
git clone 
cd GestionLocationVoitures
mvn clean install
mvn javafx:run
