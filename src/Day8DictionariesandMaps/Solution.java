package Day8DictionariesandMaps;

/**
 * Created by bobsira on 8/24/17.
 */
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String,Integer> directory = new HashMap<String,Integer>();
        int n = in.nextInt();
        for ( int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            directory.put(name,phone);
        }
        while (in.hasNext()){
            String query = in.next();
            if (directory.containsKey(query))
                System.out.println(query+"="+directory.get(query));
            else
                System.out.println("Not found");
        }
        in.close();
    }
}
