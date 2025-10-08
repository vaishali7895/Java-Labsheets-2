public class RecursionSum {
    public static void main(String[] args) {
        int n = 5; 
        int result = sum(n);
        System.out.println("The sum of all numbers from 1 to " + n + " is: " + result);
    }

    public static int sum(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sum(n - 1);
    }
}