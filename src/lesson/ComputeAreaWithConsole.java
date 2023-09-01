package lesson;

import java.util.Scanner;

public class ComputeAreaWithConsole {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number for radius: ");
        double radius = userInput.nextDouble();

        double area = radius * radius * 3.14159;

        System.out.println("The area for the circle of radius " +radius+ " is " +area);
    }
}
