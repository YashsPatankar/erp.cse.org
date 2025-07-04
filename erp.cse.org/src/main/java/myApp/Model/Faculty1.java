package myApp.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Table(name="Faculty1")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Faculty1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String fname;
    String designation;
    int dno;
    float salary;
    String emailid;
    String imageUrl;
}
