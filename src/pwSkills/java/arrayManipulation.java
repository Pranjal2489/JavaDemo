package pwSkills.java;

import java.util.Scanner;

public class arrayManipulation {
    //find a unique no in A given array
    static int findUnique(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
                ans=arr[i];
            }
        }
        return ans;
    }
    static  int findMax(int[] arr){
        int max=Integer.MIN_VALUE;//important
        for (int i = 0; i <arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        return max;
    }
    static  int findSecondMax(int[] arr){
        int maximum=findMax(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==maximum){
                arr[i]= Integer.MIN_VALUE;
            }
        }
        int secondMax= findMax(arr);
        return secondMax;
    }

    static int findMin(int[] arr){
        int min=Integer.MAX_VALUE;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    static int findSecondMin(int[] arr){
        int minimum=findMin(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==minimum){
                arr[i]=Integer.MAX_VALUE;
            }
        }
        int secondMinimumNumber=findMin(arr);
        return secondMinimumNumber;
    }
    static int firstRepeated(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return  -1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " + n + "elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
//        System.out.println("unique element: "+findUnique(arr));
//        System.out.println("second max :"+findSecondMax(arr));
        System.out.println("second max :"+findSecondMin(arr));
//        System.out.println("First repeated no in the array is "+firstRepeated(arr));

    }
}
