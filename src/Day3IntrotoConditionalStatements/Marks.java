package Day3IntrotoConditionalStatements;

/**
 * Created by bobsira on 8/23/17.
 */
public class Marks {
    private static final int GRADE_E = 0;
    private static final int GRADE_D = 1;

    public static boolean isBetween(int x, int lower, int upper)
    {
        return lower <=x && x<=upper;
    }

    private static int getMarkCode(int markParam){
        if(isBetween(markParam, 0, 20))
            return GRADE_E;
        else if(isBetween(markParam, 21, 29))
            return GRADE_D;
        return 0;
    }

    public static void printMark(int mark){
        switch(getMarkCode(mark)){
            case GRADE_E:
                System.out.println("Grade is E");
                break;
            case GRADE_D:
                System.out.println("Grade is D");
                break;
        }
    }

    public static void main(String[] args) {
        printMark(25);
    }
}
