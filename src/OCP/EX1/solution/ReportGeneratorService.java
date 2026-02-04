package OCP.EX1.solution;

import java.util.List;

public class ReportGeneratorService {

    public void generateReport(ReportFormatter formatter, String data){
        formatter.formatReport(data);
    }

    public void generateMultipleReport(List<ReportFormatter> formatters, String data){
        for(ReportFormatter formatter : formatters) {
            formatter.formatReport(data);
        }
    }
}
