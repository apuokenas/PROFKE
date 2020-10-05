import java.util.Scanner;

public class CountingToHundred {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingPoint = Integer.parseInt(scanner.nextLine());
        for (int i = startingPoint; i <= 100; i++) {
            System.out.println(i);
        }
        scanner.close();
    }
}
