package other;

/*
Records are great for modeling simple domain classes where we want to set the state of the object once
and then be able to access the state later in a program.
These types of classes are common referred to as POJOs, or Plain old Java objects.
*/
public record Account(int id,
                      int customerId,
                      String type,
                      double balance) {
    public void aNewMethod() {
        // do something
    }
}
