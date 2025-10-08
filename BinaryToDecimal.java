public class BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "1010"; // Example binary number
        int decimal = binaryToDecimal(binary);
        System.out.println("Binary: " + binary + " to Decimal: " + decimal);
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int base = 1; // 2^0

        int length = binary.length();
        for (int i = length - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += base;
            }
            base *= 2; // Increase base by power of 2
        }
        return decimal;
    }
}