package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class customarraylist {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public customarraylist() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove() {
        int removed = data[--size];
        return removed;
    }

    public int get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
        data[index] = value;

    }

    public String toString(){
        return "data = "+ Arrays.toString(data)+" Size = "+size;
    }

    public static void main(String[] args) {
        customarraylist list = new customarraylist();
        list.add(55);
        list.add(4);
        list.add(44);
        System.out.println(list.toString());
        ArrayList <Integer> ll = new ArrayList<>();
        
    }
}
