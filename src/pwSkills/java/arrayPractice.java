package pwSkills.java;

import java.util.Arrays;
import java.util.Scanner;

class arrayExample {
    void sumOfArrays() {
        int[] arr = {1, 5, 7, 3, 9};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

    void maxOfArray() {

        int[] array = {10, 8, 5, 7, 3, 9};

        int ans = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > ans) {
                ans = array[i];
            }
        }
        System.out.println("max" + ans);
    }

    void searchArray() {
        int[] array = {10, 8, 5, 7, 3, 9};
        int num = 6;
        int answer = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                answer = i;
                break;
            }
        }
        if (answer == -1) {

            System.out.println("not found");
        } else {

            System.out.println("Found " + num + " at index " + answer);
        }

    }


}

public class arrayPractice {
    static int countOfOccurences(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }

    static int strictlyGreater(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                count++;
            }
        }
        return count;
    }

    static int lastOccurence(int[] arr, int x) {
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastIndex = i;
            }

        }
        return lastIndex;

    }

    static boolean isSorted(int arr[]) {
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                check = false;
                break;
            }
        }
        return check;
    }

    static int[] smallestAndLargestElement(int[] arr) {
        //by sorting

        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length - 1]};
        return ans;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
    }

    static int[] kthSmallestAndLargestElement(int[] arr, int k) {
        Arrays.sort(arr);
        int[] ans = {arr[k - 1], arr[arr.length - 1 - (k - 1)]};
        return ans;

    }

    public static void main(String[] args) {
        arrayExample obj = new arrayExample();
        obj.sumOfArrays();
        obj.maxOfArray();
        obj.searchArray();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " + n + "elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the value of the kth element :");
        int x = sc.nextInt();


//        System.out.println("enter the value of x  :");
//        int x= sc.nextInt();
//        System.out.println("COUNT OF "+x+" IS : "+countOfOccurences(arr,x));

//        System.out.println("LAST OCCURRENCE OF"+x+" is "+ lastOccurence(arr,x));
//        System.out.println("number strictly greater than"+x+" is "+ strictlyGreater(arr,x));
//        System.out.println("is sorted?"+ isSorted(arr));

//        int[] answer =smallestAndLargestElement(arr);
//        System.out.println("Smallest"+answer[0]);
//        System.out.println("largest"+answer[1]);

        int[] answer = kthSmallestAndLargestElement(arr, x);
        System.out.println("Smallest" + answer[0]);
        System.out.println("largest" + answer[1]);
    }
}
