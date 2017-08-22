package Day1DataTypes;

import java.util.Scanner;

/**
 * Created by bobsira on 8/22/17.
 */
public class Solution {

    public static void main(String[] args) {
        int i =4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        int secondInt;
        double secondDouble;
        String secondString;

        /*Read and save an integer, double, and String to your variables.*/
        secondInt = scan.nextInt();
        secondDouble = scan.nextDouble();
        secondString = scan.nextLine();
        secondString = scan.nextLine();

//        // also possible
//        secondInt = Integer.parseInt(scan.nextLine());
//        secondDouble = Double.parseDouble(scan.nextLine());
//        secondString = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+secondInt);

        /* Print the sum of both double variables on a new line. */
        System.out.println(d+secondDouble);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s+secondString);

        scan.close();
    }
}
