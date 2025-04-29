package other;

public class LogicalOperators {
    public static void main(String[] args) {
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        int salary = 50000;
        int years = 10;

        if (salary >= requiredSalary && years >= requiredYearsEmployed) {
            System.out.println("Congrats! You qualify for the loan");
        } else {
            System.out.println("Sorry, you do not qualify for the loan");
        }
    }
}
