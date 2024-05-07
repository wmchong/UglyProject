//ChongWeiMeng_190428424_CO2220cw1

import java.math.BigDecimal;
import java.time.*;
/*
My classes, UglyProject, UglyVendor, UglyClient, UglyInvoice, WriteToFile, Formatter, works as i have expected.
*/
public class Test {

	public static void main(String[] args) {
		
		UglyClient client = new UglyClient("Client Industries", "Bob Thornton",
				"1 Client Drive, " + "London W1","5551234", "5551235", "bob.t@clientinc.com");
		
		UglyVendor vendor = new UglyVendor("Vendor Industries", "Tony Stark",
				"99 Vendor Lane, London E1", "5559876", "5559875", "t.stark@vendorinc.com");
		
		UglyProject project = new UglyProject(102, "Project 1", "Vend awesome things to Client Industries",
				LocalDate.now(), LocalDate.now(), 10, new BigDecimal(20), client, vendor);
		
		UglyInvoice invoice = new UglyInvoice(105, project, LocalDate.now(), true);
		
		formatAndWriteToDisk(project, invoice);
	}
	
	public static void formatAndWriteToDisk(UglyProject project, UglyInvoice invoice) {
		Formatter format = new Formatter(project, invoice);
		
		WriteToFile writeToFile = new WriteToFile(project, invoice, format);
		
		writeToFile.write();
	}

}
