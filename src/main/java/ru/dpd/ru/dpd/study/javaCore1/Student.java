package ru.dpd.ru.dpd.study.javaCore1;

import java.util.Arrays;

/**
 * Упражнение 4
 * Создать класс Student. Поля (name, studentId, grades (массив оценок)).
 * Реализовать методы:
 * 1) метод calculateAverage(), который вернет средний балл студента
 * 2) addGrade(int grade), который добавляет оценку в массив
 * Пусть студент может получить за учебный период не более 100 оценок
 * */
public class Student {
    private Long studentId;
    private String name;
    private Integer[] grades = new Integer[100];
    private Integer size = 0;

    public Student (Long studentId, String name, Integer[] grades) {
        this.studentId = studentId;
        this.name = name;
        this.grades = grades;
    }

    public double calculateAverage() {
        if (this.grades == null) {
            return 0;
        }
        else {
            return Arrays
                    .stream(this.grades)
                    .mapToInt(Integer::intValue)
                    .average()
                    .orElse(0);
        }
    }

    public void addGrade(Integer grade) {

        if (this.size < this.grades.length) {
            this.grades[this.size] = grade;
            this.size++;
        } else {
            System.out.println("Студент получил максимальное кол-во оценок. Дальнейшее добавление оценок - невозможно");
        }
    }
}