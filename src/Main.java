public class Main {
    public static void main(String[] args) {
        NotificationWrapper wrapper = new EmailNotifierWrapper(null, "aaaa@gmail.com");
        wrapper = new SysLogNotifierWrapper(wrapper, "System log ");
        wrapper = new TelegramNotifierWrapper(wrapper, "@aaaaaa123", true);
        wrapper = new PhoneNotifierWrapper(wrapper, "+0501293102");

        SystemController sysControl = new SystemController(wrapper);
        SystemAlert alert = new SystemAlert(AlertSeverity.CRITICAL, "test alert message", 404, "proc1");
        sysControl.informAlert(alert);
    }
}