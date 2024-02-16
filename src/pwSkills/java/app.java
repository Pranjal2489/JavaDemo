package pwSkills.java;

public class app {
    static  void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    static void changeArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=0;
        }
    }
    public static void main(String[] args) {
        int[] arr= new int[3];
        arr[0]=4;
        arr[1]=2;
        arr[2]=6;
        changeArray(arr);
        printArray(arr);
    }
}
