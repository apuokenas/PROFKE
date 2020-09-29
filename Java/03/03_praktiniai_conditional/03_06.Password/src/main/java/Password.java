import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final String PASSWORD = "Caput Draconis";
        System.out.println("Password?");
        String pswd = scan.nextLine();
        if (pswd.equals(PASSWORD)) { // equals() checks the actual contents of the string, and the == operator checks
                                     // whether the references to the objects are equal.
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
        scan.close();
    }
}
