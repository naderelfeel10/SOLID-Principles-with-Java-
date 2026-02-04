package OCP.EX1.problem;

public class ReportGenerator {

    public void generateReport(String type, String data) {

        if (type.equalsIgnoreCase("PDF")) {
            System.out.println("Exporting to PDF: " + data);
        } else if (type.equalsIgnoreCase("JSON")) {
            System.out.println("Exporting to JSON: " + data);
        }
    }
        /*
        there are some problems here :
            what if want to add CSV or any other type
            we have to keep editing with if else

            // so this is not closed for modification and we have to refactor it

        */
}