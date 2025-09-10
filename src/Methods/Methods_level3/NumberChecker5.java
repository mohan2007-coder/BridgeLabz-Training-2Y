package Methods.Methods_level3;

public class NumberChecker5 {
    public static void main(String[] args) {
        int number = 28;
        System.out.println("Perfect: " + isPerfect(number));
        System.out.println("Abundant: " + isAbundant(number));
        System.out.println("Deficient: " + isDeficient(number));
        System.out.println("Strong: " + isStrong(number));
    }

    static boolean isPerfect(int n) {
        int sum = 1;
        for (int i = 2; i <= n / 2; i++) if (n % i == 0) sum += i;
        return sum == n;
    }

    static boolean isAbundant(int n) {
        int sum = 1;
        for (int i = 2; i <= n / 2; i++) if (n % i == 0) sum += i;
        return sum > n;
    }

    static boolean isDeficient(int n) {
        int sum = 1;
        for (int i = 2; i <= n / 2; i++) if (n % i == 0) sum += i;
        return sum < n;
    }

    static boolean isStrong(int n) {
        int sum = 0, temp = n;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == n;
    }

    static int factorial(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) f *= i;
        return f;
    }
}
