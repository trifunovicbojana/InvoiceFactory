package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewInvoice extends PageObject {
	@FindBy(id = "click-to-enter")
	WebElement nameAni;
	@FindBy(id = "invoice-title-content")
	WebElement enterName;
	@FindBy(xpath = "//*[@id=\"app\"]/div[9]/main/div/div/div/div[1]/form/div[1]/div[3]/div[1]/div/div/div[1]/div/div/div[1]/div/div/div/div[1]")
	WebElement clientANI;
	@FindBy(css = "#app > div.v-menu__content.menuable__content__active > div > div > div:nth-child(2) > a > div > div")
	WebElement clientChooseANI;
	@FindBy(css = "#app > div.application--wrap > main > div > div > div > div.invoice-factory-header.v-card > form > div.layout.pa-3.column > div:nth-child(3) > div:nth-child(2) > div > div > div.flex > div > div > div.v-input__slot > div > div > div > label")
	WebElement businessANI;
	@FindBy(css = "#app > div.v-menu__content.menuable__content__active > div > div > div:nth-child(2) > a > div")
	WebElement businessChooseANI;
	@FindBy(id = "inv-form-number")
	WebElement invNumANI;
	@FindBy(css = "#app > div.application--wrap > main > div > div > div > div.invoice-factory-header.v-card > form > div.layout.pa-3.column > div:nth-child(5) > div > div.layout.mt-1 > div.flex.xs4.offset-xs4 > div > div.flex.xs4.ml-2 > div > div > div.v-input__slot > div")
	WebElement currencyANI;
	@FindBy(css = "#app > div.v-menu__content.menuable__content__active > div > div > div:nth-child(1) > a > div")
	WebElement bank;
	@FindBy(id = "inv-form-basis")
	WebElement invBasis;
	@FindBy(id = "add-content-btn")
	WebElement addNew;
	@FindBy(id = "inv-form-service-0")
	WebElement serviceANI;
	@FindBy(id = "inv-form-note-0")
	WebElement noteANI;
	@FindBy(id = "inv-form-days-0")
	WebElement daysANI;
	@FindBy(id = "inv-form-hours-0")
	WebElement hoursANI;
	@FindBy(id = "inv-form-rate-0")
	WebElement rateANI;
	@FindBy(id = "inv-form-amount-0")
	WebElement amountANI;
	@FindBy(id = "context-delete-inv-content-delete-0")
	WebElement deleteANI;
	@FindBy(id = "inv-form-notes")
	WebElement notesANI;
	@FindBy(id = "inv-form-save-btn")
	WebElement saveANI;
	@FindBy(id = "inv-form-cancel-btn")
	WebElement cancelANI;
	@FindBy(css = "#app > div.application--wrap > main > div > div > div > div.invoice-factory-header.v-card > form > div.layout.pa-3.column > div.flex.mt-5 > div > div.layout.row.justify-space-between > div.flex.xs2 > div > div > div.v-input__slot > div > div > div > label")
	WebElement selectaBank;
	@FindBy(xpath = "//*[@id=\"app\"]/div[3]/div/div/div[1]/a")
	WebElement bankAni;
	@FindBy(xpath = "//div[@class='v-messages__message' and string()='The client field is required.']")
	WebElement clientRequired;
	@FindBy(xpath = "//div[@class='v-messages__message' and string()='The business field is required.']")
	WebElement buisinessRequired;
	@FindBy(xpath = "//div[@class='v-messages__message' and string()='The Invoice number field is required.']")
	WebElement invoiceNumRequired;
	@FindBy(xpath = "//div[@class='v-messages__message' and string()='The Basis field is required.']")
	WebElement basisRequired;
	@FindBy(xpath = "//div[@class='v-messages__message' and string()='The bank field is required.']")
	WebElement bankRequired;
	@FindBy(xpath = "//div[@class='v-messages__message' and string()='The currency field is required.']")
	WebElement currencyRequired;
	@FindBy(xpath = "//*[@id=\"inv-form-cancel-btn\"]/div")
	WebElement cancelAni;

	public AddNewInvoice(WebDriver driver) {
		super(driver);

	}

	public void addEmptySave() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.saveANI.click();
	}

	public boolean clientReq() {
		return this.clientRequired.isDisplayed();
	}

	public boolean buissnesReq() {
		return this.buisinessRequired.isDisplayed();
	}

	public boolean invNumReq() {
		return this.invoiceNumRequired.isDisplayed();
	}

	public boolean basisReq() {
		return this.basisRequired.isDisplayed();
	}

	public boolean bankReq() {
		return this.bankRequired.isDisplayed();
	}

	public boolean currReq() {
		return this.currencyRequired.isDisplayed();
	}

	public void enterTitle(String title) {
		this.nameAni.click();
		this.enterName.sendKeys(title);
	}

	public void addNewInvoiceAll(String invNum, String invBas, String service, String note, String days) {

		this.clientANI.click();
		this.clientChooseANI.click();
		this.businessANI.click();
		this.businessChooseANI.click();
		this.invNumANI.sendKeys(invNum);
		this.invBasis.sendKeys(invBas);
		this.currencyANI.click();
		this.bank.click();
		this.addNew.click();
		this.serviceANI.sendKeys(service);
		this.noteANI.sendKeys(note);
		this.daysANI.sendKeys(days);
		this.selectaBank.click();
		this.bankAni.click();
		this.saveANI.click();

	}

	public void Cancel() {
		this.cancelANI.click();
	}

}
