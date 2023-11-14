package org.example;

public class MyStructure implements Structure{

    public static int[] myArray;

    @Override
    public void add(int element) {
        if (myArray == null) {
            myArray = new int[1];
            myArray[0] = element;
        }
        else {

            int[] updatedArray = new int[myArray.length + 1];
            for (int index = 0; index < myArray.length; index++) {
                updatedArray[index] = myArray[index];
            }

            updatedArray[updatedArray.length-1] = element;
            myArray = updatedArray;
        }
    }

    @Override
    public void show() {
        if (myArray == null) {
            System.out.println("Массив не создан.");
        }
        else {
            for (int element: myArray) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }

    @Override
    public int max() {
        if (myArray == null) {
            System.out.println("Массив не создан");
            return 0;
        }
        else {
            int maxElement = myArray[0];
            for (int element: myArray) {
                if(element > maxElement)  {
                    maxElement = element;
                }
            }
            return maxElement;
        }
    }

    @Override
    public int min() {
        if (myArray == null) {
            System.out.println("Массив не создан");
            return 0;
        }
        else {
            int minElement = myArray[0];
            for (int element: myArray) {
                if(element < minElement)  {
                    minElement = element;
                }
            }
            return minElement;
        }
    }

    @Override
    public void delete(int index) {
        if (myArray == null) {
            System.out.println("Массив не создан");
        }
        else {
            int[] updatedArray = new int[myArray.length-1];
            for (int i=0; i < myArray.length; i++) {
                if (i > index) {
                    updatedArray[i-1] = myArray[i];
                }
                else if (i < index) {
                    updatedArray[i] = myArray[i];
                }
            }
            myArray = updatedArray;
        }
    }
}
