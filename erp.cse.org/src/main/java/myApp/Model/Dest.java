package myApp.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.sound.midi.Sequence;
@Table(name="destn")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Dest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long sem;
    String division;
}
