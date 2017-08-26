import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    Scanner scanner = new Scanner(System.in);
    int max;
    int numberRequired;

    public GuessGame() {
        max = 100;
        Random random = new Random();
        numberRequired = Math.abs(random.nextInt() % (max + 1));
    }

    public static void main(String[] args) {
        GuessGame guessGame = new GuessGame();
        System.out.println("Welcome to my game. Try and guess my impossible number. It's between 0 and " + guessGame.max
                + " inclusive. Just type a number to get started");
        guessGame.play();
    }

    public void play() {
        while (true) {
            int userNumber = scanner.nextInt();

            if (userNumber > numberRequired) {
                System.out.println("Number is big, Try Again");
            } else if (userNumber < numberRequired) {
                System.out.println("Number is small, Try Again");
            } else {
                System.out.println("You win.!!! The correct number was " + numberRequired);
                break;
            }
        }
    }
}
