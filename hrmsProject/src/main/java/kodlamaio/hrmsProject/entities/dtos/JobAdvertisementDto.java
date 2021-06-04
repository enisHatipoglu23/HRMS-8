package kodlamaio.hrmsProject.entities.dtos;

import java.time.LocalDateTime;

public class JobAdvertisementDto {

	private String job;
	private String companyName;
	private String cityName;
	private String description;
	private int quantityPerPosition;
	private LocalDateTime advertisementExprationDate;
	private LocalDateTime publishedDate;
	
	public JobAdvertisementDto() {
		super();
	}

	public JobAdvertisementDto(String job, String companyName, String cityName, String description,
			int quantityPerPosition, LocalDateTime advertisementExprationDate, LocalDateTime publishedDate) {
		super();
		this.job = job;
		this.companyName = companyName;
		this.cityName = cityName;
		this.description = description;
		this.quantityPerPosition = quantityPerPosition;
		this.advertisementExprationDate = advertisementExprationDate;
		this.publishedDate = publishedDate;
		
		
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantityPerPosition() {
		return quantityPerPosition;
	}

	public void setQuantityPerPosition(int quantityPerPosition) {
		this.quantityPerPosition = quantityPerPosition;
	}

	public LocalDateTime getAdvertisementExprationDate() {
		return advertisementExprationDate;
	}

	public void setAdvertisementExprationDate(LocalDateTime advertisementExprationDate) {
		this.advertisementExprationDate = advertisementExprationDate;
	}

	public LocalDateTime getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(LocalDateTime publishedDate) {
		this.publishedDate = publishedDate;
	}
	
	
	
}
