package dependancy_injection;

public class NotificationManager {
    //wrong way 1
    //in here NotificationManager and Email service class were tightly coupled
//    private final EmailService emailService = new EmailService();
//    private final SMSService SMSService = new SMSService();
//
//    public void notifyEmail(String message){
//        emailService.sendEmail(message);
//    }
//
//    public void notifySMS(String message){
//        SMSService.sendSMS(message);
//    }
}
