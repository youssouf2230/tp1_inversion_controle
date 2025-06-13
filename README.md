# tp1_inversion_controle
# Introduction
       Au cours de cette activité, notre objectif a été de découvrir et de manipuler le concept d’injection de dépendances, élément clé de l’architecture des applications professionnelles.
      L’injection de dépendances consiste à rendre le code plus flexible, maintenable et testable en séparant la création des objets de leur utilization.
      Au travers de cas pratiques, et en utilisant le framework Spring, le mapping XML, les annotations, et même en développant notre propre mini framework d’injection, ce travail illustre le fonctionnement de l’inversion de contrôle (IOC) afin d’améliorer le couplage de notre application.
      Objectif
# L'objectif de ce projet consiste donc à :

      Comprendre le fonctionnement de l’injection de dépendances.
   
      Mettre en place l’injection de dépendances de différentes manières :
   
      Par instanciation statique
   
      Par instanciation dynamique
   
      Avec Spring (à partir d'un fichier de configuration XML et avec des annotations).
   
      Développer notre propre mini framework d’injection de dépendances, afin de démontrer que l’on a assimilé le concept de l’inversion de contrôle.
   
      Expérimenter les méthodes d’injection (constructeur, setter, attribut) afin de voir leur pertinence dans divers cas d’étude.
# Partie 1 : (Voir support et vidéo)
1. Créer l'interface IDao avec une méthode getData
   ![image](https://github.com/user-attachments/assets/4b57f08f-1ce0-415b-88c9-d0022afe0b6b)
3. Créer une implémentation de cette interface
      ![image](https://github.com/user-attachments/assets/96ef9118-0de9-47c0-bd17-9f0c97996f2f)
5. Créer l'interface IMetier avec une méthode calcul
   ![image](https://github.com/user-attachments/assets/100cfbd5-629b-4c7d-99dd-331fef3c831d)

7. Créer une implémentation de cette interface en utilisant le couplage faible
   ![image](https://github.com/user-attachments/assets/f6e3c855-dede-41fc-aa05-b27ddd96cb99)

9. Faire l'injection des dépendances :
     a. Par instanciation statique
     b. Par instanciation dynamique
     c. En utilisant le Framework Spring
          - Version XML
          - Version annotations

Partie 2 : Mini Projet (Framework Injection des dépendance)
Développer un mini Framework qui permet de faire l'injection des dépendances avec ses deux version XML et Annotations
Concevoir et créer un mini Framework d'injection des dépendances similaire à Spring IOC
Le Framework doit permettre à un programmeur de faire l'injection des dépendances entre les différents composant de son application respectant les possibilités suivantes : 
1- A travers un fichier XML de configuration en utilisant Jax Binding (OXM : Mapping Objet XML)
![image](https://github.com/user-attachments/assets/4fc83693-8a5c-4ef1-8a33-2bfe0203b357)

2- En utilisant les annotations
![image](https://github.com/user-attachments/assets/f2c4d668-966c-44f5-ba06-f473466c4531)

3- Possibilité d'injection via :
    a- Le constructeur
    
    b- Le Setter
    c- Attribut (accès direct à l'attribut : Field)
# Conclusion
      Au terme de ce projet, nous avons réussi à :
      
      Mettre en place l’injection de dépendances de manière statique, dynamique, et avec Spring, que ce soit par fichier de configuration XML, par annotations, par constructeur, par setter, ou par attribut.
      
      Créer notre propre mini framework d’injection de dépendances, ce qui a renforcé notre maîtrise des concepts fondamentaux de l’inversion de contrôle.
      
      Mieux appréhender le fonctionnement de Spring et de l’injection de dépendances, afin de rendre le code plus flexible, plus maintenable, et plus facilement testable.
      
      Respecter le processus de développement professionnel, en utilisant Git de manière itérative, en laissant des messages de commits pertinents, et en utilisant le README.md afin de rendre compte de notre activité.
         
      
      
