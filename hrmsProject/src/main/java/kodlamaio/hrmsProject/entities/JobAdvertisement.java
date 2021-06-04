package kodlamaio.hrmsProject.entities;

import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Table(name = "job_advertisements")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@EqualsAndHashCode 
@PrimaryKeyJoinColumn(name = "job_advertisement_id",referencedColumnName = "jobAdvertisementId")

@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisement", "employer", "city", "jobPosition"})
public class JobAdvertisement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "job_advertisement_id")
	private int jobAdvertisementId;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "quantity_per_position")
	private int quantityPerPosition;
	
	@Column(name = "advertisement_expration_date")
	private LocalDateTime advertisementExprationDate;
	
	@Column(name = "min_salary")
	private Double minSalary;
	
	@Column(name = "max_salary")
	private Double maxSalary;
	
	@Column(name = "published_date")
	private Date publishedDate ;
	
	@Column(name = "is_active", columnDefinition = "boolean default true")
	private boolean isActive;
	
	@ManyToOne
	@JoinColumn(name = "employer_id")
	private Employer employer;
	
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;
	
	@ManyToOne
	@JoinColumn(name = "job_position_id")
	private JobPositions jobPositions;


		
}
