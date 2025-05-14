package other;

public class Methods {
    /**
     * Header: public static int calculateSum(int number1, int number2)
     * Access Modifier: public (not required; if not specified, accessible by classes within the same package)
     * Non-access Modifier: static (not required; static, final, abstract, synchronized)
     * Return Type: int (required; if nothing will be returned, void)
     * Name of the method: calculateSum (verb + adjectives / nouns)
     * Parameter list: (int number1, int number2)
     * Signature: calculateSum(int number1, int number2) (name + parameter list; unique within a class)
     * Body: {...}
     */
    public static int calculateSum(int number1, int number2) {
        return number1 + number1;
    }

    /**
     * Return Type: void (nothing will be returned)
     */
    public static void main(String[] args) {

    }

    /**
     * Name of the method: isSumNegative - methods that return boolean ask a question
     */
    public static boolean isSumNegative(int number1, int number2) {
        int sum = number1 + number1;
        return sum < 0;
    }
}
