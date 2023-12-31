package ie.atu.lab3_registrationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Lab3RegistrationServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(Lab3RegistrationServiceApplication.class, args);
    }
}
