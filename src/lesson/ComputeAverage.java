package lesson;

import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter 3 whole numbers: ");
        int number1 = userInput.nextInt();
        int number2 = userInput.nextInt();
        int number3 = userInput.nextInt();

        int average = (number1 + number2 + number3) / 3;

        System.out.println("The average of " +number1+ ", " +number2+ " and " +number3+ " is " + average);

    }
}
