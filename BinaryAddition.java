import java.util.Scanner;

public class BinaryAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first binary number: ");
        String binary1 = scanner.nextLine();
        System.out.print("Enter the second binary number: ");
        String binary2 = scanner.nextLine();

        int maxLength = Math.max(binary1.length(), binary2.length());

        // Pad the shorter binary number with leading zeros
        binary1 = padWithLeadingZeros(binary1, maxLength);
        binary2 = padWithLeadingZeros(binary2, maxLength);

        String sum = performBinaryAddition(binary1, binary2);
        System.out.println("Binary sum: " + sum);
    }

    public static String padWithLeadingZeros(String binary, int maxLength) {
        StringBuilder paddedBinary = new StringBuilder(binary);
        while (paddedBinary.length() < maxLength) {
            paddedBinary.insert(0, "0");
        }
        return paddedBinary.toString();
    }

    public static String performBinaryAddition(String binary1, String binary2) {
        StringBuilder sum = new StringBuilder();
        int carry = 0;

        for (int i = binary1.length() - 1; i >= 0; i--) {
            int bit1 = binary1.charAt(i) - '0';
            int bit2 = binary2.charAt(i) - '0';
            int currentSum = bit1 + bit2 + carry;

            sum.insert(0, currentSum % 2);
            carry = currentSum / 2;
        }

        if (carry != 0) {
            sum.insert(0, carry);
        }

        return sum.toString();
    }
}
