package OCP.EX1.Main;


import OCP.EX1.solution.JsonReportFormatterFormatter;
import OCP.EX1.solution.PDFReportFormatterFormatter;
import OCP.EX1.solution.ReportFormatter;
import OCP.EX1.solution.ReportGeneratorService;

import java.util.Arrays;
import java.util.List;

public class Main {
    static ReportGeneratorService reportGeneratorService = new ReportGeneratorService();
    public static void main(String[] args) {

        ReportFormatter report = new PDFReportFormatterFormatter();
        reportGeneratorService.generateReport(report,"this is nader elfeel");

        report = new JsonReportFormatterFormatter();
        reportGeneratorService.generateReport(report,"this is nader elfeel");

        System.out.println("*********************");

        // what if wanna handle multiple different reports:
        // i will just add this function in Report Generator Service Class

        ReportFormatter pdfReport1 = new PDFReportFormatterFormatter();
        ReportFormatter josnReport1 = new JsonReportFormatterFormatter();

        List<ReportFormatter> myReports = Arrays.asList(pdfReport1,josnReport1);
        reportGeneratorService.generateMultipleReport(myReports,"NADER ELFEEL");

    }
}