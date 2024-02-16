package pwSkills.java;
class arraysExample{
    void demoArrays(){
        int[] ages=new int[3];
        float[] weights =new float[3];
        String[] names= {"ram","raj","karan","amit"};

        ages[0]=8;
        ages[1]=28;
        ages[2]=18;
//        ages[5]=38;

        weights[0]=3.4f;
        weights[1]=4.4f;
        weights[2]=5.4f;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names.length);
        System.out.println(ages.length);
        System.out.println(weights.length);

        //printing arrays using loops

        for (int i = 0; i <3; i++) {

            System.out.println(ages[i]);

        }
        for (int age:ages) {
            System.out.println(age);//full array print always
        }
        int j=0;
        while(j<3){
            System.out.println(ages[j]);
            j++;
        }



    }

    void multiarrays(){
        int[][] array= new int[5][3];
        int[][] array1 = {{1, 2}, {3, 4},{5,6}};
        int[][][] array3d = new int[3][4][5];
        array3d[2][3][4] =1;
        System.out.println(array1[0][1]);

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j <array1[i].length; j++) {
                System.out.println(array1[i][j]);
            }

        }
    }
}
public class arraysDiscuss {
    public static void main(String[] args) {
        arraysExample obj= new arraysExample();
        obj.demoArrays();
        obj.multiarrays();

//        int[] age;
//        String[] names;
//        float[] weights = {3.4F, 5.2F};
//
//
//        age=new int[5];
//        names=new String[7];
//
//        System.out.println(weights[0]);

    }
}
