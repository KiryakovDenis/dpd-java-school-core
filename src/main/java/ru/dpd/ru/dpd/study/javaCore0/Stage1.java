package ru.dpd.ru.dpd.study.javaCore0;
/**
 * @author KiryakovDenis
 * @since 0.0.0.1
 * Класс содержит реализацию задач поставленых в 1 уроке */
public class Stage1 {
    /**
     * Упражнение 1
     *  Тернарный оператор
     *  реализовать логику, которая вернет сообщение о том, что число положительное, отрицательеное или равно нулю
     * */
    public static void exercise1(double n) {
        String result;
        result = (n == 0)? "ноль":
                         (n<0) ? "отрицательное" :
                                 "положительное";

        System.out.println(String.format("Значение %s - ", n) + result);
    }

    /**
     * Упражнение 2
     * реализовать логику, которая сообщит пользователю о том что на улице слишком жарко, холодно или комфортно
     * */
    public static void exercise2 (double temperature){
        String result;
        if (temperature < -22) {
            result = "Холодно";
        }
        else if ((temperature > -22) && (temperature <= 22 )) {
            result = "Нормально";
        }
        else if (temperature > 22) {
            result = "Жарко";
        }
        else {
            result = "Непонятно";
        }

        System.out.println(String.format(" температура %s - %s", temperature, result));
    }

    /**
     * Упражнение 3
     * вывести на экран только четные числа без использования continue
     * */
    public static void exercise3() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0 && i != 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * Упражнение 4
     * вывести на экран двумерный массив с разбивкой по строкам
     * int[][] matrix = {
     *     {1, 2, 3, 4},
     *     {5, 6, 7, 8},
     *     {9, 10, 11, 12}
     * };
     * */
    public static void exercise4() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 3; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
