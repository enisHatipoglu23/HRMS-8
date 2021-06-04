package kodlamaio.hrmsProject.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsProject.business.abstracts.CityService;
import kodlamaio.hrmsProject.core.utilities.DataResult;
import kodlamaio.hrmsProject.entities.City;

@RestController
@RequestMapping("/api/cities/")
public class CityController {

	private CityService cityService;

	@Autowired
	public CityController(CityService cityService) {
		super();
		this.cityService = cityService;
	}
	
	@GetMapping("getall")
	DataResult<List<City>> getAll(){
		
		return this.cityService.getAll();
		
	}
	
	@GetMapping("getCityId")
	DataResult<City> getCityById(int cityId){
		
		return this.getCityById(cityId);
		
	}


	
	
	
}
