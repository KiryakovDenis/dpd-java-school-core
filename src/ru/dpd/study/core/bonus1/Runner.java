package ru.dpd.study.core.bonus1;

import ru.dpd.study.core.bonus1.exception.BookIsBorrowedException;
import ru.dpd.study.core.bonus1.exception.BookNotFoundException;

public class Runner {

    public static void main(String[] args) {
        /**Создаем библиотечный фонд имени Айзека Азимова*/
        Library library = new Library();
        library.addBook(new Book("Прелюдия к Основанию","Айзек Азимов", 1988));
        library.addBook(new Book("Путь к Основанию","Айзек Азимов", 1993));
        library.addBook(new Book("Основание","Айзек Азимов", 1951));
        library.addBook(new Book("Основание и Империя","Айзек Азимов", 1952));
        library.addBook(new Book("Второе Основание","Айзек Азимов", 1953));
        library.addBook(new Book("Кризис Основания","Айзек Азимов", 1982));
        library.addBook(new Book("Основание и Земля","Айзек Азимов", 1987));
        library.addBook(new Book("Я, робот","Айзек Азимов", 1950));
        library.addBook(new Book("Стальные пещеры","Айзек Азимов", 1954));

        /*Найдем книгу и попробуем ее взять*/
        Book book = library.findBookByTitle("Я, робот");
        if (book.isAvailable()) {
            book.borrow();
            System.out.printf("Книга \"%S\" выдана на руки читателю", book.getTitle());
        }
        /*Попробуем повторно взять книгу, которая находится на руках*/
        try {
            library.findBookByTitle("Я, робот").borrow();
        } catch (BookIsBorrowedException | BookNotFoundException e) {
            System.out.println(e.getMessage());
        }

        /*Попробуем взять несуществующую книгу*/
        try {
            library.findBookByTitle("Несуществующая книга").borrow();
        } catch (BookIsBorrowedException | BookNotFoundException e) {
            System.out.println(e.getMessage());
        }

        /**Отобразим все книги в библиотеке*/
        System.out.println("Список книг библиотечного фонда");
        library.getBooks().forEach(System.out::println);

    }
}
