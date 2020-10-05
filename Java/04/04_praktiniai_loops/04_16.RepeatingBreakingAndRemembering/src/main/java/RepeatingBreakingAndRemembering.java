import java.util.Scanner;

public class RepeatingBreakingAndRemembering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int number = 0;
        int sum = 0;
        int nos = 0;
        int evenNos = 0;
        int oddNos = 0;
        while (number != -1) {
            number = Integer.parseInt(scanner.nextLine());
            if (number != -1) {
                sum = sum + number;
                nos = nos + 1;
                if (number % 2 == 0) {
                    evenNos = evenNos + 1;
                } else {
                    oddNos = oddNos + 1;
                }
            }
        }
        if (number == -1) {
            System.out.println("Thx! Bye!");
            System.out.println("Sum: " + sum);
            System.out.println("Numbers: " + nos);
            System.out.println("Average: " + (double) sum / nos);
            System.out.println("Even: " + evenNos);
            System.out.println("Odd: " + oddNos);
        }
        scanner.close();
    }
}
