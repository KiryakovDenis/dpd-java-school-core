package ru.dpd.ru.dpd.study.javaCore4.lesson5;

import java.math.BigDecimal;

public class Developer extends Employee{
    private String Programminglanguage;

    public Developer(String name, BigDecimal salary) {
        super(name, salary);
    }

    public Developer(String name, BigDecimal salary, String programminglanguage) {
        super(name, salary);
        Programminglanguage = programminglanguage;
    }

    public String getProgramminglanguage() {
        return Programminglanguage;
    }

    public void setProgramminglanguage(String programminglanguage) {
        Programminglanguage = programminglanguage;
    }

    @Override
    public String toString() {
        return  super.toString() + ";\n Developer{" +
                "Programminglanguage='" + Programminglanguage + '\'' +
                '}';
    }

    @Override
    public void work() {
        System.out.println("Я программист, я делаю на клавиатуре клац-клац");
    }
}
