package Day6Review;

/**
 * Created by bobsira on 8/23/17.
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
//        ArrayList<String> even = new ArrayList<String>();
//        ArrayList<String> odd = new ArrayList<String>();
        int T = scanner.nextInt();
        for ( int i =0; i <= T; i++){
            String S = scanner.nextLine();
            char[] myCharArray = S.toCharArray();

            // printing the even indices
            for ( int j =0; j < myCharArray.length; j=j+2){
                System.out.print( myCharArray[j] );
            }

            System.out.print(" ");

            // printing the odd indices
            for (int j =1; j < myCharArray.length; j=j+2){
                System.out.print( myCharArray[j] );
            }

            System.out.println();

//            for (int j=0;j<myCharArray.length;j++){
//            if (j%2==0){
//              even.add(String.valueOf(myCharArray[j]));
//            }
//            if (j%2!=0){
//                odd.add(String.valueOf(myCharArray[j]));
//              }
//            }
//            System.out.print(even);
//            System.out.print(" ");
//            System.out.print(odd);

        }
    }
}