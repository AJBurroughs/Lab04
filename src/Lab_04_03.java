public class Lab_04_03 {
    public static void main(String[] args) {
        int balance = 5000;
        double INTEREST_RATE = 0.17;
        int month = 2;

        for (int i = 1; i <= month; i++) {
            balance = (int) (balance + (balance * INTEREST_RATE));
            System.out.println("The balance after month " + i + " is $" + balance);
    }

    }
}
