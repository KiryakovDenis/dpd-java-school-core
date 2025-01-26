package ru.dpd.ru.dpd.study.javaCore4.lesson2;

/**
 * @author KiryakovDenis
 * @since  0.0.0.1
 * Реализация класса прямоугольник в рамках задания 2 на 5 уроке по JavaCore
 * Прямоугольник задается через длины двух соседних сторон.
 * Реализован метод toString
 */
public class Rectangle implements IShape{
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public Double area() {
        return width * height;
    }

    @Override
    public String toString() {
        return String.format("Прямоугольник со сторонами %s и %s", this.width, this.height);
    }
}
