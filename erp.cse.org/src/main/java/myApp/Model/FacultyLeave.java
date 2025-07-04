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

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name="faculty_leave")
public class FacultyLeave {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long leaveID;
    Date fromDate;
    Date toDate;
    String leaveType;
    String reason;
    String alternateArrangement;
    Long fid;
    String fname;
}
