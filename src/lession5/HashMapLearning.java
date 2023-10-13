package lession5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapLearning {
    public static void main(String[] args) {
        Map <Integer, String> emergencyList = new HashMap<>();
        emergencyList.put(113,"CSCD");
        emergencyList.put(114,"Cuu Hoa");
        emergencyList.put(115,"Cap Cuu");
        emergencyList.put(116,"Others");

        System.out.println(emergencyList.get(113));

        Set <Integer> allKeys = emergencyList.keySet();
        for (int key : allKeys) {
            System.out.println(emergencyList.get(key));

        }
        // If value = Others, changes to Something else
        /*
        * loop over the keys
        *   get value out
        *       if (value.equals ("Others"){
        *           replace }
        *
        * */
        // Replacing
        Set<Integer> allKeys1 = emergencyList.keySet();
        for (int key1 : allKeys1) {
            if (emergencyList.get(key1).equals("Others")){
                emergencyList.replace(key1,"Something else");
            }

        }
        emergencyList.replace(116,"Something else","Others");

        // Remove
        emergencyList.remove(116);
        emergencyList.remove(115,"ABC");
        //Print
        for (Integer key : allKeys1) {
            System.out.println(emergencyList.get(key));

        }
        System.out.println(emergencyList.containsKey(115));
        System.out.println(emergencyList.containsValue("CSCD"));
    }
}
