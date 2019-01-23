package com.Bento.qa.pages;

import java.nio.channels.InterruptedByTimeoutException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Bento.qa.base.TestBase;

public class ReimbursementPage extends TestBase{
	
	public ReimbursementPage() {
		PageFactory.initElements(driver, this);
	}
	
//	Contact Information :
	@FindBy(xpath="//input[contains(@id, 'filer_email')]")
	WebElement youremail;
	
	@FindBy(xpath="//input[contains(@name, 'filer_phone')]")
	WebElement yourphonenumber;
	
	@FindBy(xpath="//input[contains(@id, 'filer_first_name')]")
	WebElement yourfirstname;
	
	@FindBy(xpath="//input[contains(@id, 'filer_last_name')]")
	WebElement yourlastname;
	
	//Practice Information :
	
	@FindBy(xpath="//input[contains(@id, 'practice_name')]")
	WebElement practicename;
	
	@FindBy(xpath="//input[contains(@id, 'practice_address_1')]")
	WebElement practiceaddress1;
	
	@FindBy(xpath="//input[contains(@id, 'practice_city')]")
	WebElement practicecity;
	
	@FindBy(xpath="//input[contains(@id, 'practice_zip')]")
	WebElement zipcode1;
	
//	Treating Dentist :
	@FindBy(xpath="//input[contains(@id, 'dentist_first_name')]")
	WebElement treatingdentistfirstname;
	
	@FindBy(xpath="//input[contains(@id, 'dentist_last_name')]")
	WebElement treatingdentistlastname;
	
	@FindBy(xpath="//input[contains(@name, 'dentist_phone')]")
	WebElement treatingdentistphonenumber;
	
	@FindBy(xpath="//input[contains(@id, 'dentist_npi')]")
	WebElement treatingdentistid;
	
	@FindBy(xpath="//input[contains(@id, 'dentist_license')]")
	WebElement treatingdentistlisencenumber;
	
	
//	Patient/Member Information :
	@FindBy(xpath="//input[contains(@id, 'patient_first_name')]")
	WebElement patientfirstname;
	
	@FindBy(xpath="//input[contains(@id, 'patient_last_name')]")
	WebElement patientlastname;
	
	@FindBy(xpath="//input[contains(@id, 'patient_dobtext')]")
	WebElement patientdob;
	
	@FindBy(xpath="//input[contains(@id, 'patient_member_id')]")
	WebElement patientbentoid;
	
//	Reimbursement Payment Information :
	
	@FindBy(xpath="//input[contains(@id, 'business_entity_name')]")
	WebElement businessentityname;
	
	@FindBy(xpath="//input[contains(@id, 'business_entity_tax_id')]")
	WebElement businesstaxidtype;
	
	
	@FindBy(xpath="//input[contains(@id, 'business_entity_address_1')]")
	WebElement businessentityaddress1;
	
	@FindBy(xpath="//input[contains(@id, 'business_entity_city')]")
	WebElement businessentitycity;
	
	@FindBy(xpath="")
	WebElement state3;
	
	@FindBy(xpath="//input[contains(@id, 'recipient_zip')]")
	WebElement zipcode2;
	
	@FindBy(xpath="//input[contains(@id, 'owner_director_first_name')]")
	WebElement directorfirstname;
	
	@FindBy(xpath="//input[contains(@id,'owner_director_last_name')]")
	WebElement directorlastname;
	
	@FindBy(xpath="//input[contains(@id,owner_director_dobtext')]")
	WebElement directordob;
	
	@FindBy(xpath="//input[contains(@id,'owner_director_last4_ssn')]")
	WebElement directorlast4ssn ;
	
	@FindBy(xpath="//input[contains(@id,'name_on_account')]")
	WebElement namebankaccount ;
	
	@FindBy(xpath="//input[contains(@id,'account_number')]")
	WebElement bankaccount ;
	
	@FindBy(xpath="//input[contains(@id,'confirm_account_number')]")
	WebElement confirmbankaccount ;
	
	@FindBy(xpath="//input[contains(@id,'routing_number')]")
	WebElement bankrouting ;
	
	@FindBy(xpath="//input[contains(@id,'confirm_routing_number')]")
	WebElement confirmbankrouting ;
	

	
	
