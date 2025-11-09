package Functional_interface;
import java.util.function.Function;

public class StringLengthChecke {
    public static void main(String[] args) {
        Function<String, Integer> getLength = str -> str.length();

        String msg = "Hello Functional Interface";
        System.out.println("Message length: " + getLength.apply(msg));
    }
}