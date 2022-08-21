package practice;
import java.util.*;


public class ConvertArray {
    public static void main(String[] args){
        //Creating Array
        String[] array={"Java","Python","PHP","C++"};
        System.out.println("Printing Array: "+Arrays.toString(array));
        //Converting to array list
        List<String>list=new ArrayList<>();
        for(String lang:array){
            list.add(lang);
        }
        System.out.println("Printing List: "+list);
    }
}
