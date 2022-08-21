package practice;

public class Dowhile{


    public static void main (String[]args){
        DoWhileLoop();
  }
    static void DoWhileLoop() {
        int x = 10;
        do {
            System.out.println("value of x: " + x);
            x++;
        }while(x < 20);
    }
}
