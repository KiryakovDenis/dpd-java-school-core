package ru.dpd.study.core.bonus1.exception;

import java.util.function.Supplier;

public class BookNotFoundException extends RuntimeException {
    public static Supplier<BookNotFoundException> create(String title) {
        return () -> new BookNotFoundException(title);
    }
    public BookNotFoundException(String title) {
        super(String.format("Книга \"%S\" - не обнаружена в библиотечном фонде", title));
    }
}
