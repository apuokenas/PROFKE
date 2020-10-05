import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int upperLimit = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= upperLimit; i++) {
            System.out.println(i);
        }
        scanner.close();
    }
}
