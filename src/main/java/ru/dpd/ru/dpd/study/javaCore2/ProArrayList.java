package ru.dpd.ru.dpd.study.javaCore2;

import java.util.Arrays;

public class ProArrayList {
    private static final int DEFAULT_SIZE = 10;
    private static final int INCREASE_DELTA = 3;

    private String[] arr;
    private int size;

    public ProArrayList(){
        this.arr = new String[DEFAULT_SIZE];
        this.size = 0;
    }

    public void add(int index, String element){
        this.increaseArrIfNeed(this.size);
        System.arraycopy(this.arr, index, this.arr, index + 1, 1);
        this.arr[index] = element;
        size++;
    }

    public void add(String element){
        this.increaseArrIfNeed(this.size);
        this.arr[this.size++] = element;
    }

    private String get(int index){
        return this.arr[index];
    }

    public void remove(int index){
        System.arraycopy(this.arr, index + 1, this.arr, index, this.arr.length - index - 1);
        size--;
        this.shrinkArrIfNeed();
    }

    private void shrinkArrIfNeed(){
        if (this.arr.length - size >  DEFAULT_SIZE + INCREASE_DELTA)
            this.shrinkArr();
    }

    private void shrinkArr(){
        String[] tmpArr = new String[this.arr.length - DEFAULT_SIZE];
        System.arraycopy(this.arr, 1, tmpArr, 1, this.size);
        this.arr = tmpArr;
    }

    private void increaseArr(){
        String[] tmpArr = new String[this.arr.length + DEFAULT_SIZE];
        System.arraycopy(this.arr, 0, tmpArr, 0, this.arr.length);
        this.arr = tmpArr;
    }

    private void increaseArrIfNeed(int index){
        if (this.arr.length - index <= INCREASE_DELTA)
            this.increaseArr();
    }

    @Override
    public String toString() {
        return "ProArrayList{" +
                "arr=" + Arrays.toString(this.arr) +
                '}';
    }


}
