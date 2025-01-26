package ru.dpd.ru.dpd.study.javaCore4.lesson5;

import java.math.BigDecimal;
/**
 * @author KiryakovDenis
 * @since 0.0.0.1
 *
 *
 * ### Задача 5: "Работяги"
 * Создайте класс Employee с полями name, salary и методом work(), который выводит сообщение о том, что сотрудник работает.
 * */
public class Employee {
    private String name;
    private BigDecimal salary;

    public Employee(String name, BigDecimal salary){
        this.name = name;
        this.salary = salary;
    }

    public void work(){
        System.out.println("Работаю свою работу.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
