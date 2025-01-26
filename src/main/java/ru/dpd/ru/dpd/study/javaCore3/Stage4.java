package ru.dpd.ru.dpd.study.javaCore3;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author KiryakovDenis
 * @since 0.0.0.1
 *
 * Класс содержит решение упражнений для урока 3
 * */
public class Stage4 {
    /**
     * Упражнение 1.
     * Напишите метод, который принимает ArrayList<Integer> и возвращает сумму всех чисел в этом списке
     * */
    public static Integer summList(List<Integer> list){
        if (list == null)
            return 0;
        else
            return list.stream().mapToInt(Integer::intValue).sum();
    }

    /**
     * Упражнение 2.
     * Напишите метод, который принимает ArrayList<Object> и возвращает новый ArrayList с элементами в обратном порядке
     * */
    public static List<Integer> invertList(List<Integer> list){
        return new ArrayList<>(list.reversed());
    }

    /**
     * Упражнение 3.
     * Напишите метод, который принимает LinkedList<String> и удаляет из него все дубликаты, оставляя только уникальные элементы.
     * */
    public static List<String> distinctLinkedList(LinkedList<String> list){
        return list.stream().distinct().toList();
    }

    /**
     * Упражнение 4.
     * Напишите метод, который принимает массив целых чисел и возвращает HashSet, содержащий только уникальные элементы из этого массива
     * */
    public static HashSet<Integer> Array2HashSet(Integer[] arr){
        return new HashSet<Integer>(Arrays.stream(arr).distinct().collect(Collectors.toSet()));
    }

    /**
     * Упражнение 5.
     * Напишите метод, который считывает строку и подсчитывает частоту каждого слов.
     * Используйте HashMap, чтобы хранить слова в качестве ключей и их частоту в качестве значений.
     * */
    public static Map<String, Integer> calcWordFrequency(String text){
        Map<String, Integer> result = new HashMap<>();

        Arrays.stream(text.split(" ")).forEach(s -> {
            if (result.containsKey(s))
                result.put(s, result.get(s) + 1);
            else
                result.put(s, 1);
        });
        return result;
    }



}
