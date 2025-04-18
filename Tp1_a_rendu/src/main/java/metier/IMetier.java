package metier;

public interface IMetier {
    void ajouterLivre(String titre, String auteur);
    void emprunterLivre(String titre);
    void retournerLivre(String titre);
    void afficherLivres();
}

