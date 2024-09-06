package dependancy_injection;

public class EmailService implements NotificationService{
    public void sendEmail(String message){
        System.out.println("Email sent " + message);
    }

    @Override
    public void sendNotification(String message) {

    }
}
