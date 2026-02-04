package OCP.EX1.solution;


public class JsonReportFormatterFormatter extends ReportFormatter {

    @Override
    public void formatReport( String data) {
            System.out.println("Exporting to JSON: " + data);
    }

}
