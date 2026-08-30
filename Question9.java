import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //reading a full sentence using nextline
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        //applying string methods
        int length = sentence.length();
        String upper = sentence.toUpperCase();
        String lower = sentence.toLowerCase();
        boolean containsJava = sentence.contains("Java");

        //printing the results
        System.out.println("Length: " + length);
        System.out.println("Upper case: " + upper);
        System.out.println("Lower case: " + lower);
        System.out.println("Contains \"Java\": " + containsJava);
    }
}