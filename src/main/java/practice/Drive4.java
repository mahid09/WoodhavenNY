package practice;

public class Drive4 {

    public static void main(String[] args){

        MyClass myClass = new MyClass();

        System.out.println(myClass.x);
        System.out.println(myClass.y);
        System.out.println(myClass.z);

        System.out.println();

        MyClass yourClass = new MyClass(9);
        System.out.println(yourClass.x);

    }
}
