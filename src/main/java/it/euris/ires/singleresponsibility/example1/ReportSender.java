package it.euris.ires.singleresponsibility.example1;

import java.util.Map;

public class ReportSender {

  private Map<String, Report> reports;

  public void addReport(Report report) {
    reports.put(report.getName(), report);
  }

  public void send(String reportName, String sendType) {
    if (reports.containsKey(reportName)) {
      if ("email".equals(sendType)) {
        email(reports.get(reportName));
      } else if ("upload".equals(sendType)) {
        upload(reports.get(reportName));
      } else {
        throw new IllegalArgumentException("Unknown sendType: " + sendType);
      }
    }
  }

  private void email(Report report) {
    System.out.println("Sent report " + report.getName() + " via email!");
  }

  private void upload(Report report) {
    System.out.println("Sent report " + report.getName() + " via upload!");
  }
}
