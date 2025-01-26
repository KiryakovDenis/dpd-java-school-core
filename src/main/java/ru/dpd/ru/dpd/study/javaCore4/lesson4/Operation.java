package ru.dpd.ru.dpd.study.javaCore4.lesson4;

/**
 * @author KiryakovDenis
 * @since 0.0.0.1
 *
 * Задача 4: "Калькулятор"
 *
 * Создайте абстрактный класс Operation с методом execute(int a, int b).
 * Реализуйте подклассы Addition, Subtraction, Multiplication и Division, каждый из которых переопределяет метод execute().
 * */
public abstract class Operation {
    public abstract float execute(int a, int b) throws Exception;
}
