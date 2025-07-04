package myApp.Services.Implementation;

import myApp.Model.Grievances;
import myApp.Repository.GrievancesRepository;
import myApp.Services.GrievancesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Optional;

@Service
public class GrievancesServiceImpl implements GrievancesService {
    @Autowired
    GrievancesRepository grievancesRepository;
    @Override
    public List<Grievances> getAllGrievances() {
       return grievancesRepository.findAll();
    }

    @Override
    public String insertGrievance(Grievances g) {
        grievancesRepository.save(g);
        return "Grievance recorded.."+g.toString();
    }

    @Override
    public Grievances getGrievance(Long cid) {
     return (Grievances) grievancesRepository.findById(cid).orElse(null);
    }

    @Override
    public Long findLastGrievanceId() {
        return grievancesRepository.findlastcid();
    }

    @Override
    public String upDateGStatus(Long cid, String gStatus) {
         Grievances g= grievancesRepository.findById(cid).orElse(null);
         g.setCStatus(gStatus);
        GregorianCalendar cal = new GregorianCalendar(2007, 9 - 1, 23);

         grievancesRepository.save(g);
        return "Status Updated Succesfully"+gStatus+cal.getTime();
    }
}
