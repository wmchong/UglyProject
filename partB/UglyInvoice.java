//ChongWeiMeng_190428424_CO2220cw1
import java.math.BigDecimal;
import java.time.*;

public class UglyInvoice {

	private static final BigDecimal VAT_RATE = new BigDecimal(5); 
	private boolean vatApplicable; 
	private BigDecimal totalAmount; 
	private BigDecimal vatAmount; 
	private BigDecimal baseAmount;

	private int id;
	private UglyProject project;
	private LocalDate invoiceDate;
	
	public UglyInvoice() {}
	
	public UglyInvoice(int id, UglyProject project, LocalDate invoiceDate, boolean vatApplicable) {
		this.id = id;
		this.project = project;
		this.invoiceDate = invoiceDate;
		this.vatApplicable = vatApplicable;

		calculateTotal();
	}
	
	private void calculateTotal() {
		BigDecimal hourlyRate = project.getHourlyRate();
		BigDecimal hours = new BigDecimal(project.getHoursBilled()); 
		this.baseAmount = hourlyRate.multiply(hours);
		if (vatApplicable) {
			vatAmount = baseAmount.divide(VAT_RATE);
		} else {
			vatAmount = new BigDecimal(0);
		}
		totalAmount = baseAmount.add(vatAmount);
	}
	
	public int getId() {
		return id;
	}

	public UglyProject getProject() {
		return project;
	}

	public LocalDate getInvoiceDate() {
		return invoiceDate;
	}

	public BigDecimal getBaseAmount() {
		return baseAmount;
	}
	
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	
	public BigDecimal getVatAmount() {
		return vatAmount;
	}
	
	public boolean getVatApplicable() {
		return vatApplicable;
	}
}
