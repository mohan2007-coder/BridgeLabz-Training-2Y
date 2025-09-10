package Methods.Methods_level3;

import java.util.*;

public class OTPGenerator {
    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) otps[i] = generateOTP();
        System.out.println("Generated OTPs: " + Arrays.toString(otps));
        System.out.println("All Unique: " + areOTPsUnique(otps));
    }

    static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }

    static boolean areOTPsUnique(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int x : arr) set.add(x);
        return set.size() == arr.length;
    }
}
