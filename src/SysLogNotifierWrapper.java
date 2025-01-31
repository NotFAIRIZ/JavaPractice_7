class SysLogNotifierWrapper extends AbstractWrapper {
    private String journalName;

    public SysLogNotifierWrapper(NotificationWrapper wrapper, String journalName) {
        super(wrapper);
        this.journalName = journalName;
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("SysLog " + journalName + " logged alert: " + alert.getMessage());
        super.notify(alert);
    }
}