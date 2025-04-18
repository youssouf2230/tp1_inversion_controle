package ext;
import dao.IDao;
import ext.Book;
import java.util.Arrays;
import java.util.List;

class DaoImplV1 implements IDao {
    @Override
    public void add(Book book) {
        System.out.println("Ajout simulé (V1)");
    }

    @Override
    public Book findByTitle(String title) {
        return new Book(title, "Auteur V1");
    }

    @Override
    public List<Book> findAll() {
        return Arrays.asList(
                new Book("Livre A", "Auteur A"),
                new Book("Livre B", "Auteur B")
        );
    }
}
