import java.util.Scanner;

public class SecondsInADay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days would you like to convert to seconds?");
        int days = Integer.parseInt(scanner.nextLine());
        printSecs(calculateSecs(days));
        scanner.close();
    }

    public static int calculateSecs(int days) {
        int secs = days * 24 * 60 * 60;
        return secs;
    }

    public static void printSecs(int secs) {
        System.out.println(secs);
    }
}
