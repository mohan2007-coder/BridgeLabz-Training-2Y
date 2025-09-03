package Control_Flow.Control_Flow_level1;
import java.util.Scanner;
public class RocketLaunchFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown start value: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Rocket Launched 🚀");
    }
}
