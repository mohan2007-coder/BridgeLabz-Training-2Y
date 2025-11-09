package Functional_interface;

interface ReportExporter {
    void export();

    default void exportToJSON() {
        System.out.println("Exported report to JSON format.");
    }
}

class CSVExporter implements ReportExporter {
    public void export() {
        System.out.println("Exported report to CSV format.");
    }
}

public class ExportDemo {
    public static void main(String[] args) {
        ReportExporter csv = new CSVExporter();
        csv.export();
        csv.exportToJSON();
    }
}
