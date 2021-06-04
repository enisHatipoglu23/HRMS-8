package kodlamaio.hrmsProject.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Table(name = "employers")
@EqualsAndHashCode(callSuper = true)
@PrimaryKeyJoinColumn(name = "job_advertisement_id")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisements"})
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Employer extends User{
	
	@Column(name = "employer_id")
	private int employerId;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "website_adress")
	private String websiteAdress;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Column(name = "activation")
	private boolean activation = false;
	
	@Column(name = "email_verification")
	private boolean emailVerification;
	
	@Column(name = "is_active", columnDefinition = "boolean default true")
	private boolean isActive;
	
	//iliskilendirme
	
	@OneToMany(mappedBy = "employer")
	private List<JobAdvertisement> jobAdvertisement;

	
	
}
