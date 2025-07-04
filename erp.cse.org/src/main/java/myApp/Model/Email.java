package myApp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.sound.midi.Sequence;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String emailto;
    String subject;
    String body;
}
