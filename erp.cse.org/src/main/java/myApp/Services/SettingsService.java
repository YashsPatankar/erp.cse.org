package myApp.Services;

import myApp.Model.Settings;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface SettingsService {

   public List<Settings> getAllSettings();

  public String updateAcadYear(String acadYear);
}
