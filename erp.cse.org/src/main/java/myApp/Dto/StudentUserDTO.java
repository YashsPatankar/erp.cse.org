package myApp.Dto;

import lombok.Data;
import myApp.Model.Faculty1;
import myApp.Model.Student;
import myApp.Model.User;

@Data
public class StudentUserDTO {
    Student s;
    User u;

    public Student getS() {
        return(getS());
    }

    public User getU() {
        return (getU());
    }
}
