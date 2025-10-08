public class BinaryToOctal {
    public static void main(String[] args) {
        String binary = "101101"; 
        String octal = binaryToOctal(binary);
        System.out.println("Binary: " + binary + " -> Octal: " + octal);
    }

    public static String binaryToOctal(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        return Integer.toOctalString(decimal);
    }
}