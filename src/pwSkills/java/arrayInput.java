package pwSkills.java;

import java.util.Arrays;
import java.util.Scanner;

public class arrayInput {

    static  void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
//        arr[0]=sc.nextInt();
//        System.out.println(arr[0]);
        System.out.println("enter " + n + "elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array");
        printArray(arr);


//        int[] arr2=arr;
//        int[] arr2=arr.clone();
//        int[] arr2= Arrays.copyOf(arr, arr.length);
//        int[] arr2= Arrays.copyOf(arr, 2);
        int[] arr2= Arrays.copyOfRange(arr, 0,arr.length);// array.length -1

        System.out.println("copied array");
        printArray(arr2);

        arr2[0]=3;
        arr2[1]=7;
        System.out.println("original array after changing array 2");
        printArray(arr);
        System.out.println("copied array2 after changing array 2");
        printArray(arr2);

    }
}
