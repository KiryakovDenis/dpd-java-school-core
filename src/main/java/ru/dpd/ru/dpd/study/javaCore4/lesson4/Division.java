package ru.dpd.ru.dpd.study.javaCore4.lesson4;

public class Division extends Operation{
    @Override
    public float execute(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("Деление на ноль");
        }
        return a / b;
    }
}
