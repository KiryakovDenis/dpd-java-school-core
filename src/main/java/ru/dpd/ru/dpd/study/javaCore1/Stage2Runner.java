package ru.dpd.ru.dpd.study.javaCore1;

public class Stage2Runner {
    public static final String STR_SPLITTER = "===========================================";
    public static void run(){
        System.out.println();
        System.out.println();
        System.out.println("УРОК 2");
        System.out.println(STR_SPLITTER);

        System.out.println("Упражнение 1");
        Stage2.exercise1(3, false);
        Stage2.exercise1(3, true);
        Stage2.exercise1(16, false);
        Stage2.exercise1(16, true);
        Stage2.exercise1(17, false);
        Stage2.exercise1(17, true);
        Stage2.exercise1(18, false);
        Stage2.exercise1(18, true);
        Stage2.exercise1(101, false);
        Stage2.exercise1(101, true);
        System.out.println();

        System.out.println("Упражнение 2");
        Stage2.exercise2(3, 1);
        Stage2.exercise2(1, 3);
        Stage2.exercise2(1, 2);
        Stage2.exercise2(-3, 1);
        Stage2.exercise2(3, -1);
        System.out.println();

        System.out.println("Упражнение 3");
        System.out.printf("true and true = %b%n",Stage2.Exercise3.and(true, true));
        System.out.printf("true and false = %b%n",Stage2.Exercise3.and(true, false));
        System.out.printf("false and true = %b%n",Stage2.Exercise3.and(false, true));
        System.out.printf("false and false = %b%n",Stage2.Exercise3.and(false, false));
        System.out.printf("true or true = %b%n",Stage2.Exercise3.or(true, true));
        System.out.printf("true or false = %b%n",Stage2.Exercise3.or(true, false));
        System.out.printf("false or true = %b%n",Stage2.Exercise3.or(false, true));
        System.out.printf("false or false = %b%n",Stage2.Exercise3.or(false, false));
        System.out.printf("not false = %b%n",Stage2.Exercise3.not(false));
        System.out.printf("not true = %b%n",Stage2.Exercise3.not(true));
        System.out.println();

        System.out.println("Упражнение 4");

        Student student = new Student(1L, "Иванов И.И.", null);

        System.out.printf("Средняя оценка: %s%n", student.calculateAverage());
        student.addGrade(5);
        System.out.printf("Средняя оценка: %s%n", student.calculateAverage());
        student.addGrade(4);
        System.out.printf("Средняя оценка: %s%n", student.calculateAverage());
        student.addGrade(2);
        System.out.printf("Средняя оценка: %s%n", student.calculateAverage());
        student.addGrade(5);
        System.out.printf("Средняя оценка: %s%n", student.calculateAverage());
        System.out.println();

        System.out.println("Упражнение 5");
        Rectangle rect = new Rectangle(3L,4L);
        System.out.printf("Площадь прямоугольника со сторонами %s и %s равна %s%n", rect.getWidth(), rect.getHeight(), rect.getArea());
        System.out.printf("Периметр прямоугольника со сторонами %s и %s равен %s%n", rect.getWidth(), rect.getHeight(), rect.getPerimetr());
        System.out.println(STR_SPLITTER);
    }
}
