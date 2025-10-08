public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 25; 
        String binary = decimalToBinary(decimal);
        System.out.println("Decimal: " + decimal + " to Binary: " + binary);
    }

    public static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            binary.insert(0, decimal % 2);
            decimal /= 2;
        }
        return binary.toString();
    }
}