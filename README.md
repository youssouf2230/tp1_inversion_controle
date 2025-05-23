# tp1_inversion_controle
Rendre un compte rendu en reprenant l'exemple traité dans les vidéos des deux dernières séances

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
2- En utilisant les annotations
3- Possibilité d'injection via :
    a- Le constructeur
    b- Le Setter
    c- Attribut (accès direct à l'attribut : Field)

   


