package Inheritance.Multilevel_Inheritance;
import java.util.Scanner;
class Course {
    String course_Name;
    int duration;
    Course(String course_Name, int duration) {
        this.course_Name = course_Name;
        this.duration = duration;
    }
    void display_Info() {
        System.out.println("Course Name: " + course_Name + ", Duration: " + duration + " weeks");
    }
}
class Online_Course extends Course {
    String platform;
    boolean isRecorded;
    Online_Course(String course_Name, int duration, String platform, boolean isRecorded) {
        super(course_Name, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    void display_Info() {
        super.display_Info();
        System.out.println("Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

class Paid_Online_Course extends Online_Course {
    double fee;
    double discount;
    Paid_Online_Course(String course_Name, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(course_Name, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    void display_Info() {
        super.display_Info();
        System.out.println("Fee: " + fee + ", Discount: " + discount + "%");
    }
}
 class Course_Hierarchy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter course name: ");
        String name = sc.nextLine();
        System.out.print("Enter duration (weeks): ");
        int duration = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter platform: ");
        String platform = sc.nextLine();
        System.out.print("Is the course recorded? (true/false): ");
        boolean recorded = sc.nextBoolean();
        System.out.print("Enter course fee: ");
        double fee = sc.nextDouble();
        System.out.print("Enter discount (%): ");
        double discount = sc.nextDouble();

        Paid_Online_Course course = new Paid_Online_Course(name, duration, platform, recorded, fee, discount);
        System.out.println("\nCourse Details:");
        course.display_Info();
        sc.close();
    }
}

