package kodlamaio.hrmsProject.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "cityies")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@PrimaryKeyJoinColumn(name = "city_id")

@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisements"})
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "city_id")
	private int cityId;
	
	@Column(name = "city_name")
	private String cityName;
	
	@OneToMany(mappedBy = "city")
	private List<JobAdvertisement> jobAdvertisement;


	
}
