package OCP.EX1.solution;


public class PDFReportFormatterFormatter extends ReportFormatter {

    @Override
    public void formatReport(String data) {
            System.out.println("Exporting to PDF: " + data);
    }

}
