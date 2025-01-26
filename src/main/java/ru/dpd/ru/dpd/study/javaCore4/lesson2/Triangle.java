package ru.dpd.ru.dpd.study.javaCore4.lesson2;


/**
 * @author KiryakovDenis
 * @since  0.0.0.1
 * Реализация класса треугольник в рамках задания 2 на 5 уроке по JavaCore
 * Треугольник задается через длины трех сторон, реализована проверка на возможность существование треугольника.
 * Площадь треугольника рассчитывается по формуле Герона*/
public class Triangle implements IShape{
    private Double a;
    private Double b;
    private Double c;

    public Triangle(Double a, Double b, Double c) throws Exception {
        this.a = a;
        this.b = b;
        this.c = c;

        this.validate();
    }

    private void validate(Double a, Double b, Double c) throws Exception {
        if (!(a + b > c) || !(a + c > b) || !(b + c > a)) {
            throw new Exception(String.format("Треугольник со длинами сторон %s, %s и %s - не может существовать.", this.a, this.b, this.c));
        }
    }

    private void validate() throws Exception {
        this.validate(this.a, this.b, this.c);
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) throws Exception {
        this.a = a;
        this.validate();
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) throws Exception {
        this.b = b;
        this.validate();
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) throws Exception {
        this.c = c;
        this.validate();
    }

    @Override
    public Double area() {
        double semiperimeter = (this.a + this.b + this.c) / 2;

        return Math.sqrt(
                semiperimeter * (semiperimeter - a) +
                semiperimeter * (semiperimeter - b) +
                semiperimeter * (semiperimeter - c)
        );
    }

    @Override
    public String toString() {
        return String.format("Треугольник со сторонами %s, %s и %s", this.a, this.b, this.c);
    }
}
