package practice;

public class Driver8 {

    public static void main(String[] args){

        String str = "WEDNESDAY";
        EnumTest test1 = new EnumTest(Day.valueOf(str));
        test1.dayIsLike();
    }
}
