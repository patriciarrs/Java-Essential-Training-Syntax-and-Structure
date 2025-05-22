package other;

public class Arrays {
    public static void main(String[] args) {
        String player = "Bob";

        String[] players1 = new String[6];
        players1[0] = "Bob";
        players1[1] = "Luke";
        players1[2] = "Chad";
        players1[3] = "Dan";
        players1[4] = "Henry";
        players1[5] = "Joe";

        System.out.println("The third player is " + players1[2]);

        String[] players2 = {"Bob", "Luke", "Chad", "Dan", "Henry", "Joe"};

        boolean chadFound = false;

        for (int i = 0; i < players2.length; i++) {
            if (players2[i].equals("Chad")) {
                chadFound = true;
                break;
            }
        }
    }
}
