package kodlamaio.hrmsProject.dataAccess;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrmsProject.entities.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{
	
	
			
			List<JobAdvertisement> getByEmployer(int userId);
			List<JobAdvertisement> getByIsActiveAndPublishedDate(boolean isActive, Date publishedDate);
			List<JobAdvertisement> getByEmployer_CompanyName(String companyName); 
			List<JobAdvertisement> getByIsActive(boolean isActive);
			
			@Query("From JobAdvertisement where isActive = true and employer_id =: user_id")
			List<JobAdvertisement> getEmpoyersActiveJobAdvertisement(int userId);
	
}
