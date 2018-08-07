package Tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.Invoices;
import Pages.LogIn;

public class InvoicesTests extends Browser {
	static String url = "http://app.invoice-factory.source-code.rs";

	@BeforeClass
	public static void setBeforeTests() {
		driver.get("http://app.invoice-factory.source-code.rs/invoices");

	}

	@Test(priority = 16)
	public void testSelectClient() {
		driver.get("http://app.invoice-factory.source-code.rs/invoices");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Invoices invoice = new Invoices(driver);
		invoice.selectClient();

	}

	@Test(priority = 17)
	public void testDateFrom() {
		Invoices invoice = new Invoices(driver);
		invoice.dateFrom();
		assertEquals("2018-07-18", invoice.getTextFrom());
	}

	@Test(priority = 18)
	public void testDateTo() {
		Invoices invoice = new Invoices(driver);
		invoice.dateTo();
		assertEquals("2018-08-17", invoice.getTextTo());

	}

	@Test(priority = 19)
	public void testFilterPeriod() {
		Invoices invoice = new Invoices(driver);
		invoice.filterPeriod();
	}

	@Test(priority = 20)
	public void testResetPeriod() {
		Invoices invoice = new Invoices(driver);
		invoice.resetPeriod();
	}

	@Test(priority = 21)
	public void testStatusButton() {
		driver.get("http://app.invoice-factory.source-code.rs/invoices");
		Invoices invoice = new Invoices(driver);
		invoice.statusButton();

	}

	@Test(priority = 22)
	public void testPreview() {
		Invoices invoice = new Invoices(driver);
		invoice.contextMenuPreview();
	}

	@Test(priority = 23)
	public void testDelete() {
		Invoices invoice = new Invoices(driver);
		invoice.contextMenuDelete();
	}

}
