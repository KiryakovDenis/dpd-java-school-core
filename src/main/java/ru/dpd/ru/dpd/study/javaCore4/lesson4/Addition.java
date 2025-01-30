package ru.dpd.ru.dpd.study.javaCore4.lesson4;

/**
 * @author KiryakovDenis
 * @since 0.0.0.1
 *
 * Задача 4: "Калькулятор"
 * Реализуйте подклассы Addition, Subtraction, Multiplication и Division, каждый из которых переопределяет метод execute().
 * */
public class Addition extends Operation {
    @Override
    public float execute(int a, int b) {
        return a + b;
    }
}