	public void contact_information(String your_email,String your_phone_number,String your_first_name,String your_last_name) throws InterruptedException
	{
		youremail.sendKeys(your_email);
		Thread.sleep(1000);
		yourphonenumber.sendKeys(your_phone_number);
		Thread.sleep(1000);
		yourfirstname.sendKeys(your_first_name);
		Thread.sleep(1000);
		yourlastname.sendKeys(your_last_name);
		Thread.sleep(1000);
	}

	public void practice_information(String practice_name,String practice_address1,String practice_city,String State,String ZipCode ) throws InterruptedException
	{
		practicename.sendKeys(practice_name);
		Thread.sleep(1000);
		practiceaddress1.sendKeys(practice_address1);
		Thread.sleep(1000);
		practicecity.sendKeys(practice_city);
		Thread.sleep(1000);
		practicecity.sendKeys(Keys.TAB,State,Keys.ENTER);
		Thread.sleep(1000);
		zipcode1.sendKeys(ZipCode);
		Thread.sleep(1000);
	}

	public void treating_dentist(String treating_dentist_first_name,String treating_dentist_last_name,String treating_dentist_phone_number,String treating_dentist_id,String treating_dentist_lisence_number,String State)throws InterruptedException
	{
		treatingdentistfirstname.sendKeys(treating_dentist_first_name);
		Thread.sleep(1000);
		treatingdentistlastname.sendKeys(treating_dentist_last_name);
		Thread.sleep(1000);
		treatingdentistphonenumber.sendKeys(treating_dentist_phone_number);
		Thread.sleep(1000);
		treatingdentistid.sendKeys(treating_dentist_id);
		Thread.sleep(1000);
		treatingdentistlisencenumber.sendKeys(treating_dentist_lisence_number);
		Thread.sleep(1000);
		treatingdentistlisencenumber.sendKeys(Keys.TAB,State,Keys.ENTER);
		Thread.sleep(1000);
	}

	public void member_information(String patient_first_name,String patient_last_name,String patient_dob,String patient_bento_id)throws InterruptedException
	{
		patientfirstname.sendKeys(patient_first_name);
		Thread.sleep(1000);
		patientlastname.sendKeys(patient_last_name);
		Thread.sleep(1000);
		patientdob.sendKeys(patient_dob);
		Thread.sleep(1000);
		patientbentoid.sendKeys(patient_bento_id);
		Thread.sleep(1000);
	}
	
	public void Reimbursement_Payment_Information(String business_entity_name,String type,
			String business_tax_id_type,String business_entity_address1,String business_entity_city,
			String State,String ZipCode,String director_first_name,
			String director_last_name,String director_dob,String director_last_4_ssn,
			String name_bank_account,String bank_account,String confirm_bank_account,
			String bank_routing,String confirm_bank_routing)throws InterruptedException
	{
		businessentityname.sendKeys(business_entity_name);
		Thread.sleep(1000);
		businessentityname.sendKeys(Keys.TAB,type,Keys.ENTER);
		Thread.sleep(1000);
		businesstaxidtype.sendKeys(business_tax_id_type);
		Thread.sleep(1000);
		businessentityaddress1.sendKeys(business_entity_address1);
		Thread.sleep(1000);
		businessentitycity.sendKeys(business_entity_city);
		Thread.sleep(1000);
		businessentitycity.sendKeys(Keys.TAB,State,Keys.ENTER);
		Thread.sleep(1000);
		zipcode2.sendKeys(ZipCode);
		Thread.sleep(1000);
		directorfirstname.sendKeys(director_first_name);
		Thread.sleep(1000);
		directorlastname.sendKeys(director_last_name);
		Thread.sleep(1000);
		//directordob.sendKeys(director_dob);
		//Thread.sleep(1000);
		directorlast4ssn.sendKeys(director_last_4_ssn);
		Thread.sleep(1000);
		namebankaccount.sendKeys(name_bank_account);
		Thread.sleep(1000);
		bankaccount.sendKeys(bank_account);
		Thread.sleep(1000);
		confirmbankaccount.sendKeys(confirm_bank_account);
		Thread.sleep(1000);
		bankrouting.sendKeys(bank_routing);
		Thread.sleep(1000);
		confirmbankrouting.sendKeys(confirm_bank_routing);
		Thread.sleep(1000);
		
	}

	
}
