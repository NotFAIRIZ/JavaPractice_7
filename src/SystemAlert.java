import java.time.LocalDate;

class SystemAlert {
    private AlertSeverity severity;
    private String message;
    private int executionCode;
    private String date;
    private String process;

    public SystemAlert(AlertSeverity severity, String message, int executionCode, String process) {
        this.severity = severity;
        this.message = message;
        this.executionCode = executionCode;
        this.date = date;
        this.process = process;
    }

    public AlertSeverity getSeverity() { return severity; }
    public String getMessage() { return message; }
    public int getExecutionCode() { return executionCode; }
    public String getDate() { return date; }
    public String getProcessName() { return process; }
}
