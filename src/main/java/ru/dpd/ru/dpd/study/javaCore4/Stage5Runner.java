package ru.dpd.ru.dpd.study.javaCore4;

import ru.dpd.ru.dpd.study.javaCore4.lesson1.Bicycle;
import ru.dpd.ru.dpd.study.javaCore4.lesson1.Car;
import ru.dpd.ru.dpd.study.javaCore4.lesson1.Vehicle;
import ru.dpd.ru.dpd.study.javaCore4.lesson2.Circle;
import ru.dpd.ru.dpd.study.javaCore4.lesson2.Shape;
import ru.dpd.ru.dpd.study.javaCore4.lesson2.Triangle;
import ru.dpd.ru.dpd.study.javaCore4.lesson3.BankAccount;
import ru.dpd.ru.dpd.study.javaCore4.lesson4.Addition;
import ru.dpd.ru.dpd.study.javaCore4.lesson4.Division;
import ru.dpd.ru.dpd.study.javaCore4.lesson4.Multiplication;
import ru.dpd.ru.dpd.study.javaCore4.lesson4.Operation;
import ru.dpd.ru.dpd.study.javaCore4.lesson5.Developer;
import ru.dpd.ru.dpd.study.javaCore4.lesson5.Employee;
import ru.dpd.ru.dpd.study.javaCore4.lesson5.Manager;

import java.math.BigDecimal;

public class Stage5Runner {
    public static final String STR_SPLITTER = "===========================================";

    public static void run() throws Exception {
        System.out.println();
        System.out.println();
        System.out.println("УРОК 4");
        System.out.println(STR_SPLITTER);
        System.out.println("Упражнение 1");
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();
        System.out.println(car);
        car.move();
        System.out.println();
        System.out.println(bicycle);
        bicycle.move();
        System.out.println();

        System.out.println("Упражнение 2");
        Shape circle = new Circle(1.0);
        System.out.println(circle);
        System.out.printf("Площадь = %s%n", circle.area());

        Shape rect = new ru.dpd.ru.dpd.study.javaCore4.lesson2.Rectangle(1.0, 2.0);
        System.out.println(rect);
        System.out.printf("Площадь = %s%n", rect.area());

        Shape triangle;
        try {
            triangle = new Triangle(1.0, 5.0, 3.0);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            triangle = new Triangle(4.0, 5.0, 3.0);
            System.out.println(triangle);
            System.out.printf("Площадь = %s%n", triangle.area());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println();

        System.out.println("Упражнение 3");
        BankAccount bankAccount;
        try {
            bankAccount = new BankAccount("1234567890");
            System.out.println(bankAccount);
        } catch (Exception e){
            throw e;
        }

        try {
            bankAccount.deposit(new BigDecimal(1000));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(bankAccount);
        try {
            bankAccount.deposit(new BigDecimal(-1000));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(bankAccount);

        try {
            bankAccount.withdraw(new BigDecimal(900));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(bankAccount);

        try {
            bankAccount.withdraw(new BigDecimal(-900));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(bankAccount);

        try {
            bankAccount.deposit(new BigDecimal(900));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(bankAccount);

        try {
            bankAccount = new BankAccount("1234567891", new BigDecimal(-100));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(bankAccount);

        try {
            bankAccount = new BankAccount("1234567891", new BigDecimal(100));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println();

        System.out.println("Упражнение 4");
        Operation a;
        a = new Addition();
        System.out.printf("2 + 3  = %s%n", a.execute(2, 3));
        a = new Division();
        System.out.printf("2 - 3  = %s%n", a.execute(2, 3));
        a = new Multiplication();
        System.out.printf("2 * 3  = %s%n", a.execute(2, 3));
        a = new Division();
        System.out.printf("2 / 3  = %s%n", a.execute(2, 3));
        try{
            System.out.printf("2 / 0  = %s%n", a.execute(2, 0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        System.out.println("Упражнение 5");
        Employee emp = new Employee("Иванов И.И.", new BigDecimal(100000));
        System.out.println(emp);
        emp.work();
        Employee man = new Manager("Петров П.П.", new BigDecimal(500000), "Департамент околовсяческих обязанностей");
        System.out.println(man);
        man.work();
        Employee dev = new Developer("Сидоров С.С.", new BigDecimal(1000000), "FORTRAN-86");
        System.out.println(dev);
        dev.work();
        System.out.println();

        System.out.println(STR_SPLITTER);
    }
}
