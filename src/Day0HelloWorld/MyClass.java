package Day0HelloWorld;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.MatchResult;

/**
 * Created by bobsira on 8/22/17.
 */
public class MyClass {
    // This is a single-line comment.

    /*  This is also a comment.
        This type of comment can span several lines
    */

    int myMethod(){
        // ...does cool stuff.
        return 1;
    }
    void myMethod(int myInt){
        // ...does cool stuff.
    }

    static void scannerDocs(){
        //For example, this code allows a user to read a number from System.in:
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        //As another example, this code allows long types to be assigned from entries in a file myNumbers:
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("/home/bobsira/IdeaProjects/30daysCode/src/Day0HelloWorld/myNumbers"));
            while (scanner.hasNextLong()) {
                long aLong = scanner.nextLong();
                System.out.println(aLong);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    static void scannerandDelimiter(){
        // The scanner can also use delimiter other than whitespace.
        // This example reads several items in from a string:
        String input = "1 fish 2 fish red fish blue fish";
        Scanner scanner1 = new Scanner(input).useDelimiter("\\s/*fish\\s");
        System.out.println(scanner1.nextInt());
        System.out.println(scanner1.nextInt());
        System.out.println(scanner1.next());
        System.out.println(scanner1.next());
        scanner1.close();
    }

    static void scannerandRegularExpression(){
        String input = "1 fish 2 fish red fish blue fish";
        Scanner s = new Scanner(input);
        s.findInLine("(\\d+) fish (\\d+) fish (\\w+) fish (\\w+)");
        MatchResult result = s.match();
        for (int i=1; i<=result.groupCount(); i++)
            System.out.println(result.group(i));
        s.close();
    }

    static void scannerDemo(){
        //The syntax for reading from stdin using the Scanner class is as follows:
        Scanner scan = new Scanner(System.in);
        scan.next(); // returns the next token of input
        scan.hasNext(); // returns true if there is another token of input (false otherwise)
        scan.nextLine(); // returns the next LINE of input
        scan.hasNextLine(); // returns true if there is another line of input
    }

    static void scannerDemoExample(){
        Scanner scan = new Scanner(System.in); // open scanner
        String s = scan.next(); // read the next token and save it to 's'
        scan.close(); // close scanner
        System.out.println(s); // print 's' to System.out, followed by a new line
    }

    public static void main(String[] args) {
    }
}
