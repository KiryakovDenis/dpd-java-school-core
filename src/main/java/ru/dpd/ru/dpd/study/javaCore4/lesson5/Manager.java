package ru.dpd.ru.dpd.study.javaCore4.lesson5;

import java.math.BigDecimal;

public class Manager extends Employee{
    private String department;

    public Manager(String name, BigDecimal salary) {
        super(name, salary);
    }

    public Manager(String name, BigDecimal salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void work() {
        System.out.println("I'm a Batman!!!");
    }

    @Override
    public String toString() {
        return super.toString() + ";\n Manager{" +
                "department='" + department + '\'' +
                '}';
    }
}
