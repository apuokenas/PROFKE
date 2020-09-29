import java.util.Scanner;

public class SpeedingTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SPEED_LIMIT = 120;
        System.out.println("Give speed:");
        int speed = Integer.parseInt(scanner.nextLine());
        if (speed > SPEED_LIMIT) {
            System.out.println("Speeding ticket!");
        }
        scanner.close();
    }
}
