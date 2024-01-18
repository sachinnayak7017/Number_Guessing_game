import java.util.Random;
import java.util.Scanner;

public class Guessing_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Hi Player");
        System.out.println("Welcome to the GUESSING GAME");

        boolean playAgain = true;

        while (playAgain) {
            int min = 1;
            int max = 100;
            int number = min + random.nextInt(max - min + 1);

            System.out.println("Enter your guess between " + min + " and " + max + ": ");
            int userGuess = scanner.nextInt();

            System.out.println("Your guess: " + userGuess);
            System.out.println("Correct number: " + number);

            if (userGuess == number) {
                System.out.println("Congratulations! You guessed the right number.");
            } else if (userGuess > number) {
                System.out.println("Your guess is too high.");
            } else {
                System.out.println("Your guess is too low.");
            }

            System.out.println("Do you want to play again? (Enter 'yes' to continue, any other input to stop)");
            String playAgainInput = scanner.next().toLowerCase();
            playAgain = playAgainInput.equals("yes");
        }

        System.out.println("Thank you for playing! Goodbye.");
        scanner.close();
    }
}
