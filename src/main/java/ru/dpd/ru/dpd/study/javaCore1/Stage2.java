package ru.dpd.ru.dpd.study.javaCore1;
/**
 * @author KiryakovDenis
 * @since 0.0.0.1
 * Класс содержит реализацию задач поставленых во 2 уроке
 */
public class Stage2 {

    /**
     * Упражнение 1 (логические операторы)
     * Реализовать логику, которая определяет, может ли человек получить водительские права
     * в зависимости от его возраста (int) и разрешения (boolean)
     *
     * @param  age - возраст человека
     * @param existPermission - наличие разрашения на сдачу прав
     */
    public static void exercise1(Integer age, boolean existPermission) {
        String result = "";

        if ((age < 16) ||
                (age >= 16 && age < 18 && !existPermission)
        ) {
            result = "нельзя";
        }
        else if (age >= 18 ||
                (age >= 16 && existPermission)
        ) {
            result = "можно";
        }

        System.out.printf(" Если возраст человека %s и %s разрешение, значит учиться на права - %s%n", age, (existPermission? "есть": "отсутствует"), result);

    }

    /**
     * Упражнение 2.
     * Реализовать логику, которая на основе двух чисел выведет true, если (оба числа положительные,
     * первое число больше второго и сумма обоих чисел четная)
     * */
    public static void exercise2(Integer n1, Integer n2) {
        boolean result;

        result = (n1 > 0 && n2 > 0 && n1 > n2 && (n1 + n2) % 2 == 0)? true: false;

        System.out.printf("n1=%s n2=%s%n" +
                "      n1>0 - %b%n" +
                "      n2>0 - %b%n" +
                "     n1>n2 - %b%n" +
                "n1+n2 = %s - %s%n" +
                "результат  - %b%n",
                n1, n2,
                n1>0, n2>0, n1>n2,
                n1+n2,
                (n1 + n2)%2 == 0?"четное":"нечетное",
                result);
        System.out.println();
    }

    /**
     * Создать класс утилиту, который реализует методы - and(x, y): boolean, or(x, y): boolean, not(x): boolean
     */
    public static class Exercise3 {
        public static boolean and(boolean x, boolean y) {
            return x && y;
        }

        public static boolean or(boolean x, boolean y) {
            return x || y;
        }

        public static boolean not (boolean x) {
            return !x;
        }
    }
}