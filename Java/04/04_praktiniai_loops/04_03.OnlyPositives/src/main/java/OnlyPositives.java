import java.util.Scanner;

public class OnlyPositives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = prompt(scanner);
        while (true) {
            if (answer < 0) {
                System.out.println("Unsuitable number");
                answer = prompt(scanner);
            } else if (answer == 0) {
                break;
            } else {
                System.out.println(answer * answer);
                answer = prompt(scanner);
            }
        }
        scanner.close();
    }

    public static int prompt(Scanner scan) {
        System.out.println("Give a number:");
        int number = Integer.parseInt(scan.nextLine());
        return number;
    }
}
