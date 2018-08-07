package Tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.AddNewInvoice;
import Pages.Invoices;
import Pages.LogIn;

public class AddNewInvoiceTest extends Browser {
	static String url = "http://app.invoice-factory.source-code.rs";

	@BeforeClass
	public static void setBeforeTests() {
		driver.get("http://app.invoice-factory.source-code.rs/invoices");

		Invoices invoice = new Invoices(driver);
		invoice.addNewInv();

	}

	@Test(priority = 24)
	public void testAddNewEmptySave() {
		AddNewInvoice Add = new AddNewInvoice(driver);
		Add.addEmptySave();
		assertTrue(Add.clientReq() && Add.bankReq() && Add.basisReq() && Add.buissnesReq() && Add.currReq()
				&& Add.invNumReq());
	}

	@Test(priority = 25)
	public void testAddNewInvoiceAll() {
		driver.get("http://app.invoice-factory.source-code.rs/invoices/form");
		AddNewInvoice Add = new AddNewInvoice(driver);
		Add.enterTitle("Bojana");
		Add.addNewInvoiceAll("5", "Bojana", "SERVIS", "BLA BLA", "8");

	}

	@Test(priority = 26)
	public void testCancel() {
		driver.get("http://app.invoice-factory.source-code.rs/invoices/form");
		AddNewInvoice Add = new AddNewInvoice(driver);
		Add.Cancel();
	}

}
  

