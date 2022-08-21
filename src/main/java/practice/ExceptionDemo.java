package practice;

public class ExceptionDemo {

    public void testException(){
        try {
            int[] num = {1, 2, 3, 4};
            System.out.println(num[5]);
        }   catch(Exception e){
              System.out.println("Your Programm has issues. Fix it!!!!!");
        }
    }
}
