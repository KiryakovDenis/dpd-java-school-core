package ru.dpd.ru.dpd.study.javaCore3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Stage4Runner {
    public static final String STR_SPLITTER = "===========================================";

    public static void run(){
        System.out.println();
        System.out.println();
        System.out.println("УРОК 4");
        System.out.println(STR_SPLITTER);
        System.out.println("Урок4. Упражнение 1");
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.printf("Список %s%n", list.toString());
        System.out.printf("Сумма списка: %s%n", Stage4.summList(list).toString());
        System.out.println();

        System.out.println("Урок4. Упражнение 2");
        list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.printf("Исходный список %s%n", list.toString());
        List<Integer> list2 = Stage4.invertList(list);
        System.out.printf("Инвертированый список %s%n", list2.toString());
        list.add(7);
        System.out.printf("Исходный список с новым элементом %s%n", list.toString());
        System.out.printf("Инвертированый список %s%n", list2.toString());
        System.out.println();

        System.out.println("Урок4. Упражнение 3");
        LinkedList<String> linkedList= new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("B");
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("B");
        linkedList.add("A");
        System.out.printf("Исходный список с дублирующимися элементами %s%n", linkedList.toString());
        Stage4.distinctLinkedList(linkedList);
        System.out.printf("Результирующий список %s%n", Stage4.distinctLinkedList(linkedList));
        System.out.println();

        System.out.println("Урок4. Упражнение 4");
        Integer[] s4e4Arr = {1, 1, 2, 3, 10};
        System.out.printf("Исходный массив %s%n", Arrays.toString(s4e4Arr));
        System.out.printf("Результирующий список %s%n", Stage4.Array2HashSet(s4e4Arr));
        System.out.println();

        System.out.println("Урок4. Упражнение 5");
        String str = "Ветер с моря дул, ветер с моря дул, нагонял беду, нагонял беду. И сказал ты мне ...";
        System.out.printf("Исходная строка %s%n", str);
        System.out.printf("Результирующий мап %s%n", Stage4.calcWordFrequency(str));
        System.out.println(STR_SPLITTER);
    }
}
