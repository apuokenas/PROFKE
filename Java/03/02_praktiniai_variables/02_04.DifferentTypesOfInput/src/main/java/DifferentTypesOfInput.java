import java.util.Scanner;

public class DifferentTypesOfInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a string:"); // "bye-bye"
        String string = scan.nextLine();
        System.out.println("Give an integer:"); // 11
        int integer = Integer.parseInt(scan.nextLine());
        System.out.println("Give a double:"); // 4.2
        double dbl = Double.parseDouble(scan.nextLine());
        System.out.println("Give a boolean:"); // true/yes/positive, false/no/negative
        // Even though both methods can be used to parse a String to a boolean value...
        boolean bool = Boolean.valueOf(scan.nextLine()); // ...parseBoolean() returns a primitive boolean value
                                                         // while the valueOf() returns a Boolean object.
        // valueOf() caches the boolean value and returns the already created
        // Boolean.TRUE or Boolean.FALSE value instead of creating a new instance every
        // time.
        // If you don't need a new instance of the Boolean object then you should always
        // use valueOf() to create Boolean objects to get better performance.
        // This method is also overloaded to create a Boolean object from both Strings
        // as well as primitive boolean value, e.g. both valueOf(true) and
        // valueOf("true") will return same Boolean.TRUE object.
        // Using parseBoolean() is a mistake since it creates a primitive boolean and
        // then auto boxes to Boolean.
        // Using valueOf allows for reusing existing Boolean objects. Since Booleans are
        // immutable this is fine.
        System.out.println("You gave the string " + string);
        System.out.println("You gave the integer " + integer);
        System.out.println("You gave the double " + dbl);
        System.out.println("You gave the boolean " + bool);
        scan.close();
    }
}
