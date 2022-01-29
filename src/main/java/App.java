
import java.util.InputMismatchException;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        System.out.println("Hello, what is your name?");
        Scanner input = new Scanner(System.in);
        String userName = input.next();
        while (true) {
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
                    String usersGuess = guess(answer, userGuess);
                    if (usersGuess.equals("true")) {
                        System.out.println("You guessed the correct number " + answer + "! in " + (i + 1) + " tries!");
                        break;
                    }
                    System.out.println(usersGuess);
                    i++;
                } catch (InputMismatchException e) {
                    System.out.println("You must enter a number!");
                    input.next();
                }
            }
            System.out.println("Would you like to play again? (N to quit or any key to continue)");
            String userAnswer = input.next().toUpperCase();
            if ( userAnswer.equals("N") || userAnswer.equals("NO")) {
                break;
            }
        }
        input.close();
        System.exit(0);
    }

    public static String guess(int answer, int userGuess) {
        //checks if the users guess is equal to the answer and if not tells them if they are high or low
        if (userGuess == answer) {
            return "true";
        } else if (userGuess > answer) {
            return "You guess is too high.";
        } return "You guess is too low.";
    }
}
