package ru.dpd.ru.dpd.study.javaCore0;

/**
 * @author KiryakovDenis
 * @since 0.0.0.1
 * Клас для запуска заданий 1 урока
 * */
public class Stage1Runner {
    public static final String STR_SPLITTER = "===========================================";
    public static void run(){
        System.out.println();
        System.out.println("УРОК 1");
        System.out.println(STR_SPLITTER);
        
        System.out.println("Упражнение 1");
        double x = 1.0;
        Stage1.exercise1(x);
        x = 0;
        Stage1.exercise1(x);
        x = -1;
        Stage1.exercise1(x);
        System.out.println();

        System.out.println("Упражнение 2");
        x = -30;
        Stage1.exercise2(x);
        x = 0;
        Stage1.exercise2(x);
        x = 25;
        Stage1.exercise2(x);
        System.out.println();

        System.out.println("Упражнение 3");
        Stage1.exercise3();
        System.out.println();

        System.out.println("Упражнение 4");
        Stage1.exercise4();

        System.out.println(STR_SPLITTER);
    }
}
