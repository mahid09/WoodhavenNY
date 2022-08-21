package practice;

public class Demo2 {
    public void contains() {
        String myStr = "Hello";
        System.out.println(myStr.contains("Hel"));   //true
        System.out.println(myStr.contains(("e")));   //true
        System.out.println(myStr.contains(("Hi")));  //false
    }
}
