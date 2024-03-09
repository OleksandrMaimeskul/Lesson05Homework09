import java.util.Random;
import java.util.Scanner;

public class Lesson05Homework09 {
    public static void main(String[] args) {
        Random random = new Random();
        int pcNumber = random.nextInt(11 );
        int totalAttempts = 3;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's guess the number from 0 to 10. " +
                "You have 3 attempts.");
        while (totalAttempts > 0) {
            System.out.println("Enter your number.");
            int guessed = scanner.nextInt();
            if (guessed > 10) {
                System.out.println("Out of range!");
            } else if (guessed < 0) {
                System.out.println("Out of range!");
            } else if (guessed == pcNumber) {
                System.out.println("Congratulation you win!");
            } else {
                System.out.println("Not correct, please try again!");
                totalAttempts--;
            }
        }
        System.out.println("No more attempts, please try your lucky next time....");
        scanner.close();
    }
}