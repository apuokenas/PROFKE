import java.util.Scanner;

public class FromWhereToWhere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Where to? ");
        int upperLimit = Integer.parseInt(scanner.nextLine());
        System.out.print("Where from? ");
        int startingPoint = Integer.parseInt(scanner.nextLine());
        if (upperLimit >= startingPoint) {
            for (int i = startingPoint; i <= upperLimit; i++) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
