package decision_structures;

import java.util.Scanner;

/*
 * SWITCH
 * Have a user enter their letter grade, and using a switch statement,
 * print out a message letting them know how they did.
 */
public class GradeMessageStatement {

    public static void main(String[] args) {

        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;
        switch (grade) {
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You need to work a bit harder";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "Error. Invalid grade";
                break;
        }

        System.out.println(message);

        /* A fall-through occurs when we eliminate the break statement at the end of a case.
        If the value of grade was A, it would execute case A.
        However, because case A does not have a break statement, it would continue on to execute case B.
        Sometimes, that's by design, as in the case of A and B here, where we may want to print the same message. */
        /* switch (grade) {
            case "A":
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
        } */
    }
}

