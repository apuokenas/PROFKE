import java.util.Scanner;

public class MultiplicationFormula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int number2 = Integer.parseInt(scanner.nextLine());
        // System.out.println(number1 + " * " + number2 + " = " + number1 * number2); //
        // "2 * 3 = 6"
        // int product = number1 * number2;
        // System.out.println(number1 + " * " + number2 + " = " + product);
        System.out.println(number1 + " * " + number2 + " = " + Integer.toString(number1 * number2));
        scanner.close();
    }
}
