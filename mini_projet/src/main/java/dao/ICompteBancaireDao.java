package dao;

public interface ICompteBancaireDao {
    void versement(double montant);
    double retrait(double montant);
    void afficher();
}
