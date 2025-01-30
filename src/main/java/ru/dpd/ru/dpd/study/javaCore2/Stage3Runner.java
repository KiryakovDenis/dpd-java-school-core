package ru.dpd.ru.dpd.study.javaCore2;

public class Stage3Runner {
    public static final String STR_SPLITTER = "===========================================";

    public static void run() {
        System.out.println();
        System.out.println();
        System.out.println("УРОК 3");
        System.out.println(STR_SPLITTER);

        System.out.println("Свой ArrayList");
        ProArrayList arr = new ProArrayList();
        arr.add("111");
        System.out.println(arr.toString());
        arr.add("222");
        System.out.println(arr.toString());
        arr.add(1,"333");
        System.out.println(arr.toString());
        arr.remove(1);
        System.out.println(arr.toString());

        for (int i = 0; i<=40; i++)
            arr.add("X" + i);
        System.out.println(arr.toString());

        for (int i = 40; i>=20; i--)
            arr.remove(i);
        System.out.println(arr.toString());
        System.out.println(arr.toString());
        System.out.println(STR_SPLITTER);
    }
}
