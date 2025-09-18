package programming_elements;

import java.util.Scanner;

public class MaxNoOfHandshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of student ");
        int numberOfStudents= sc.nextInt();
        int possible_handshake = (numberOfStudents*(numberOfStudents-1))/2;
        System.out.printf("Possible nuumber of handshake :%d",possible_handshake);
    }
}
