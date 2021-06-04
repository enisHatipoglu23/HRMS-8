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

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_positions")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisements"})
@PrimaryKeyJoinColumn(name = "job_position_id",referencedColumnName = "jobPositionsId")

public class JobPositions {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "job_position_id")
	private int jobPositionsId;
	
	@Column(name = "job_name")
	private String job;
	
	//iliskilendirme
	@OneToMany(mappedBy = "jobPositions")
	private List<JobAdvertisement> jobAdvertisement;

	
}
