class TelegramNotifierWrapper extends AbstractWrapper {
    private String userId;
    private boolean isInstant;

    public TelegramNotifierWrapper(NotificationWrapper wrapper, String userId, boolean isInstant) {
        super(wrapper);
        this.userId = userId;
        this.isInstant = isInstant;
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("Telegram Alert sent to " + userId + ": " + alert.getMessage());
        super.notify(alert);
    }
}