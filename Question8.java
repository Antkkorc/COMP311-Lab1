import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //reading length and width
        System.out.print("Enter the length: ");
        double length = sc.nextDouble();

        System.out.print("Enter the width: ");
        double width = sc.nextDouble();

        //calculating area and perimeter
        double area = length * width;
        double perimeter = 2 * (length + width);

        //printing the results
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}