package ru.dpd.ru.dpd.study.javaCore4.lesson1;
/**
 * @author KiryakovDenis
 * @since  0.0.0.1
 *
 * Класс велосипед создан в рамках задания 1 на 5 уроке по JavaCore.
 * В классе реализованы конструктор определяющий значения полей и метод move().
 */
public class Bicycle extends Vehicle{

    public Bicycle(){
        this.setModel("Аист");
        this.setYear(1975);
    }

    @Override
    public void move() {
        System.out.println("Ветер в харю, я в кювет - я люблю велосипед!!!");
    }

}
