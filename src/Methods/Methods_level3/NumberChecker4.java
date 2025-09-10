package Methods.Methods_level3;
public class NumberChecker4 {
    public static void main(String[] args) {
        int number = 7;
        System.out.println("Prime: " + isPrime(number));
        System.out.println("Neon: " + isNeon(number));
        System.out.println("Spy: " + isSpy(number));
        System.out.println("Automorphic: " + isAutomorphic(number));
        System.out.println("Buzz: " + isBuzz(number));
    }

    static int[] digitsArray(int n) {
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i) - '0';
        return arr;
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) if (n % i == 0) return false;
        return true;
    }

    static boolean isNeon(int n) {
        int sq = n * n, sum = 0;
        while (sq > 0) { sum += sq % 10; sq /= 10; }
        return sum == n;
    }

    static boolean isSpy(int n) {
        int sum = 0, prod = 1;
        for (int x : digitsArray(n)) { sum += x; prod *= x; }
        return sum == prod;
    }

    static boolean isAutomorphic(int n) {
        int sq = n * n;
        return String.valueOf(sq).endsWith(String.valueOf(n));
    }

    static boolean isBuzz(int n) {
        return n % 7 == 0 || String.valueOf(n).endsWith("7");
    }
}

