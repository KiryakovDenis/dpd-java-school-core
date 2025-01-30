package ru.dpd.study.core.bonus1;

import ru.dpd.study.core.bonus1.exception.BookIsBorrowedException;

public class Book {
    private String title;
    private String author;
    private Integer year;
    private Boolean isBorrowed;

    public Book(String title, String author, Integer year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isBorrowed = false;
    }

    public void borrow() {
        //Перед выдачей книги необходимо проверить не была ли она выдана ранее
        if (!isBorrowed) {
            this.isBorrowed = true;
        } else {
            throw new BookIsBorrowedException();
        }
    }

    public void returnBook() {
        this.isBorrowed = false;
    }

    public boolean isAvailable() {
        return !this.isBorrowed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", isBorrowed=" + isBorrowed +
                '}';
    }

    public String getTitle() {
        return title;
    }
}
