public class MonthlyBalance {
    public static void main(String[] args) {

        double balance = 5000;
        double interest = 0.17;
        double monthOne;
        double monthTwo;

        monthOne = balance * interest;
        monthTwo = (balance + monthOne) * interest;


        System.out.println("Your balance is: " + balance);
        System.out.println("The interest rate is: " + interest);
        System.out.println("Your interest after the first month will be: " + monthOne);
        System.out.println("Your interest after the second month will be: " + monthTwo);

    }

}
