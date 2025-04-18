package dao;

import org.springframework.stereotype.Component;

@Component("comptebancaire")
public class CompteBancaireImpl implements ICompteBancaireDao {
    private int idCompteBancaire;
    private String nom;
    private String prenom;
    private String adresse;
    private double solde;
    public CompteBancaireImpl() {}

    @Override
    public void afficher() {
        System.out.println("Id du compte : "+ this.idCompteBancaire);
        System.out.println("Nom du client : "+ this.nom);
        System.out.println("Prenom du client : "+ this.prenom);
        System.out.println("Adresse du client : "+ this.adresse);
        System.out.println("Solde du compte : "+ this.solde);
    }

    @Override
    public void versement(double montant) {
        this.solde = this.solde + montant;
    }

    @Override
    public double retrait(double montant) {
        this.solde = this.solde - montant ;
        System.out.println("Le retrait de "+ montant+"dh est effectué avec succès!");
        return this.solde;
    }

    public int getIdCompteBancaire() {
        return idCompteBancaire;
    }

    public void setIdCompteBancaire(int idCompteBancaire) {
        this.idCompteBancaire = idCompteBancaire;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
