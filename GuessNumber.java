import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(10) + 1;
        System.out.println("Number Guessing Game");
        System.out.println("Guess a number between 1 to 10");
        System.out.print("Enter your guess: ");
        int guess = sc.nextInt();
        if(guess == number) {
            System.out.println("Correct Guess!");
        }
        else {
            System.out.println("Wrong Guess");
            System.out.println("Correct Number was: " + number);
        }
        sc.close();
    }
    
}
