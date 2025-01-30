package ru.dpd.ru.dpd.study.javaCore2;

import java.util.Arrays;

public class ProArrayList {
    private static final int DEFAULT_SIZE = 10;
    private static final int INCREASE_DELTA = 3;

    private String[] arr;
    private int size;

    public ProArrayList() {
        this.arr = new String[DEFAULT_SIZE];
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public void add(int index, String element) {
        this.provideCapacity(this.size);
        System.arraycopy(this.arr, index, this.arr, index + 1, 1);
        this.arr[index] = element;
        size++;
    }

    public void add(String element) {
        this.provideCapacity(this.size);
        this.arr[this.size++] = element;
    }

    private String get(int index) {
        return this.arr[index];
    }

    public void remove(int index) {
        for (int i = index; i <= this.size; i++) {
            this.arr[i] = this.arr[i + 1];
        }
        this.size--;
    }

    private void grow() {
        String[] tmpArr = new String[this.arr.length + DEFAULT_SIZE];
        System.arraycopy(this.arr, 0, tmpArr, 0, this.arr.length);
        this.arr = tmpArr;
    }

    private void provideCapacity(int index) {
        if (this.arr.length - index <= INCREASE_DELTA) {
            this.grow();
        }
    }

    @Override
    public String toString() {
        return "ProArrayList{" +
                "arr=" + Arrays.toString(this.arr) +
                '}';
    }
}