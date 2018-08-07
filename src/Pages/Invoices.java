package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Invoices extends PageObject {
	@FindBy(xpath = "//*[@id=\"app\"]/div[22]/main/div/div/div[1]/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/div/label")
	WebElement Select;
	@FindBy(css="#app > div.v-menu__content.menuable__content__active > div > div > div:nth-child(2) > a")
	WebElement select1client;
	@FindBy(id = "filter-from")
	WebElement From;
	@FindBy(css = "#app > div.v-menu__content.menuable__content__active > div > div.v-picker__body > div > div.v-date-picker-header > button:nth-child(1) > div > i")
	WebElement Month;
	@FindBy(css = "#app > div.v-menu__content.menuable__content__active > div > div.v-picker__body > div > div.v-date-picker-table.v-date-picker-table--date > table > tbody > tr:nth-child(3) > td:nth-child(4) > button > div")
	WebElement DateFrom;
	@FindBy(id = "filter-from-any")
	WebElement fromAnyTime;
	@FindBy(id = "filter-from-ok")
	WebElement fromOK;
	@FindBy(id = "filter-from-cancel")
	WebElement fromCancel;
	@FindBy(id = "filter-to")
	WebElement To;
	@FindBy(css = "#app > div.v-menu__content.menuable__content__active > div > div.v-picker__body > div > div.v-date-picker-table.v-date-picker-table--date > table > tbody > tr:nth-child(3) > td:nth-child(6) > button > div")
	WebElement DateTo;
	@FindBy(id = "filter-to-any")
	WebElement toAny;
	@FindBy(id = "filter-to-cancel")
	WebElement toCancel;
	@FindBy(id = "filter-to-ok")
	WebElement ToOK;
	@FindBy(id = "filter-period")
	WebElement filterPeriod;
	@FindBy(id = "this-month")
	WebElement thisMonth;
	@FindBy(id = "last-month")
	WebElement lastMonth;
	@FindBy(id = "reset-dates")
	WebElement resetDates;
	@FindBy(id = "filter-reset")
	WebElement filterReset;
	@FindBy(id = "add-new-invoice")
	WebElement addNewInvoice;
	@FindBy(id = "click-to-enter")
	WebElement clickToEnter;
	@FindBy(id = "inv-status-btn-2018-JUI4")
	WebElement statusButton;
	@FindBy(css = "#app > div.application--wrap > main > div > div > div:nth-child(2) > div > div:nth-child(2) > div > div:nth-child(5) > div > div:nth-child(2) > div > div > div.v-input__slot")
	WebElement statusButtonChose;
	@FindBy(css="#app > div.v-menu__content.menuable__content__active > div > div > div:nth-child(2) > a > div > div")
	WebElement statusSent;
	@FindBy(css="#inv-status-dialog-yes-2018-JUI4 > div")
	WebElement statusYes;
	@FindBy(id = "context-414")
	WebElement context;
	@FindBy(id = "context-edit-414")
	WebElement contextEdit;
	@FindBy(id = "context-preview-414")
	WebElement contextPreview;
	@FindBy(css="#app > div.v-dialog__content.v-dialog__content--active > div > div > nav > div > a > div > i")
	WebElement Exit;
	@FindBy(id = "context-delete-414")
	WebElement contextDelete;
	@FindBy(id = "context-download-dialog-no-414")
	WebElement deleteNo;
	@FindBy(id = "context-download-dialog-yes-414")
	WebElement deleteYes;
	@FindBy(css = ".menuable__content__active .v-list__tile")
	List<WebElement> clientList;

	public Invoices(WebDriver driver) {
		super(driver);
	}
public void selectClient() {
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	this.Select.click();
	this.select1client.click();
	



}
	public void dateFrom() {
		this.From.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.Month.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.DateFrom.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.fromOK.click();
	}

	public String getTextFrom() {
		return this.From.getAttribute("value");
	}

	public void dateTo() {
		this.To.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.DateTo.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.ToOK.click();
	}

	public String getTextTo() {
		return this.To.getAttribute("value");
	}
	
	public void filterPeriod () {
		this.filterPeriod.click();
		this.lastMonth.click();
		this.filterPeriod.click();
		this.thisMonth.click();
		this.filterPeriod.click();
		this.resetDates.click();
	}
	public void resetPeriod () {
		this.filterReset.click();
	}
	
	public void statusButton () {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.statusButton.click();
		this.statusButtonChose.click();
		this.statusSent.click();
		this.statusYes.click();

	}
	
	public void contextMenuPreview () {
		this.context.click();
		this.contextPreview.click();
		this.Exit.click();
	
	}
	public void contextMenuDelete () {
		this.context.click();
		this.contextDelete.click();
		this.deleteNo.click();
	}
	public void addNewInv() {
		this.addNewInvoice.click();
		
	}
	
}
