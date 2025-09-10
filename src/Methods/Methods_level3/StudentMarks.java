package Methods.Methods_level3;

import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = generateScores(n); // [Physics, Chemistry, Math]
        double[][] results = calculateResults(marks); // [Total, Average, Percentage]
        displayScorecard(marks, results);
    }

    // Generate random 2-digit marks for each subject
    static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3];

        for (int i = 0; i < n; i++) {
            scores[i][0] = 35 + rand.nextInt(66); // Physics
            scores[i][1] = 35 + rand.nextInt(66); // Chemistry
            scores[i][2] = 35 + rand.nextInt(66); // Math
        }
        return scores;
    }

    // Calculate total, average, and percentage
    static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(avg * 100.0) / 100.0;
            results[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return results;
    }

    // Get grade from percentage
    static String getGrade(double percent) {
        if (percent >= 80) return "A";
        else if (percent >= 70) return "B";
        else if (percent >= 60) return "C";
        else if (percent >= 50) return "D";
        else if (percent >= 40) return "E";
        else return "F";
    }

    // Display scorecard
    static void displayScorecard(int[][] marks, double[][] results) {
        System.out.printf("%-8s %-10s %-10s %-10s %-10s %-10s %-12s %-8s%n",
                "StuID", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage", "Grade");
        System.out.println("--------------------------------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {
            String grade = getGrade(results[i][2]);
            System.out.printf("%-8d %-10d %-10d %-10d %-10.0f %-10.2f %-12.2f %-8s%n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2],
                    results[i][0], results[i][1], results[i][2], grade);
        }
    }
}

