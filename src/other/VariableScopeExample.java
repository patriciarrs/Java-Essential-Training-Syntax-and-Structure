package other;

public class VariableScopeExample {
    String myVariable = "abc"; // declaring global variable

    public void method1() {
        System.out.println("global: " + myVariable); // referencing global variable

        String myVariable = "def"; // defining local variable

        System.out.println("local: " + myVariable); // referencing local variable (it has a lesser scope)

        System.out.println("global: " + this.myVariable); // referencing global variable
    }

    public void method2() {
        System.out.println("Global: " + myVariable); // referencing global variable

        myVariable = "ghi"; // updating global variable

        System.out.println("Global: " + myVariable); // referencing global variable
    }

    public void method3() {
        int number = 5; // local variable

        if (number < 5) {
            String myVariable = "abc"; // local variable
        }

        System.out.println(myVariable); // global variable
    }
}
