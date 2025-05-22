package other;

public class Records {
    Account account = new Account(13344, 12212, "CHECKING", 4033.93);

    /* Records are immutable:
     - the fields of a record are final and their value cannot be changed once initialized;
     - there are no setter methods generated for records. */
    // account.setType("SAVINGS");

    /* Records have accessor methods.
    They do not start with the word get - the accessor method name is the same as the field name. */
    double balance = account.balance();
}
