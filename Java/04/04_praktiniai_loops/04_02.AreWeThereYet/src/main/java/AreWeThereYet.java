import java.util.Scanner;

public class AreWeThereYet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        while (answer != 4) {
            System.out.println("Give a number:");
            answer = Integer.parseInt(scanner.nextLine()); // TODO: Handle other data type inputs
        }
        scanner.close();
    }
}
