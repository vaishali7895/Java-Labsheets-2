public class NeonNumber {
    public static void main(String[] args) {
        int num = 9; // Example number
        if (isNeon(num)) {
            System.out.println(num + " is a neon number.");
        } else {
            System.out.println(num + " is not a neon number.");
        }
    }

    public static boolean isNeon(int num) {
        int square = num * num;
        int sumOfDigits = 0;

        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }

        return sumOfDigits == num;
    }
}