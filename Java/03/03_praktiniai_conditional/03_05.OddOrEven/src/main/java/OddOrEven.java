import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number:");
        int number = Integer.parseInt(scan.nextLine());
        // Find out if a number is even or odd easily using the modulo operator %
        if (number % 2 == 0) { // w/o remainder
            System.out.println("Number " + number + " is even.");
        } else { // w/ remainder
            System.out.println("Number " + number + " is odd.");
        }
        scan.close();
    }
}
