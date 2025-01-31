import java.util.List;
import java.util.ArrayList;
class SystemController {
    private List<SystemAlert> alertHistory = new ArrayList<>();
    private NotificationWrapper notifier;

    public SystemController(NotificationWrapper notifier) {
        this.notifier = notifier;
    }

    public void informAlert(SystemAlert alert) {
        alertHistory.add(alert);
        if (notifier != null) {
            notifier.notify(alert);
        }
    }
}
