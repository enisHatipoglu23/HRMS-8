package kodlamaio.hrmsProject.business.abstracts;

import java.sql.Date;
import java.util.List;

import kodlamaio.hrmsProject.core.utilities.DataResult;
import kodlamaio.hrmsProject.core.utilities.Result;
import kodlamaio.hrmsProject.entities.JobAdvertisement;

public interface JobAdvertisementService {

	DataResult<List<JobAdvertisement>> getAll();
	
	DataResult <List<JobAdvertisement>> getByEmployer_CompanyName(String companyName); 
	
	Result add(JobAdvertisement jobAdvertisement);
	
	DataResult <List<JobAdvertisement>> getByIsActive(boolean isActive);
	
	DataResult<List<JobAdvertisement>> getByIsActiveAndPublishedDate(boolean isActive, Date publishedDate);

	DataResult<List<JobAdvertisement>> getAllSortedByExpirationDate();

	
	
	
	
	
}
