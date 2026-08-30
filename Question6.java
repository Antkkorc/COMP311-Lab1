import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //reading three test scores from the user
        System.out.print("Enter three scores: ");
        int score1 = sc.nextInt();
        int score2 = sc.nextInt();
        int score3 = sc.nextInt();

        //calculating average
        double average = (score1 + score2 + score3) / 3.0;

        //printing the result with decimal places
        System.out.println("Average: " + average);
    }
}