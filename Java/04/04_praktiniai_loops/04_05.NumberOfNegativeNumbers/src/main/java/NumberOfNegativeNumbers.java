import java.util.Scanner;

public class NumberOfNegativeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int answer = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        while (answer != 0) {
            if (answer < 0) {
                counter++;
            }
            System.out.println("Give a number:");
            answer = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Number of negative numbers: " + counter);
        scanner.close();
    }
}
