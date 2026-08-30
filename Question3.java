import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //reading the user's name and age

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();


        //calculating the user's age in five years

        int futureAge = age + 5;

        //printing the results
        System.out.println("Hello " + name + "! You will be " + futureAge + " years old in five years.");
    }
}