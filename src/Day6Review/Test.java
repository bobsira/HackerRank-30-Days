package Day6Review;

/**
 * Created by bobsira on 8/23/17.
 */
public class Test {

    // To break a String down into its component characters, you can use the String.toCharArray method.
    // For example, this code:
    public static void toCharArrayExample(){
        String myString = "This is String example.";
        char[] myCharArray = myString.toCharArray();
        for ( int i =0; i < myString.length(); i++){
            // Print each sequential character on the same line
            System.out.print(myCharArray[i]);
        }

        // Print a newline
        System.out.println();
    }

    public static void main(String[] args) {
        toCharArrayExample();
    }
    //produces this output:
    //This is String example.
}
