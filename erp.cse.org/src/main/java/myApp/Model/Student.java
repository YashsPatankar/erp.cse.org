package myApp.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="students")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id;
    String usn;
    String name;
    String branch;
    Integer sem;
    String admYear;
    String division;
    String emailid;
    String parentemailid;
    String admCategory;
    Float fees;
    Float otherfees;
}
