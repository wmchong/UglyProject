//ChongWeiMeng_190428424_CO2220cw1

import java.math.BigDecimal;
import java.time.LocalDate;

public class UglyProject {
	
	private int id;
	private String name;
	private String description;
	private LocalDate startDate;
	private LocalDate endDate;
	private int hoursBilled;
	private BigDecimal hourlyRate;
	UglyClient client;
	UglyVendor vendor;
	
	public UglyProject(int id, String name, String description,
			LocalDate startDate, LocalDate endDate, int hoursBilled,
			BigDecimal hourlyRate, UglyClient client, UglyVendor vendor) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.hoursBilled = hoursBilled;
		this.hourlyRate = hourlyRate;
		this.client = client;
		this.vendor = vendor;
	}
	
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	public void setHoursBilled(int hoursBilled) {
		this.hoursBilled = hoursBilled;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	
	public int getHoursBilled() {
		return hoursBilled;
	}
	
	public BigDecimal getHourlyRate() {
		return hourlyRate;
	}
}


