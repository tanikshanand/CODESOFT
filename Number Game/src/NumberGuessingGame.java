import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Specify the range for the random number
        int lowerLimit = 1;
        int upperLimit = 100;

        //The number of rounds won
        int score = 0;

        // Play the game until the user decides to quit
        while (true) {
            // Generate a random number within the specified range
            int randomNumber = random.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;

            // Set the limit for guessing the correct number to 10
            int guessLimit = 10;

            // Keep generating new random numbers until the user guesses the correct number or reaches the limit
            for (int i = 1; i <= guessLimit; i++) {
                // Prompt the user to enter their guess
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();

                // Compare the user's guess with the generated number
                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    score++; // Increment the score for each round won by user
                    break;
                } else if (userGuess > randomNumber) {
                    System.out.println("Your guess is too high. Try again.");
                } else {
                    System.out.println("Your guess is too low. Try again.");
                }

                // Limit the guesses to 10 per round
                if (i == guessLimit) {
                    System.out.println("You have exceeded the limit of 10 guesses. The correct number was: " + randomNumber);
                }
            }

            //Current score
            System.out.println("Your current score is: " + score);

            // Ask the user if they want to play again or not
            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();

            //If the user decides to quit
            if (!response.equalsIgnoreCase("yes")) {
                System.out.println("Thanks for playing! Your final score is: " + score);
                break;
            }
        }

        scanner.close();
    }
}