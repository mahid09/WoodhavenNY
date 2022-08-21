package practice;



import javax.swing.plaf.nimbus.State;

public class CondOperator {

   public static void main(String[] args) {
        ConditionalOperator();
    }
    public static void ConditionalOperator() {
        int a, b;
        a = 10;
        b = (a == 1) ? 20: 30;
        System.out.println("Value of b is : " + b);

        b = (a == 10) ? 20: 30;
        System.out.println("Value of b is : " + b );
    }
}