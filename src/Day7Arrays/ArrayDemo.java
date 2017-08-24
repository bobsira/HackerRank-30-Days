package Day7Arrays;

/**
 * Created by bobsira on 8/24/17.
 */
public class ArrayDemo {
    public static void demo(){
        // the number of elements we want to hold
        final int _arraySize = 4;

        // our array declaration
        String[] stringArray = new String[_arraySize];

        for(int i = 0; i < _arraySize; i++) {
            // assign value to index i
            stringArray[i] = "This is stored in index " + i;

            // print value saved in index i
            System.out.println(stringArray[i]);
        }
    }
    public static void main(String[] args) {
        demo();
    }
    //output
    //This is stored in index 0
    //This is stored in index 1
    //This is stored in index 2
    //This is stored in index 3
}
