package kodlamaio.hrmsProject.api.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import kodlamaio.hrmsProject.business.abstracts.JobAdvertisementService;
import kodlamaio.hrmsProject.core.utilities.DataResult;
import kodlamaio.hrmsProject.core.utilities.Result;
import kodlamaio.hrmsProject.entities.JobAdvertisement;

@RestController
@RequestMapping("/api/jobAdvertisement/")
public class JobAdvertisementController {

	private JobAdvertisementService jobAdvertisementService;

	@Autowired
	public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@GetMapping("getall")
	DataResult<List<JobAdvertisement>> getAll(){
		
		return this.jobAdvertisementService.getAll();
		
	}
	
	@PostMapping("add")
	Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		
		return this.jobAdvertisementService.add(jobAdvertisement);
		
	}
	
	@GetMapping("isActive")
	DataResult <List<JobAdvertisement>> getByIsActive(@RequestParam("isActive") boolean isActive){
		
		return this.jobAdvertisementService.getByIsActive(isActive);
		
	}
	
	@GetMapping("isActiveAndPublishedDate")
	DataResult<List<JobAdvertisement>> getByIsActiveAndPublishedDate
	(@RequestParam("isActive") boolean isActive, @RequestParam("publishedDate") Date publishedDate){
		
		return this.jobAdvertisementService.getByIsActiveAndPublishedDate(isActive, publishedDate);
		
		
	}
	
	@GetMapping("isActiveAndEmployerCompanyName")
	DataResult <List<JobAdvertisement>> getByisActiveAndEmployer_CompanyName
	(@RequestParam("isActive") boolean isActive,@RequestParam("companyName")  String companyName){
		
		return this.jobAdvertisementService.getByEmployer_CompanyName(companyName);
		
	}
	
	@GetMapping("getAllSortedByExpirationDate")
	DataResult<List<JobAdvertisement>> getAllSortedByExpirationDate(){
		
		return this.jobAdvertisementService.getAllSortedByExpirationDate();
	
	}


	
}
