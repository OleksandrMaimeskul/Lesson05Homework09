import java.util.Random;
import java.util.Scanner;

public class Lesson05Homework09 {
    public static void main(String[] args) {
        Random random = new Random();
        int pcNumber = random.nextInt(11);
        int totalAttempts = 5;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's guess the number from 0 to 10. " +
                "You have 5 attempts.");
        while (totalAttempts > 0) {
            System.out.println("Enter your number.");
            int guessed = scanner.nextInt();
            totalAttempts--;
            if (guessed > 10) {
                System.out.println("Out of range!");
            } else if (guessed < 0) {
                System.out.println("Out of range!");
            } else if (guessed == pcNumber) {
                System.out.println("Congratulation you win!");
                break;
            } else {
                System.out.println("Not correct, please try again!");
            }
        }
        System.out.println("No more attempts.");
        scanner.close();
    }
}