public class Lab_04_03_MonthyCCBalance {
    public static void main(String[] args) {
        double creditCardBalance = 5000.00;
        double monthlyInterestRate = 0.17 / 12;

        double interestMonthOne = creditCardBalance * monthlyInterestRate;
        double balanceAfterMonthOne = creditCardBalance + interestMonthOne;

        double interestMonthTwo = balanceAfterMonthOne * monthlyInterestRate;
        double balanceAfterMonthTwo = balanceAfterMonthOne + interestMonthTwo;

        System.out.println("Starting balance: $" + creditCardBalance);
        System.out.println("Monthly interest rate: " + monthlyInterestRate);
        System.out.println("Interest due after month one: $" + interestMonthOne);
        System.out.println("Balance after month one: $" + balanceAfterMonthOne);
        System.out.println("Interest due after month two: $" + interestMonthTwo);
        System.out.println("Balance after month two: $" + balanceAfterMonthTwo);
    }
}
