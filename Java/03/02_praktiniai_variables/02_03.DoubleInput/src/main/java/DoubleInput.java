import java.util.Scanner;

public class DoubleInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        double number = Double.parseDouble(scanner.nextLine()); // More secure than `double number =
                                                                // scanner.nextDouble();`
        System.out.println("You gave the number " + number);
        scanner.close();
    }
}
