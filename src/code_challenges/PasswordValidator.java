package code_challenges;

// Java code below

/*********************************************************
 Write your answer here, and then test your code.
 Your job is to implement the validatePassword() method.
 **********************************************************/

public class PasswordValidator {
    // Current credentials
    static String username = "jane_doe";
    static String currentPassword = "passw0rd";


    static boolean validatePassword(String newPassword) {
        /***************************************************
         * TODO: Your code goes here
         *
         * Criteria:
         *   at least 8 characters long
         *   contains an uppercase letter
         *   contains a special character
         *   does not contain the username
         *   is not the same as the old password
         */
        boolean isValid = true;

        int minimumLength = 8;


        if (newPassword.length() < minimumLength) {
            isValid = false;
            System.out.println("Your password must be at least 8 characters long.");
        }

        if (newPassword.equals(newPassword.toLowerCase())) {
            isValid = false;
            System.out.println("Your password must include an uppercase letter.");
        }

        if (newPassword.matches("[a-zA-Z0-9]*")) {
            isValid = false;
            System.out.println("Your password must include a special character (e.g. %,$[:).");
        }

        if (newPassword.toUpperCase().contains(username.toLowerCase())) {
            isValid = false;
            System.out.println("Your password cannot contain the username.");
        }

        if (newPassword.equals(currentPassword)) {
            isValid = false;
            System.out.println("Your password must be different from your current password.");
        }

        return isValid;
    }

    public static void main(String[] args) {
        /*************************************************************
         This is how your code will be called.
         Your answer should be a boolean value indicating if the password
         matches all the criteria.
         You can edit this code to try different testing cases.
         *************************************************************/
        String newPassword = "P@ssw0rd";
        boolean result = validatePassword(newPassword);
        System.out.println(result);
    }
}
