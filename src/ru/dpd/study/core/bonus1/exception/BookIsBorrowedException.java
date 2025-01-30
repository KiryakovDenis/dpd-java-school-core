package ru.dpd.study.core.bonus1.exception;

public class BookIsBorrowedException extends RuntimeException{
    public BookIsBorrowedException () {
        super("Книга находится на руках у читателя.");
    }
}
