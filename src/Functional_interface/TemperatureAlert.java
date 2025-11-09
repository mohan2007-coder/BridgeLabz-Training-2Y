package Functional_interface;

import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {
        Predicate<Double> isHighTemp = temp -> temp > 37.5;

        double currentTemp = 38.2;
        if (isHighTemp.test(currentTemp))
            System.out.println("Alert! High temperature detected.");
        else
            System.out.println("Temperature normal.");
    }
}
