public class Lab_04_01 {
    public static void main(String[] args) {
        double itemPrice = 9.99;
        final double TAX_RATE = 0.05;
        double totalPrice = 0;

        totalPrice = itemPrice + (itemPrice * TAX_RATE);

        System.out.println("The tax amount : $" + (itemPrice * TAX_RATE));
        System.out.println("The total price is $" + totalPrice);
    }
}
