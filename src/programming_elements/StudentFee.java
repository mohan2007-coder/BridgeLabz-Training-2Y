package programming_elements;

import java.util.Scanner;

public class StudentFee {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter fees: ");
        int fee =sc.nextInt();
        System.out.print("Enter discount %: ");
        int discountPercent=sc.nextInt();
        int discount= (fee*discountPercent)/100;
        int finalFee = fee-discount;
        System.out.printf("The discount amount is %d and final discounted fee is %d",discount,finalFee);
    }

}
