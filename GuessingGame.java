import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100) + 1; // generates a random number between 1 and 100
        Scanner input = new Scanner(System.in);
        int guess;

        while (true) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();

            if (guess == number) {
                System.out.println("Congratulations, you guessed the number!");
                break;
            } else if (guess < number) {
                System.out.println("Your guess is too low. Try again.");
            } else {
                System.out.println("Your guess is too high. Try again.");
            }
        }
        input.close();
    }
}