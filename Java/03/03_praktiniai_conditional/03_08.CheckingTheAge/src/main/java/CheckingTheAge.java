import java.util.Scanner;

public class CheckingTheAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int AGE_LIMIT_MIN = 0;
        final int AGE_LIMIT_MAX = 120;
        System.out.print("How old are you? ");
        int age = Integer.parseInt(scan.nextLine());
        if ((age >= AGE_LIMIT_MIN) && (age <= AGE_LIMIT_MAX)) {
            System.out.println("OK"); // TODO: Handle -0 input
        } else {
            System.out.println("Impossible!");
        }
        scan.close();
    }
}
