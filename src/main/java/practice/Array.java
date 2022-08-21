package practice;

public class Array {
    public static void main(String[] args){
        stringArray();
    }

    public static void stringArray() {
        String[] states = {"Florida", "Texas", "California", "Oregon", "Maine"};
        for (String stateName : states) {
            System.out.println("State name is: " + stateName);
        }
    }
}
