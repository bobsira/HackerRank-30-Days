package Day6Review;

import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i =0; i < testCases; i++){
            char[] inputString = scanner.next().toCharArray();
            StringBuilder oddString = new StringBuilder();
            StringBuilder evenString = new StringBuilder();

            for ( int j = 0; j < inputString.length; j++){
                if( ( j & 1) == 0 ) {
                    evenString.append(inputString[j]);
                } else {
                    oddString.append(inputString[j]);
                }
            }
            System.out.println(evenString + " " + oddString);
        }
    }
}
