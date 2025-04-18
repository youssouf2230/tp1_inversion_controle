package metier;

import dao.ICompteBancaireDao;

public interface IMetier {
    void effectuerVersement(double montant);
    void effectuerRetrait(double montant);
    double consulterSolde();
    void afficher();


}
