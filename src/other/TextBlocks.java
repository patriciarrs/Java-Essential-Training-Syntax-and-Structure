package other;


public class TextBlocks {
    public static void main(String[] args) {
        /*
        Representing multiple lines of texts within a string can be very tedious:
        All the quotation marks need to be escaped.
        New line characters are needed for each line break and plus signs are needed to join each line.
        */
        String responseString =
                "[\n" +
                        "{\n" +
                        "\"id\": 13344,\n" +
                        "\"customerId\": 12212,\n" +
                        "\"type\": \"CHECKING\",\n" +
                        "\"balance\": 4022.93,\n" +
                        "}\n" +
                        "]";

        /*
        Text blocks allow the use of 3 quotation marks to open and close a big block of text.
        With text blocks, text cannot begin on the same line as the opening quote.
        The preferred way is to have both the opening and closing quotes aligned on their own respective lines with the text block in between.
        While still strings, text blocks provides a more readable approach to dealing with long complex strings such as JSON or our SQL queries.
        */
        String responseTextBlock = """
                [
                    {
                        "id": 13344,
                        "customerId": 12212,
                        "type": "CHECKING",
                        "balance": 3821.93,
                    }
                ]
                """;
    }
}
