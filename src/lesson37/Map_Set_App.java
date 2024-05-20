package lesson37;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class Map_Set_App {
    public static void main(String[] args) {
        HashMap <Long, String > hashMap = new HashMap<>();
        hashMap.put(41L, "Sahil");
        hashMap.put(21L, "Rahil");
        hashMap.put(11L, "Kamil");
        hashMap.put(31L, "Dahil");
        hashMap.put(71L, "Mahil");
        System.out.println(hashMap);

        System.out.println("-----------");

        Hashtable<Long, String> hashtable = new Hashtable<>();
        hashMap.put(40L, "Sahil");
        hashMap.put(20L, "Rahil");
        hashMap.put(10L, "Kamil");
        hashMap.put(30L, "Dahil");
        hashMap.put(70L, "Mahil");
        System.out.println(hashtable);

        System.out.println("-----------");

        TreeMap<Long, String> treeMap = new TreeMap<>();
        treeMap.put(14L, "Sahil");
        treeMap.put(12L, "Rahil");
        treeMap.put(11L, "Kamil");
        treeMap.put(13L, "Dahil");
        treeMap.put(17L, "Mahil");
//        treeMap.comparator().thenComparing();
        System.out.println(treeMap);



//        mapde thread safety yoxdur, ve buna gorede performansa daha yaxsidi. Bu sebebden HashMap daha cox istifade olunur


    }

}
