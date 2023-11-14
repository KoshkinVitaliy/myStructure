package org.example;

public class Main {
    public static void main(String[] args) {
        int[] arr = {100, -50, 13, 23, 40, 56, 2, 4, 14, -234, 125, 69};
        MyStructure structure = new MyStructure();
        MyStructure.myArray = arr;

        structure.show();
        structure.add(-2000);
        structure.show();
        System.out.println(structure.max());
        System.out.println(structure.min());
        structure.delete(6);
        structure.show();
    }
}
