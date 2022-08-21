package practice;

import java.util.HashMap;

public class Drive2 {
    public static void main(String[] args){

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Vishal", 10);
        map.put("Virat", 183);
        map.put("Tamim", 154);


        //System.out.println("Size of the map: " + map.size());

        //System.out.println();

        //System.out.println(map);

        if (map.containsKey("Tamim")){
            Integer a = map.get(("Tamim"));
            System.out.println("Value for key " + "\"Tamim\" is: " + a);
        }

    }
}
