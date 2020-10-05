import java.util.Scanner;

public class SumOfASequenceTheSequel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number? ");
        int firstNo = Integer.parseInt(scanner.nextLine());
        System.out.print("First number? ");
        int lastNo = Integer.parseInt(scanner.nextLine());
        if (firstNo <= lastNo) {
            int sum = 0;
            for (int i = firstNo; i <= lastNo; i++) {
                sum = sum + i;
            }
            System.out.println("The sum is " + sum);
        }
        scanner.close();
    }
}
