package metier;

import dao.ICompteBancaireDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class GesttionCompteImplMetier implements IMetier {

    @Autowired
    @Qualifier("comptebancaire")
    private ICompteBancaireDao compteDao;

    @Override
    public void effectuerVersement(double montant) {
        compteDao.versement(montant);
    }

    @Override
    public void effectuerRetrait(double montant) {
        compteDao.retrait(montant);
    }


    @Override
    public double consulterSolde() {
        // On suppose que le DAO garde le solde à jour
        return compteDao.retrait(0);
    }

    @Override
    public void afficher() {
        compteDao.afficher();
    }
}
