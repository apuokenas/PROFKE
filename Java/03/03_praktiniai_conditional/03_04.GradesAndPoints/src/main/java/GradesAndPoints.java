import java.util.Scanner;

public class GradesAndPoints {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int points = Integer.parseInt(scan.nextLine());
        printGrade(determineGrade(points));
        scan.close();
    }

    public static String determineGrade(int points) {
        String grade = "";
        if (points < 0) {
            return "impossible!";
        } else if ((0 <= points) && (points <= 49)) {
            grade = "failed";
        } else if ((50 <= points) && (points <= 59)) {
            grade = "1";
        } else if ((60 <= points) && (points <= 69)) {
            grade = "2";
        } else if ((70 <= points) && (points <= 79)) {
            grade = "3";
        } else if ((80 <= points) && (points <= 89)) {
            grade = "4";
        } else if ((90 <= points) && (points <= 100)) {
            grade = "5";
        } else if (points > 100) {
            grade = "incredible!";
        }
        return grade;
    }

    public static void printGrade(String grade) {
        System.out.println("Grade: " + grade);
    }
}
