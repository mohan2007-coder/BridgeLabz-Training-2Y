package Lambda_expressions;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;


class Alert {
    private String type;
    private String message;

    public Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "[" + type + "] " + message;
    }
}

// Main class
public class NotificationFiltering {
    public static void main(String[] args) {
        // Sample list of alerts
        List<Alert> alerts = Arrays.asList(
                new Alert("Emergency", "Patient John Doe needs immediate attention!"),
                new Alert("Medication", "Reminder: Take insulin dose at 8 PM."),
                new Alert("Appointment", "Dr. Smith appointment scheduled at 10 AM tomorrow."),
                new Alert("HealthTip", "Stay hydrated! Drink 8 glasses of water daily.")
        );

        System.out.println("=== All Alerts ===");
        alerts.forEach(System.out::println);


        Predicate<Alert> emergencyFilter = alert -> alert.getType().equalsIgnoreCase("Emergency");
        Predicate<Alert> medicationFilter = alert -> alert.getType().equalsIgnoreCase("Medication");


        Predicate<Alert> userPreference = emergencyFilter.or(medicationFilter);


        List<Alert> filteredAlerts = alerts.stream()
                .filter(userPreference)
                .collect(Collectors.toList());

        System.out.println("\n=== Filtered Alerts (Based on User Preference) ===");
        filteredAlerts.forEach(System.out::println);
    }
}