package practice;

import java.util.HashMap;
import java.util.Map;

public class LearnHashmap {

    HashMap<String, String>  hmap = new HashMap<>();

    public void addhashmap(){
        hmap.put("IE", "Internet Explorer");
        hmap.put("Chrome", "Chrome Browser");
        hmap.put("Firefox", "Mozilla Firefox");
        hmap.put("Safari", "Macbook Browser");
        hmap.put("Opera", "Linux Browser");

        //System.out.println("Browser name: " + hmap.get("Safari"));

        for(Map.Entry map: hmap.entrySet()){
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }
}
