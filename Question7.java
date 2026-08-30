import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //reading the temperature in degrees Celsius
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = sc.nextDouble();

        //converting to fahrenheit
        double fahrenheit = celsius * 9.0 / 5.0 + 32;

        // printing the results
        System.out.println(celsius + "degrees Celsius is" + fahrenheit + "degrees Fahrenheit.");
    }
}