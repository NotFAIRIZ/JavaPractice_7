class PhoneNotifierWrapper extends AbstractWrapper {
    private String phoneNumber;

    public PhoneNotifierWrapper(NotificationWrapper wrapper, String phoneNumber) {
        super(wrapper);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("Phone Call to " + phoneNumber + " with alert: " + alert.getMessage());
        super.notify(alert);
    }
}
