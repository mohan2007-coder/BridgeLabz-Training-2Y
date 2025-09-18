package programming_elements;

import java.util.Scanner;

public class volumeofEarth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r =6378;
        double volumeOfEarth =(4/3)*(22/7)*r*r*r;
        double miles= volumeOfEarth*1.6;
        System.out.printf("The volume of earth in cubic kilometers is %.1f and cubic miles is %.1f",volumeOfEarth,miles);
    }
}
