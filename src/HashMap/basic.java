package HashMap;

import java.util.HashMap;
import java.util.Map;

public class basic {
    static void HashMap(){
        Map<String,Integer> mp = new HashMap<>();

        //Adding elements
        mp.put("Akash",1);
        mp.put("Yash",16);
        mp.put("Lav",17);
        mp.put("Rishika",19);
        mp.put("Harry",18);

        //Getting value of a key from the hashmap
        System.out.println(mp.get("Akash"));
        System.out.println(mp.get("Rahul"));

        //Changing value of a key in the hashmap
        mp.put("Akash",25);
        System.out.println(mp.get("Akash"));

        //Removing a pair from the HashMap
        System.out.println(mp.remove("Akash"));
        System.out.println(mp.remove("Riya"));

        //Checking if a Key is in the HashMap
        System.out.println(mp.containsKey("Akash"));
        System.out.println(mp.containsKey("Yash"));

        //Adding a new entry only if the new key doesn't exist already
        mp.putIfAbsent("Yashika",30);
        mp.putIfAbsent("Yash",30);

        //Get all keys in the HashMap
        System.out.println(mp.keySet());

        //Get all entries in tbe hashmap
        System.out.println(mp.entrySet());

        //Traversing all entries of HAshMap -Mulptiple methods
        for(String key: mp.keySet()){
            System.out.printf("Age of %s is %d\n",key,mp.get(key));
        }

        System.out.println();

        for(Map.Entry<String,Integer> e:mp.entrySet()){
            System.out.printf("Age is %s is %d\n",e.getKey(),e.getValue());
        }

    }
    public static void main(String[] args) {
        HashMap();
    }
}
