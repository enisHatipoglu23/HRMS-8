package kodlamaio.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import kodlamaio.hrmsProject.business.abstracts.CityService;
import kodlamaio.hrmsProject.core.utilities.DataResult;
import kodlamaio.hrmsProject.core.utilities.SuccessDataResult;
import kodlamaio.hrmsProject.dataAccess.CityDao;
import kodlamaio.hrmsProject.entities.City;

@Service
public class CityManager implements CityService{

	private CityDao cityDao;
	
	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	@Override
	public DataResult<List<City>> getAll() {
		
		return new SuccessDataResult<List<City>>(this.cityDao.findAll());
		
	}

	@Override
	public DataResult<City> getCityById(int cityId) {
		return new SuccessDataResult<City>(this.cityDao.getOne(cityId));

	}

	
	
	
}