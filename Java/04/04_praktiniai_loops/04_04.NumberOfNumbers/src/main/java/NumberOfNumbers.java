import java.util.Scanner;

public class NumberOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int answer = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        while (answer != 0) {
            System.out.println("Give a number:");
            answer = Integer.parseInt(scanner.nextLine());
            counter++;
        }
        System.out.println("Number of numbers: " + counter);
        scanner.close();
    }
}
