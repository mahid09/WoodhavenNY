package practice;

public class RecursionClass {

    //4! = 4*3*2*1
    //10
    //10+8+7+7+6+5+4+3+2+1
    //Sum = 10 + Sum(1_9)
    //Sum = 10 + 9 + Sum(1-8)

    public static void main(String[] args){
        int result = sum(10);
        System.out.println(result);







    }

    public static int sum(int k){
        if(k>0){
            return k + sum(k-1);
        }else{
            return 0;
        }
    }
}
