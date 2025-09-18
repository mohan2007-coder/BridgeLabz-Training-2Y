package programming_elements;

import java.util.Scanner;
public class Profit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int Cost_price= 129;
        int Selling_price=191;
        float profit = Selling_price - Cost_price;
        float Profit_Percentage = (profit / Cost_price) * 100;

        System.out.printf("The Cost Price is %d and Selling Price is %d\n",Cost_price,Selling_price);
        System.out.printf("The Profit is %f and the Profit Percentage is %.2f",profit,Profit_Percentage);

    }
}
