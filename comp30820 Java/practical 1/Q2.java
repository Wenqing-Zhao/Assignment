// Use the scanner class to get the input content
// Use the formula to calculate the result
// show it in the console
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input the r:");
        double r = scanner.nextDouble();
        if(r > 0){
            double s = 2 * r * Math.sin(Math.PI / 5);
            double area = 5 * s * s / (4 * Math.tan(Math.PI / 5));
            System.out.println(area);
        } else {
            System.out.println("Sorry, the number you inputted is less than 0.");
        }
    }
}
