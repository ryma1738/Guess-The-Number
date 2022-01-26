import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        System.out.println("Hello, what is your name?");
        Scanner input = new Scanner(System.in); 
        String userName = input.next();
        Boolean exit = true;
        while (exit) {
            System.out.println(userName + ", I am thinking of a number between 1 - 25.");
            Short i = 0;
            int answer = (int) Math.round(Math.random() * 25);
            
            while (true) {
                try {
                    if (i == 6) {
                    System.out.println("You took to many tries (6) to guess the number. The number was " + answer);
                    break;
                }
                System.out.println("Take a guess");
                Short userGuess = input.nextShort();

                if (userGuess == answer) {
                    System.out.println("You guessed the correct number " + answer + "! in " + (i + 1) + " tries!");
                    break;
                } else if (userGuess > answer) {
                    System.out.println("You guess is too high.");
                }
                else {
                    System.out.println("You guess is too low.");
                }
                i++;
                } catch (InputMismatchException e) {
                    System.out.println("You must enter a number!");
                    input.next();
                }
                
            }
            System.out.println("Would you like to play again? (N to quit or any key to continue)");
            String userAnswer = input.next();
            if (userAnswer.equals("n") || userAnswer.equals("N") || userAnswer.equals("No") || userAnswer.equals("no")) {
                break;
            } 
        }
        input.close();
        System.exit(0);
    }
}
