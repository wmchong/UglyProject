//ChongWeiMeng_190428424_CO2220cw1

import java.time.*;

public class Formatter {
	UglyProject project;
	UglyInvoice invoice;
	public Formatter(UglyProject project, UglyInvoice invoice) {
		this.project = project;
		this.invoice = invoice;
	}
	
	public String toString() {
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("***********************************");
		sb.append("\n");
		sb.append("\t\t\t\t"+project.vendor.getVendorContactName());
		sb.append("\n");
		sb.append("\t\t\t\t"+project.vendor.getVendorCompanyName());
		sb.append("\n");
		sb.append("\t\t\t\t"+project.vendor.getVendorAddress());
		sb.append("\n");
		sb.append("\t\t\t\tp: "+project.vendor.getVendorPhoneNumber());
		sb.append("\n");
		sb.append("\t\t\t\tf: "+project.vendor.getVendorFaxNumber());
		sb.append("\n");
		sb.append("\t\t\t\te: "+project.vendor.getVendorEmailAddress());
		sb.append("\n");
		sb.append("\n\n");
		sb.append("To:");
		sb.append("\n");
		sb.append("\t"+project.client.getClientContactName());
		sb.append("\n");
		sb.append("\t"+project.client.getClientCompanyName());
		sb.append("\n");
		sb.append("\t"+project.client.getClientAddress());
		sb.append("\n\n");
		sb.append("Invoice ID: "+invoice.getId());
		sb.append("\n");
		sb.append("Invoice date: "+formatDateForToString(invoice.getInvoiceDate()));
		sb.append("\n");
		sb.append("Project ID: "+project.getId());
		sb.append("\n");
		sb.append("Project name: "+project.getName());
		sb.append("\n");
		sb.append("Project description: "+project.getDescription());
		sb.append("\n");
		sb.append("Start Date: "+formatDateForToString(project.getStartDate()));
		sb.append("\n");
		sb.append("End Date: "+formatDateForToString(project.getEndDate()));
		sb.append("\n");
		sb.append("Billing rate: "+project.getHourlyRate() + " an hour");
		sb.append("\n");
		sb.append("Number of hours billed: "+project.getHoursBilled());
		sb.append("\n\n");
		sb.append("Sub-total: "+invoice.getBaseAmount());
		sb.append("\n");
		sb.append("VAT payable: "+invoice.getVatApplicable());
		sb.append("\n");
		sb.append("VAT: "+invoice.getBaseAmount());
		sb.append("\n\n");
		sb.append("Total: "+invoice.getTotalAmount());
		sb.append("\n");
		sb.append("***********************************");
		return sb.toString();
	}	
	
	private String formatDateForToString(LocalDate date) {
		return String.format("%1$te/%1$tm/%1$tY", date);
	}

}
