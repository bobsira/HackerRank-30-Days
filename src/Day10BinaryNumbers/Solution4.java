package Day10BinaryNumbers;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by bobsira on 8/25/17.
 */
public class Solution4 {
    /**
     * This approach splits the string on the 0's and returns an array of consecutive-1 substrings. Then it sorts the
     * array and prints the length of the last element. Because the strings only contain 1's and they are being sorted in
     * ascending order, it is guaranteed that hte last string in the array will eb of maximum length.
     */

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int n = scan.nextInt();
        // convert to binary and split into strings of consecutive ones
        String[] groupings = Integer.toBinaryString(n).split("0");
        // sorting strings only composed of a single character ("1") orders them by length
        Arrays.sort(groupings);
        // print length of lexicographically last string
        System.out.println(groupings[groupings.length-1].length());
    }
}
