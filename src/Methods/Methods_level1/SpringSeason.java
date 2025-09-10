package Methods.Methods_level1;

public class SpringSeason {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        boolean result = isSpringSeason(month, day);
        if (result) System.out.println("Its a Spring Season");
        else System.out.println("Not a Spring Season");
    }
    public static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20);
    }
}

