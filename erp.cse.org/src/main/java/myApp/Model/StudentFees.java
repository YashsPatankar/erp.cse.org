package myApp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentFees {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String usn;
    String acadyear;
    Integer installmentNum;
    Float totalFeesTobePaid;
    Float otherFeees;
    Float instAmount;
    Float balanceAmount;
    String finalpaymentStatus; //Pending, Partial, Paid
    String paymentDetails;
    String paymentMode;
    Date paymentDate;
    String clerkName;
}
