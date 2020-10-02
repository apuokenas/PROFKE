import java.util.Scanner;

public class NumberAndSumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int answer = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int counter = 0;
        while (answer != 0) {
            sum = sum + answer;
            System.out.println("Give a number:");
            answer = Integer.parseInt(scanner.nextLine());
            counter++;
        }
        System.out.println("Number of numbers: " + counter);
        System.out.println("Sum of the numbers: " + sum);
        scanner.close();
    }
}
