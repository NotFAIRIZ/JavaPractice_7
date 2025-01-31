class EmailNotifierWrapper extends AbstractWrapper {
    private String uniqueName;

    public EmailNotifierWrapper(NotificationWrapper wrapper, String uniqueName) {
        super(wrapper);
        this.uniqueName = uniqueName;
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("To email " + uniqueName + " alert: " + alert.getMessage());
        super.notify(alert);
    }
}
