public class algebra {
    int a ;
    int b;

    algebra(int x,int y){
        a=x;
        b=y;
    }
    int add(){
        return a+b;
    }
    int sub(){
        return a-b;
    }
    int mul(){
        return a*b;
    }

    public static void main(String[] args) {
        algebra obj=new algebra(9,7);
        System.out.println(obj.sub());
        System.out.println(obj.add());
        System.out.println(obj.mul());

    }
}
