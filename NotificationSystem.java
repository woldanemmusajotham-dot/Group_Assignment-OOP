25241/2024
OMER AZHARI SALIH HUMIDA 

public class NotificationSystem {

    // Interface
    interface Notification {
        void send(String message);
    }

    // SMS Notification
    static class SMSNotification implements Notification {
        @Override
        public void send(String message) {
            System.out.println("SMS: " + message);
        }
    }

    // In-App Notification
    static class InAppNotification implements Notification {
        @Override
        public void send(String message) {
            System.out.println("InApp: " + message);
        }
    }

    // Email Notification
    static class EmailNotification implements Notification {
        @Override
        public void send(String message) {
            System.out.println("Email: " + message);
        }
    }

    // Main Method
    public static void main(String[] args) {

        Notification sms = new SMSNotification();
        Notification inApp = new InAppNotification();
        Notification email = new EmailNotification();

        sms.send("Hello via SMS");
        inApp.send("Hello via In-App");
        email.send("Hello via Email");
    }
}
