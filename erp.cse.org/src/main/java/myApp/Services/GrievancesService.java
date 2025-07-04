package myApp.Services;

import myApp.Model.Grievances;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface GrievancesService {

    public List<Grievances> getAllGrievances();
    public String insertGrievance(Grievances g);
    public Grievances getGrievance(Long cid);

    public Long findLastGrievanceId();
    public String upDateGStatus(Long cid,String gStatus);
}
