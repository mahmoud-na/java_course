package sec_8_arays_java_inbuilt_lists_autoboxing_unboxing;

import java.util.Scanner;

public class Array {
    private static Scanner scanner = new Scanner(System.in);


    ///////////////////////////////////Reverse Array Challenge//////////////////////////////////////
    public static void reverse(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - (i + 1)];
            arr[arr.length - (i + 1)] = temp;
        }
    }

    ///////////////////////////////////Minimum Element Challenge//////////////////////////////////////
    public static int readInteger() {
        int count;
        System.out.println("Please Enter Array Size: ");
        count = scanner.nextInt();
        return count;
    }

    public static int[] readElements(int count) {
        System.out.println("Enter " + count + " integer values.");
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    ///////////////////////////////////Sorted Array Challenge//////////////////////////////////////
    public static int[] getIntegers(int arrSize) {
        int[] array = new int[arrSize];
        System.out.println("Enter " + arrSize + " integer values.");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + i + ", typed value was " + arr[i]);
        }
    }

    public static int[] sortIntegers(int[] arr) {
        int temp;
        int[] sortedArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArray[i] = arr[i];
        }
        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = 0; j < sortedArray.length - 1; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    temp = sortedArray[j + 1];
                    sortedArray[j + 1] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }
        return sortedArray;
    }

}
