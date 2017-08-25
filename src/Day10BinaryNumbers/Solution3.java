package Day10BinaryNumbers;

import java.util.Scanner;

/**
 * Created by bobsira on 8/25/17.
 */
public class Solution3 {
    /**
     * This approach splits the string on the 0's and return an array of the consecutive-1 substring.
     * Then it iterates through the array and prints the one having maximum length.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // convert to binary and split into strings of consecutive ones
        String[] groupings = Integer.toBinaryString(n).split("0");
        int max = 0;
        for (String s : groupings ){
            if (max < s.length()){
                max = s.length();
            }
        }
        System.out.println(max);
    }
}
