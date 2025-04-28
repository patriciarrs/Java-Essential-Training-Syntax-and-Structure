package decision_structures;

import java.util.Scanner;

/*
 * SWITCH
 * Have a user enter their letter grade, and using a switch statement,
 * print out a message letting them know how they did.
 */
public class GradeMessageExpression {

    public static void main(String[] args) {

        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message = switch (grade) {
            case "A", "B" -> "Excellent job!";
            case "C" -> "Good job!";
            case "D" -> "You need to work a bit harder";
            case "F" -> "Uh oh!";
            default -> "Error. Invalid grade";
        };

        System.out.println(message);

        /* Switch expressions allow us to include more than just the assignment in our cases.
        To do so, we'd enclose all the case statements inside a set of curly braces after the arrow.
        When doing this, the final line of the case must yield a value to be assigned to the result variable. */
        /* float firstNumber = 2;
        float secondNumber = 8;
        String operation = "+";

        float result = switch (operation) {
            case "+" -> {
                System.out.println("Adding...");
                yield firstNumber + secondNumber;
            }
            case "-" -> {
                System.out.println("Subtracting...");
                yield firstNumber - secondNumber;
            }
            default -> 0;
        };

        System.out.println(result); */
    }
}
