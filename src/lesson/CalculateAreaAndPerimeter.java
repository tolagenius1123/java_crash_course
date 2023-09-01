package lesson;

public class CalculateAreaAndPerimeter {
    public static void main(String[] args) {
        double radius = 6.5;
        double pie = 3.14159;

        double perimeter = 2 * radius * pie;
        double area = radius * radius * pie;

        System.out.print("The Area and Perimeter of a circle with radius of 6.5 is "+perimeter+ " and "+area);

    }
}
