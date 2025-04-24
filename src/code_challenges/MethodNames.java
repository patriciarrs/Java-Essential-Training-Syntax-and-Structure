package code_challenges;

// Java code below

/***************************************************
 Write your answer here, and then test your code.
 Your job is to identify the method's name.
 ****************************************************/

public class MethodNames {

    static String message = "default message";

    public static void main(String[] args) {
        // TODO: Write the method's name inside of the quotation marks below
        String methodName = "main";
        message = "The name of this method is " + methodName;

        /*************************************************************
         This is how your code will be called.
         Your answer should contain the method's name.
         *************************************************************/
        String result = message;

        System.out.println(result);
    }

}
