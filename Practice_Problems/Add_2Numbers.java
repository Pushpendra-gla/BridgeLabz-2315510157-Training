package Practice_Problems;
import java.util.Scanner;
public class Add_2Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        scanner.close();
        System.out.println("Sum: " + sum);
    }
} 