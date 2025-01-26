package ru.dpd.ru.dpd.study.javaCore4.lesson1;
/**
 * @author KiryakovDenis
 * @since  0.0.0.1
 *
 * Абстрактный класс Vehicle создан в рамках задания 1 на 5 уроке по JavaCore
 * в класс добавлены поля model и year, их геттеры и сеттеры. Также реализован метод toString.
 * Определен абстрактный метод move().
 */
public abstract class Vehicle {
    private String model;
    private Integer year;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public abstract void move();

    @Override
    public String toString() {
        return String.format("%s (%s): %n", this.getModel(), this.getYear());
    }
}
