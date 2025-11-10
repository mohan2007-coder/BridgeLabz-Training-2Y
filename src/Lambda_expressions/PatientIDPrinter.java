package Lambda_expressions;

import java.util.*;

// Class representing a patient
class Patient {
    private String patientId;

    public Patient(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientId() {
        return patientId;
    }

    @Override
    public String toString() {
        return "Patient ID: " + patientId;
    }
}

// Main class
public class PatientIDPrinter {
    public static void main(String[] args) {
        // List of patient IDs
        List<Patient> patients = Arrays.asList(
                new Patient("HSP001"),
                new Patient("HSP002"),
                new Patient("HSP003"),
                new Patient("HSP004")
        );

        System.out.println("=== Hospital Patient IDs ===");


        patients.forEach(System.out::println);


        System.out.println("\nOnly Patient IDs");
        patients.stream()
                .map(Patient::getPatientId)
                .forEach(System.out::println);
    }
}
