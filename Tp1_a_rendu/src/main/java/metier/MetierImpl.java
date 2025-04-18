package metier;

import dao.IDao;
import ext.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("metier")
public class MetierImpl implements IMetier {

    @Autowired
    private IDao dao;

    @Override
    public void ajouterLivre(String titre, String auteur) {
        Book book = new Book(titre, auteur);
        dao.add(book);
        System.out.println("📘 Livre ajouté : " + titre);
    }

    @Override
    public void emprunterLivre(String titre) {
        Book book = dao.findByTitle(titre);
        if (book != null && book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("✅ Livre emprunté : " + titre);
        } else {
            System.out.println("❌ Livre indisponible ou inexistant.");
        }
    }

    @Override
    public void retournerLivre(String titre) {
        Book book = dao.findByTitle(titre);
        if (book != null) {
            book.setAvailable(true);
            System.out.println("🔄 Livre retourné : " + titre);
        }
    }

    @Override
    public void afficherLivres() {
        for (Book book : dao.findAll()) {
            System.out.println("📚 " + book.getTitle() + " - " + (book.isAvailable() ? "Disponible" : "Emprunté"));
        }
    }
}
