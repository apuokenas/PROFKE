import java.util.Scanner;

public class AverageOfNumbers {
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
        if (counter > 0) {
            System.out.println("Average of the numbers: " + (double) sum / counter);
        } else {
            System.out.println("Cannot calculate the average"); // Preventing NaN if 0 was entered as the first number
        }
        scanner.close();
    }
}
