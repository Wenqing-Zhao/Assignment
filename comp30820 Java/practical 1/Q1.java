// Use the scanner class to get the input content and show it in the console
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input the user name:");
        String new_user = scanner.next();
        System.out.print("Please input the student id:");
        int student_id = scanner.nextInt();
        System.out.println("Welcome " + new_user + " - " + student_id + " to COMP30820");
    }
}
