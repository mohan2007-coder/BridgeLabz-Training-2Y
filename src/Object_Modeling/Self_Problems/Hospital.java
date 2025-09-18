package Object_Modeling.Self_Problems;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public List<Patient> getPatients() {
        return patients;
    }
}

class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void consult(Patient patient) {
        System.out.println(name + " is consulting with " + patient.getName());
    }
}

class Patient {
    private String name;
    private List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }
}

 class Hospital_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hospital name: ");
        Hospital hospital = new Hospital(scanner.nextLine());

        System.out.print("Enter number of doctors: ");
        int numDoctors = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numDoctors; i++) {
            System.out.print("Enter name for Doctor " + (i + 1) + ": ");
            hospital.addDoctor(new Doctor(scanner.nextLine()));
        }

        System.out.print("Enter number of patients: ");
        int numPatients = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numPatients; i++) {
            System.out.print("Enter name for Patient " + (i + 1) + ": ");
            hospital.addPatient(new Patient(scanner.nextLine()));
        }

        System.out.println("\n--- Initiating Consultations ---");
        if (!hospital.getDoctors().isEmpty() && !hospital.getPatients().isEmpty()) {
            hospital.getDoctors().get(0).consult(hospital.getPatients().get(0));
            hospital.getDoctors().get(0).addPatient(hospital.getPatients().get(0));
            hospital.getPatients().get(0).addDoctor(hospital.getDoctors().get(0));

            if (hospital.getDoctors().size() > 1 && hospital.getPatients().size() > 1) {
                hospital.getDoctors().get(1).consult(hospital.getPatients().get(1));
                hospital.getDoctors().get(1).addPatient(hospital.getPatients().get(1));
                hospital.getPatients().get(1).addDoctor(hospital.getDoctors().get(1));
            }
        } else {
            System.out.println("Not enough doctors or patients to demonstrate consultations.");
        }

        scanner.close();
    }
}
