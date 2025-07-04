package myApp.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Table(name="scores")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentCourseScore {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String acadyear;
    String usn;
    String scode;
    Integer m1;
    Integer m2;
    Integer ascore;
    Integer pscore;
    Float finalscore;
    Long fid;
    Character division;
}
