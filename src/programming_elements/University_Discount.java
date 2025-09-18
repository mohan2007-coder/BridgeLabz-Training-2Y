package programming_elements;

import java.util.Scanner;

public class University_Discount {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int fee =125000;
        int discountPercent=10;
        int discount= (fee*10)/100;
        int finalFee = fee-discount;
        System.out.printf("The discount amount is %d and final discounted fee is %d",discount,finalFee);
    }
}
