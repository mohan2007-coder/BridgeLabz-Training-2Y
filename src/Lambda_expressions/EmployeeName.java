package Lambda_expressions;

import java.util.*;
import java.util.stream.*;

public class EmployeeName {
    public static void main(String[] args) {

        List<String> employeeNames = Arrays.asList(
                "Akshat",

                "Sanjay",

                "Arjun"
        );

        System.out.println("Original Employee Names");
        employeeNames.forEach(System.out::println);


        List<String> uppercasedNames = employeeNames.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("\n=== Uppercased Employee Names ===");
        uppercasedNames.forEach(System.out::println);
    }
}
