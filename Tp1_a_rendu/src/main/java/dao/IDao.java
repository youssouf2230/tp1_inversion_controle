package dao;
import ext.Book;

import java.util.List;

public interface IDao {
    void add(Book book);
    Book findByTitle(String title);
    List<Book> findAll();
}
