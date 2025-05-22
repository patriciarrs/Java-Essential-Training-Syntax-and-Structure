package other;

public class VariableArguments {
    /*
    With the main method:
    When a method explicitly specifies an array must be passed in, it requires the calling method to first create an array to send in.
    However, notice there is no length specified in the parameter.
    So even if the caller wanted to send only one value, they still need to put it inside an array.
    */
    public static void main(String[] args) {
        calculateSum();
        calculateSum(2, 4);
        calculateSum(2, 4, 6, 8, 10);
        calculateSum(new int[]{3, 4, 6, 7});
    }

    // Variable arguments (varargs), allows for a bit more flexibility with the arguments we send in.

    /**
     * Calculates the sum for any amount of integers.
     *
     * @param a variable argument: we can pass in zero or more integers
     *          Only one parameter is allowed to be a vararg.
     *          When a method has other parameters, the varargs parameter must be last.
     */
    public static void calculateSum(int... a) {
        int sum = 0;

        /* We implement the calculateSum method to handle these various with a for loop.
        Whether the values were sent as an explicit array or as individual integers, the parameter itself is treated as an array.
        */
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }

        System.out.println(sum);
    }
}
