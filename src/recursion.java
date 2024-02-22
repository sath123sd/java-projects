
public class recursion {
    public static void main(String[] args) {
        int number = 5;
        long factorial = computeFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
    public static long computeFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * computeFactorial(n - 1);
        }
    }
}
