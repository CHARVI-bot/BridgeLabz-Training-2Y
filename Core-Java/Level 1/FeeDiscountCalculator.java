import java.util.Scanner;

public class FeeDiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // ✅ Declare and initialize 'input'

        System.out.print("Enter the fee amount: ");
        double fee = input.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discount = input.nextDouble();

        double discountedFee = fee - (fee * discount / 100);
        System.out.println("Discounted fee: " + discountedFee);
    }
}