package ru.dpd.ru.dpd.study.javaCore4.lesson2;

/**
 * @author KiryakovDenis
 * @since  0.0.0.1
 * Реализация класса окружность в рамках задания 2 на 5 уроке по JavaCore
 * Окружность задается через радиус.
 * Реализован метод toString
 */
public class Circle implements Shape {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Окружность(" +
                "радиус=" + this.radius +
                '}';
    }
}
