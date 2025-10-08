public class OctalToDecimal {
    public static void main(String[] args) {
        String octal = "17"; // Example octal number
        int decimal = octalToDecimal(octal);
        System.out.println("Octal: " + octal + " to Decimal: " + decimal);
    }

    public static int octalToDecimal(String octal) {
        int decimal = 0;
        int base = 1; // 8^0

        int length = octal.length();
        for (int i = length - 1; i >= 0; i--) {
            int digit = octal.charAt(i) - '0'; // Convert char to int
            decimal += digit * base;
            base *= 8; // Increase base by power of 8
        }
        return decimal;
    }
}