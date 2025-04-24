package code_challenges;

// Java code below

/************************************************************
 Write your answer here, and then test your code.
 Your job is to update the story variable story to read like:
 On a [adjective] [season of the year] day, I drink a minimum
 of [whole number] cups of coffee.
 *************************************************************/

public class FillInTheBlanks {

    static String fillInTheBlank(String season, int numberOfCups, String adjective) {
        String story = "On a " + adjective + " " + season + " day, I drink a minimum of " + numberOfCups + " cups of coffee."; // TODO: Your code goes here.
        return story;
    }

    public static void main(String[] args) {
        /*************************************************************
         This is how your code will be called.
         Your answer should be a String that contains the entire story,
         including the variables.
         *************************************************************/
        String season = "winter";
        int numberOfCups = 4;
        String adjective = "cold";
        String result = fillInTheBlank(season, numberOfCups, adjective);
        System.out.println(result);
    }
}
