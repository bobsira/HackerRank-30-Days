package Day10BinaryNumbers;

import java.util.Scanner;

/**
 * Created by bobsira on 8/25/17.
 */
public class Solution2 {
    /**
     * This approach compares maxCount with tmpCount at every index in the binary string
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        // convert number->binary string->char array
        char[] binary = Integer.toBinaryString(n).toCharArray();
        int tmpCount = 0; // count consecutive ones
        int maxCount = 0; // running maximum of consecutive ones
        for ( int i =0; i < binary.length; i++ ){
            // reset to 0 if we hit a '0' char
            tmpCount = (binary[i] == '0') ? 0 : tmpCount + 1;

            // set max
            if (tmpCount > maxCount ){
                maxCount = tmpCount;
            }
        }
        System.out.println(maxCount);
    }
}
