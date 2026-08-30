import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //reading the full name from the user
        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();

        //splitting the full name into first name and surname
        int spaceIndex = fullName.indexOf(' ');

        String firstName = fullName.substring(0, spaceIndex);
        String surname = fullName.substring(spaceIndex + 1);

        //getting the initials of the user
        String initials = ("" + firstName.charAt(0)).toUpperCase() + ("" + surname.charAt(0)).toUpperCase();
        System.out.println("First name: " + firstName);
        System.out.println("Surname: " + surname);
        System.out.println("Initials: " + initials);
    }
}