package myApp.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="facpubs")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FacultyPublications {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long pubid;
    String p_Title;
    String authors;
    String j_name;
    String pubyear;
    String publisher;
    String paperUrl;
}
