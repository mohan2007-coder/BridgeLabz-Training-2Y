package programming_elements;

import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Unit Price : ");
        int u_p = sc.nextInt();
        System.out.print("Enter Quantity : ");
        int q= sc.nextInt();
        int price =u_p*q;
        System.out.printf("The total purchase price is %d if the quantity %d and unit price is %d",price,q,u_p);
    }
}
