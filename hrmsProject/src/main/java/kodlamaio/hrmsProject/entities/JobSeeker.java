package kodlamaio.hrmsProject.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity
@Table(name="job_seekers")
@PrimaryKeyJoinColumn(name = "job_seeker_id")
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker extends User{
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "nationality_number")
	private String nationalityNumber;
	
	@Column(name = "birth_date")
	private Date birthDate;
	

	

	
	
}
