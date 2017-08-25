package Day10BinaryNumbers;

/**
 * Created by bobsira on 8/25/17.
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static int returnMostOnes(int n){
        int temp=0;
        int max=0;

        char[] binary = Integer.toBinaryString(n).toCharArray();

        for ( int i =0; i < binary.length; i++){

            if (binary[i]=='0'){
                if (temp>max){
                    max =temp;
                }
                temp=0;
            } else {
                temp++;
            }
        }
        return   (max>temp) ? max : temp ;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        System.out.println(returnMostOnes(n));

//        String[] strings = Integer.toBinaryString(n).split("0");
//        Arrays.sort(strings);
//        System.out.println(strings[strings.length -1].length());




    }
}
