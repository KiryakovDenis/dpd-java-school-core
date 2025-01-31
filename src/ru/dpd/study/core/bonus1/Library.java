package ru.dpd.study.core.bonus1;

import ru.dpd.study.core.bonus1.exception.BookNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        this.books.add(book);
    }

    public Book findBookByTitle(String title) {
        return this
                .books
                .stream()
                .filter(b -> b.getTitle().equals(title))
                .findFirst()
                .orElseThrow(BookNotFoundException.create(title));
    }

    public List<Book> availableBooks() {
        return this.books.stream().filter(Book::isAvailable).toList();
    }

    public List<Book> getBooks() {
        return books;
    }
}
