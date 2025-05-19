package code_challenges;

// Java code below

/***************************************************
 Write your answer here, and then test your code.
 Your job is to use a decision structure to test if
 the number of coins equals 1.00.
 ****************************************************/

public class ChangeForADollarGame {
    static boolean isADollar(int numOfPennies, int numOfNickels, int numOfDimes, int numOfQuarters) {
        /***************************************************
         Value of each coin
         ****************************************************/
        double penny = 0.01;
        double nickel = 0.05;
        double dime = 0.10;
        double quarter = 0.25;
        double dollar = 1.00;

        boolean won = false;

        // TODO: Your code goes here.
        double pennies = penny * numOfPennies;
        double nickels = nickel * numOfNickels;
        double dimes = dime * numOfDimes;
        double quarters = quarter * numOfQuarters;

        double total = pennies + nickels + dimes + quarters;

        if (total == dollar) {
            won = true;
        }

        return won;
    }

    public static void main(String[] args) {
        /*************************************************************
         This is how your code will be called.
         Your answer should be the largest value in the numbers array.
         You can edit this code to try different testing cases.
         *************************************************************/
        int numOfPennies = 10;
        int numOfNickels = 3;
        int numOfDimes = 5;
        int numOfQuarters = 1;
        boolean result = isADollar(numOfPennies, numOfNickels, numOfDimes, numOfQuarters);
        System.out.println(result);
    }
}

