package kodlamaio.hrmsProject.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsProject.entities.City;

public interface CityDao extends JpaRepository<City, Integer>{


}
