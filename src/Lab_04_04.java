public class Lab_04_04 {
    public static void main(String[] args) {
        int numToExamine = 10;
        // program will then determine that since 2 mod ( which is divide ) 2 is 0 that numToExamine is even.

        boolean isEven = numToExamine % 2 == 0;
        boolean isOdd = numToExamine % 2 != 0;

        System.out.println( numToExamine + " is " + ( isEven ? "even" : "odd"));

    }
}
