package other;

public class LocalVariableTypeInference {
    /* "var" can't be used for declaring a global variable. */
    // var isWaterWet = true;

    public static void main(String[] args) {
        /* A variable can be declared as "var" and Java infers the data type based on what is assigned to the variable. */
        var isWaterWet = true;
    }
}
