package ru.dpd.javaCore;

import java.util.ArrayList;
import java.util.List;

public class IntListStatistic {
    public static void analizeList(List<Integer> list) {
        List<Integer> positiveNumbers = new ArrayList<>();
        List<Integer> negativeNumbers = new ArrayList<>();
        Integer zeroNumbers = 0;

        /*
         * Запускаем старый добрый цикл по списку и создаем массив отрицательны иположительны чисел.
         * массив нулей смысла нет собирать, достаточно посчитать их количество
         */
        for (Integer number: list){
            if (number == 0) {
                zeroNumbers++;
            } else if (number > 0) {
                positiveNumbers.add(number);
            } else {
                negativeNumbers.add(number);
            }
        }

        /*
         * Выводим сообщение со статистикой по списку
         */
        System.out.printf(
                "Положительных: %s\n" +
                "Отрицательных: %s\n" +
                "Нулевых: %s\n" +
                "Сумма положительных: %s\n" +
                "Среднее положительных: %s\n" +
                "Произведение отрицательных: %s\n" +
                "Минимальное отрицательное: %s\n" +
                "%S",
                positiveNumbers.size(),
                negativeNumbers.size(),
                zeroNumbers,
                positiveNumbers
                        .stream()
                        .mapToInt(a -> a)
                        .sum(),
                positiveNumbers
                        .stream()
                        .mapToInt(a -> a)
                        .average()
                        .orElse(0),
                negativeNumbers.stream()
                        .reduce(1, (sub, item) -> sub * item),
                negativeNumbers.stream()
                        .mapToInt(a -> a)
                        .min()
                        .orElse(0),
                (zeroNumbers > 0) ? "Найдено нулевое значение" : ""
        );


    }


}
