//ChongWeiMeng_190428424_CO2220cw1

import java.io.PrintWriter;
import java.time.*;

public class WriteToFile {
	UglyProject project;
	UglyInvoice invoice;
	Formatter format;
	
	public WriteToFile(UglyProject project, UglyInvoice invoice,  Formatter format) {
		this.project = project;
		this.invoice = invoice;
		this.format = format;
	}
	
	public void write() {
		String filename = constructFilename();

		PrintWriter writer = null;
		try {
			writer = new PrintWriter(filename, "UTF-8");
		} catch (Exception e) {
			System.err.println("Something went wrong creating PrintWriter: " + e.getMessage());
		}
		writer.print(format);
		writer.close();
	}

	private String formatDateForWritingToDisk(LocalDate date) {
		return String.format("%1$tF", date);
	}

	private String constructFilename() {
		String client = project.client.getClientCompanyName();
		String vendor = project.vendor.getVendorCompanyName();

		String clientName = client.replace(' ', '-');
		String vendorName = vendor.replace(' ', '-');

		String dateString = formatDateForWritingToDisk(invoice.getInvoiceDate());
		String filename = dateString + "-invoice-"+project.getId()+"-for-" + clientName + "-from-" + vendorName + ".txt";
		return filename;
	}
}
