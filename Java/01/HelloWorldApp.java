import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * The HelloWorldApp class implements an application that greets a user on a
 * standard output either in an interactive way or a non-interactive one, as per
 * user's input.
 *
 * @author Mantas Tumėnas (JP-20/3)
 * @version 1.1
 */
class HelloWorldApp { // Class definition
    /**
     * Entry point for the application
     */
    public static void main(String[] args) { // Definition of 'main' method with modifiers 'public' and 'static' and
                                             // signature 'String[] args' (the method accepts a single argument--an
                                             // array of elements of type 'String'--at runtime, e.g.: 'java MyApp arg1
                                             // arg2')
        printMenu(); // Invoking other methods
    }

    public static void doNotGreet() {
        System.out.print("Invalid option!");
    }

    /**
     * Interactive HelloWorld
     */
    public static void greetInteractively() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = input.next();
            System.out.println("Hello " + name + "!");
        } catch (Exception e) {
            terminate(e);
        }
    }

    /**
     * Non-interactive HelloWorld
     */
    public static void greetNonInteractively() {
        System.out.println("Hello World!");
    }

    public static void printMenu() {
        try (Scanner input = new Scanner(System.in)) { // Using 'try-with-resources' (JDK 1.7+) to automatically close
                                                       // the scanner thus freeing up resources and preventing memory
                                                       // leak. Invoking a constructor of the 'Scanner' class with an
                                                       // argument 'System.in' and returning a reference to a newly
                                                       // constructed object.
            System.out.print("Choose a HelloWorld application option:\n\tn - non-interactive,\n\ti - interactive\n");
            String option = input.next();
            switch (option) {
                case "N":
                case "n":
                    greetNonInteractively();
                    break;
                case "I":
                case "i":
                    greetInteractively();
                    break;
                default:
                    doNotGreet();
            }
        } catch (Exception e) {
            terminate(e);
        }
    }

    public static void terminate(Exception e) {
        if (e instanceof NoSuchElementException) {
            // NoSuchElementException thrown if entered Ctrl+C and Scanner object is closed
            System.out.println("Terminating application...");
        } else {
            e.printStackTrace();
        }
    }
}
