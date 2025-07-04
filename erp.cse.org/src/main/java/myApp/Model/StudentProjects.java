package myApp.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="studentprojects")
@Entity()
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentProjects {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        Long id;
        Long pid;
        String usn;
        String projTitle;
        Long fid;
        Float ph1;
        Float ph2;
        Float ph3;
        Float finalMarks;
}
