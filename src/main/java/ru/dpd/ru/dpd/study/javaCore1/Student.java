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
    private Integer[] grades;

    public Student(){};

    public Student (Long studentID, String name, Integer[] grades){
        this.studentId = studentID;
        this.name = name;
        this.grades = grades;
    }


    public Long getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer[] getGrades() {
        return grades;
    }

    public double calculateAverage(){
        if (this.grades == null)
            return 0;
        else
            return Arrays.stream(this.grades).mapToInt(Integer::intValue).average().orElse(0);
    }

    public void addGrade(Integer grade){
        if (this.grades == null){
            this.grades = new Integer[1];
            this.grades[this.grades.length - 1] = grade;
        }
        else {
            Integer[] tmpArr = new Integer[this.grades.length + 1];

            System.arraycopy(this.grades, 0, tmpArr, 0, this.grades.length);

            tmpArr[tmpArr.length - 1] = grade;

            this.grades = tmpArr;
        }
    }

}