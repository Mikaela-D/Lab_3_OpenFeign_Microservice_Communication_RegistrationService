package ie.atu.lab3_registrationservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "received", url = "http://localhost:8083")
public interface NotificationService {
    @PostMapping("/received")
    String notificationConfirmation(@RequestBody UserDetails userDetails);
}
