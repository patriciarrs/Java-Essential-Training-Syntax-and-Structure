package text_processing;

/*
Strings are not a primitive data type, and they are also not a wrapper class.
A string is an object that is a sequence of characters.
The string class provides a lot of helpful convenience methods.
*/
public class TextProcessor {
    public static void main(String[] args) {
        /*
        This string declaration is equivalent to creating an array of characters and sending it to the string constructor.
        Which means we can access a string just like we would in an array of characters and each character is an element in an array.
        */
        String myString = "abc";
        char[] data = {'a', 'b', 'c'};
        String myCharString = new String(data);

        /* Strings (and all other objects): we should compare them using the .equals() method as opposed to the == operator.
        // The == operator compares the memory locations.
        /* if (myString == myCharString) {
        }*/
        // The .equals() method compares the values.
        if (myString.equals(myCharString)) {
        }

        countWords("I love Java");
        reverseString("stop");
    }

    /**
     * Splits a String into an array by tokenizing it.
     * Counts words and prints them
     *
     * @param text Full string to be split
     */
    public static void countWords(String text) {
        String[] words = text.split(" ");

        int numberOfWords = words.length;
        String message = String.format("Your text contains %d words", numberOfWords);
        System.out.println(message);

        for (int i = 0; i < numberOfWords; i++) {
            System.out.println(words[i]);
        }
    }

    /**
     * Prints a String in reverse order
     *
     * @param text String to reverse
     */
    public static void reverseString(String text) {
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }
}
