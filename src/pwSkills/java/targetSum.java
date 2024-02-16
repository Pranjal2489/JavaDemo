package pwSkills.java;

import java.util.Scanner;

public class targetSum {

    static int pairSum(int[] arr, int targetNum){

        int n=arr.length;
        int ans=0;
        for (int i = 0; i < n; i++) {

            for (int j = i+1; j < n; j++) {
                if (arr[i]+arr[j]==targetNum){
                    ans++;
                }
            }
        }
        return ans;
    }

    static int triplePairSum(int[] arr, int targetNum){

        int n=arr.length;
        int ans=0;
        for (int i = 0; i < n; i++) {

            for (int j = i+1; j < n; j++) {

                for (int k = j+1; k <n; k++) {

                    if (arr[i]+arr[j]+arr[k]==targetNum){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " + n + "elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter target sum ? ");
        int targetSum=sc.nextInt();

        System.out.println(triplePairSum(arr,targetSum));

    }
}
