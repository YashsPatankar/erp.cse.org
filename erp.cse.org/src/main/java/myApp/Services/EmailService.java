package myApp.Services;

import myApp.Controller.Mail;
import myApp.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender mailSender;
    @Autowired
    private StudentService studentService;
    public void sendSimpleMessage(String to, String subject, String text,Long sem,String div) {

        List<Student> emailList;
        emailList=studentService.getStudentsOfParticularYear(sem,div);
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("sfroddjforkts@gmail.com");
        message.setSubject(subject);
        message.setText(text);
        for(Student s : emailList) {
            message.setTo(s.getEmailid());
            mailSender.send(message);
        }
    }

    public void sendEmailToParent(String to, String subject, String text,Long sem,String div) {
        List<Student> emailList;
        emailList = studentService.getStudentsOfParticularYear(sem, div);
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("sfroddjforkts@gmail.com");
        message.setSubject(subject);
        message.setText(text);
        for (Student s : emailList) {
            message.setTo(s.getParentemailid());
            mailSender.send(message);
        }
    }
}

