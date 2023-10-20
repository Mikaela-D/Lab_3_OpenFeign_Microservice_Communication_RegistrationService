package ie.atu.lab3_registrationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    private final NotificationServiceClient notificationServiceClient;
    @Autowired
    public RegisterController(NotificationServiceClient notificationServiceClient) {
        this.notificationServiceClient = notificationServiceClient;
    }

    @PostMapping("/confirm")
    public String confirmDetails(@RequestBody UserDetails userDetails){
        return String.format("Received details for %s with email %s", userDetails.getName(), userDetails.getEmail());
    }
    @PostMapping("/notification-received")
    public String notificationReceived(@RequestBody UserDetails userDetails){
        String notificationConfirm = notificationServiceClient.notificationConfirmation(userDetails);
        String message = notificationConfirm + "\nThank you" + userDetails.getName() + "Here is the notification on this email: "+ userDetails.getEmail();
        return message;
    }
}
