package other;

public class ShortCircuiting {
    public static void main(String[] args) {
        /* false and true evaluates to false.
        The program will not evaluate any of the other conditions because there's no way this can result to true. */
        if (false && true && true) {
            System.out.println("in the IF");
        } else {
            System.out.println("in the ELSE");
        }

        /* The program first evaluates true or false.
        Because the first condition is already true, there's no need to evaluate the second operand of this condition.
        This results to true and the program moves on to evaluate the rest with the second condition. */
        if (true || false && true) {
            System.out.println("in the IF");
        } else {
            System.out.println("in the ELSE");
        }
    }
}
