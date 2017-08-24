package Day8DictionariesandMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by bobsira on 8/24/17.
 */
public class MapDemo {
    /** Java Maps
     * Map is an interface that provides a blueprint for data structures that take(key,value)pairs and map keys to
     * their associated values (it's important to note that both the key and the value must be Objects and not
     * primitives). The implementation is done by implementing classes such as HashMap or LinkedHashMap.
     * Consider the following code:
     */
    static void testMap1(){
        // Declare a String to String map
        Map<String,String> myMap;

        // Initialize it as a new String to String HashMap
        myMap = new HashMap<String,String>();

        // Chane myMap to be a new (completely different) String to String LinkedHashmap instead
        myMap = new LinkedHashMap<String,String>();
    }

    /**
     * Few Map methods
     *
     * 1.containsKey(Object key): Return true if the map contains a mapping for key;returns false if there is no such mapping
     * 2.get(Object key):Returns the value to which the key is mapped;returns null if there is no such mapping.
     * 3.put(K key, V value):Adds the (Key,Value) mapping to the Map; if the key is already in the map,the value is overwritten
     */

    // Example(Java)
    // The code below:

    static void Demo(){
        // Create a Map of String Keys to String Values, implemented by the HashMap class
        Map<String,String> myMap = new HashMap<String,String>();

        // Adds ("Hi","Bye") mapping to myMap
        myMap.put("Hi","Bye");

        // Print the Value mapped to from "Hi"
        System.out.println(myMap.get("Hi"));

        // Replace "Bye" mapping from "Hi" with "Bye!"
        myMap.put("Hi","Bye!");

        // Print the Value mapped to from "Hi"
        System.out.println(myMap.get("Hi"));

        // output
        //Bye
        //Bye!
    }

    public static void main(String[] args) {
    }
}
