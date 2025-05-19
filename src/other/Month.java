package other;

public class Month {
    public String getMonth(int month) {
        return "";
    }

    public int getMonth(String month) {
        return 1;
    }

    /* If we try to define overloaded methods with the same parameter list, we get a compilation error stating, that the method is already defined.
    This is because it has the exact same signature as another method. */
    /* public int getMonth(String monthName) {
        // ...
    } */
}
