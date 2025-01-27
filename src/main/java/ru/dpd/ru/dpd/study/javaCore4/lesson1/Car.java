package ru.dpd.ru.dpd.study.javaCore4.lesson1;
/**
 * @author KiryakovDenis
 * @since  0.0.0.1
 *
 * Класс автомобиль создан в рамках задания 1 на 5 уроке по JavaCore.
 * В классе реализованы конструктор определяющий значения полей и метод move().
 */
public class Car extends Vehicle {
    public Car(){
        this.setModel("ВАЗ 2101");
        this.setYear(1984);
    }

    @Override
    public void move() {
        System.out.println("На дороге не наглей-ка!\n" +
                "Видишь мчится там «Копейка»?!\n" +
                "Не подрежь ее случайно,\n" +
                "Вдруг в ней тормоз барахлит?\n" +
                "И тогда черезвычайно\n" +
                "Она в зад тебе влетит.");
    }
}