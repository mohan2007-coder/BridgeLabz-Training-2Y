import java.util.ArrayList;

class Patient {
    String name;
    ArrayList<Doctor> doctors;

    Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    void consult(Doctor d) {
        doctors.add(d);
        System.out.println(name + " is consulting Dr. " + d.name);
    }

    void showDoctors() {
        System.out.println(name + "'s Doctors:");
        for (Doctor d : doctors) {
            System.out.println("- Dr. " + d.name);
        }
    }
}

class Doctor {
    String name;
    ArrayList<Patient> patients;

    Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    void consult(Patient p) {
        patients.add(p);
        p.consult(this); // establish two-way association
        System.out.println("Dr. " + name + " is consulting " + p.name);
    }

    void showPatients() {
        System.out.println("Dr. " + name + "'s Patients:");
        for (Patient p : patients) {
            System.out.println("- " + p.name);
        }
    }
}

class Hospital {
    String name;
    ArrayList<Doctor> doctors;
    ArrayList<Patient> patients;

    Hospital(String name) {
        this.name = name;
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }

    void addDoctor(Doctor d) {
        doctors.add(d);
    }

    void addPatient(Patient p) {
        patients.add(p);
    }

    void showDoctors() {
        System.out.println("Doctors in " + name + ":");
        for (Doctor d : doctors) {
            System.out.println("- Dr. " + d.name);
        }
    }

    void showPatients() {
        System.out.println("Patients in " + name + ":");
        for (Patient p : patients) {
            System.out.println("- " + p.name);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor d1 = new Doctor("Sharma");
        Doctor d2 = new Doctor("Verma");

        Patient p1 = new Patient("Ankit");
        Patient p2 = new Patient("Rahul");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);

        // Many-to-many association + communication
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        // Display relationships
        hospital.showDoctors();
        hospital.showPatients();
        d1.showPatients();
        p1.showDoctors();
    }
}
