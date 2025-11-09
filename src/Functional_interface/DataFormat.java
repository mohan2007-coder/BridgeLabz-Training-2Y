package Functional_interface;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateFormatter {
    static String format(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }
}

public class DataFormat {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(DateFormatter.format(today, "dd/MM/yyyy"));
        System.out.println(DateFormatter.format(today, "MMMM dd, yyyy"));
    }
}
