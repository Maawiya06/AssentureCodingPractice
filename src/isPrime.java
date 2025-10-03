public class isPrime {

    public static boolean prime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {  // check divisors up to sqrt(n)
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 29;
        System.out.println(prime(n));  // true
    }
}
