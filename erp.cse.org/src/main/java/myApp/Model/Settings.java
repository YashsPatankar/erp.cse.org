package myApp.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="settings")
@Entity
@AllArgsConstructor
@Getter
@Setter
public class Settings {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String acadYear;
    Float cetFees;
    Float comekFees;
    Float mngmentFees;
    Float kdcetFees;
    Float snQFees;
    Integer cseIntake;
    Integer aidsIntake;
    Integer ecIntake;
    Integer mechIntake;
    Integer eeIntake;
    Integer civilIntake;

    public Settings() {
        acadYear="2024";
        cetFees=97000.0f;
        comekFees=257000.0f;
        mngmentFees=350000.00f;
        kdcetFees=970000.0f;
        snQFees=28000.0f;
        cseIntake=180;ecIntake=180;
        aidsIntake=60;mechIntake=120;
        eeIntake=60;civilIntake=60;
    }
}
