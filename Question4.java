import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //reading a whole number
        System.out.print("Enter a whole number: ");
        int wholeNumber = sc.nextInt();

        // reading a decimal number
        System.out.print("Enter a decimal number: ");
        double decimalNumber = sc.nextDouble();

        // reading a single word
        System.out.print("Enter a single word: ");
        String word = sc.next();

        //printing the results
        System.out.println("You entered " + wholeNumber + ", " + decimalNumber + ", and the word " + word + ".");
    }
}