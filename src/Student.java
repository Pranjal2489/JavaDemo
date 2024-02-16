public class Student {
    int rollNo;
    String name;

    public static void main(String[] args) {
        Student mehul= new Student();
        mehul.name="MEhul";
        mehul.rollNo=1;
        System.out.println(mehul.rollNo);
        System.out.println(mehul.name);
        Student meher= new Student();
        meher.name="MEher";
        meher.rollNo=2;
        System.out.println(meher.rollNo);
        System.out.println(meher.name);
    }
}