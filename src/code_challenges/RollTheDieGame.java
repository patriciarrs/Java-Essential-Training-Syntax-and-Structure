package code_challenges;

// Java code below
/***************************************************
 Write your answer here, and then test your code.
 Your job is to use a repetition structure to roll a die
 up to 5 times to advance a game board.
 ****************************************************/

import java.util.Random;

class RollTheDieGame {
    static String playGame() {
        int lastSpace = 20;
        int currentSpace = 0;
        int maxRolls = 5;
        Random random = new Random();
        String tooLow = "You're on space %d. Sorry, you lose!";
        String tooHigh = "You've exceeded %d spaces. Sorry, you lose!";
        String justRight = "You're on space %d. Congrats, you win!";

        /*
         TODO: Your code goes here.
         Use the following for your return statements within the loop:

         return String.format(justRight, currentSpace);
         return String.format(tooHigh, lastSpace);
         return String.format(tooLow, currentSpace);
        */

        for (int i = 1; i <= maxRolls; i++) {
            // Roll the die
            int die = random.nextInt(6) + 1;

            // Current space
            currentSpace = currentSpace + die;

            if (currentSpace == lastSpace) {
                return String.format(justRight, currentSpace);
            } else if (currentSpace > lastSpace) {
                return String.format(tooHigh, lastSpace);
            }
        }
        
        return String.format(tooLow, currentSpace);
    }

    public static void main(String[] args) {
        /*************************************************************
         This is how your code will be called.
         Your answer should return a String indicating the results of
         the game.
         *************************************************************/
        String result = playGame();
        System.out.println(result);
    }
}
