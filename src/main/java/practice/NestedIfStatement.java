package practice;

public class NestedIfStatement {
    public static void main(String[] args){
        NestedIfStatment();
    }
    public static void NestedIfStatment()
    {
        int x = 30;
        int y = 10;

        if( x > 35) {
            if( y < 15 ) {
                System.out.println("X = "+ x +" and y = " + y);
            }
        }
    }
}
