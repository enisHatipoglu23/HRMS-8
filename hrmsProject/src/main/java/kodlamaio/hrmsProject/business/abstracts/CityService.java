package kodlamaio.hrmsProject.business.abstracts;

import java.util.List;

import kodlamaio.hrmsProject.core.utilities.DataResult;
import kodlamaio.hrmsProject.entities.City;


public interface CityService {

	DataResult<List<City>> getAll();
	
	
	DataResult<City> getCityById(int cityId);
	
	
	
}
