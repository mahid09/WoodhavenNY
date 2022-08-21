package practice;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args){
        sortArray();
    }
    // Sorting Elements in an Array
    public static void sortArray() {
        String[] states = {"Florida", "California", "Georgia", "Texas"};
        Arrays.sort(states);
        //Print elements without loop
        System.out.println(Arrays.toString(states));
    }
}
