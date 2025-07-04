package myApp.Controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import myApp.Model.Dest;
import myApp.Model.Email;
import myApp.Services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EmailController {
    @Autowired
    private EmailService emailService;

    @PostMapping("/sendEmail")
    public String sendEmail(@RequestBody Mail email) {
        emailService.sendSimpleMessage(email.getEmailto(), email.getSubject(), email.getBody(),email.getSem(),email.getDivision());
        return "Email sent sucessfully..to all Students of "+email.getSem()+" "+email.getDivision()+" Division";
    }
    @PostMapping("/sendEmailToParent")
    public String sendEmailToParent(@RequestBody Mail email) {
        emailService.sendEmailToParent(email.getEmailto(), email.getSubject(), email.getBody(),email.getSem(),email.getDivision());
        return "Email sent sucessfully..to all Parents of "+email.getSem()+" "+email.getDivision()+" Division";
    }
}

