package com.Bento.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Bento.qa.base.TestBase;
import com.Bento.qa.pages.Employersignuppage;
import com.Bento.qa.pages.ReimbursementPage;

public class ReimbursementTest extends TestBase{
	
	ReimbursementPage reimbursement;
	
	public ReimbursementTest ()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization("reimbursement"); // Call initialization method from testBase class
		reimbursement = new ReimbursementPage();
		Thread.sleep(2000);
		}	

	@Test
	public void create_ReimbursementPage () throws InterruptedException
	{
		reimbursement.contact_information(prop.getProperty("your_email"),prop.getProperty("your_phone_number"),prop.getProperty("your_first_name"),prop.getProperty("your_last_name"));
		reimbursement.practice_information(prop.getProperty("practice_name"),prop.getProperty("practice_address1"),prop.getProperty("practice_city"),prop.getProperty("State"),prop.getProperty("ZipCode"));
     	reimbursement.treating_dentist(prop.getProperty("treating_dentist_first_name"),prop.getProperty("treating_dentist_last_name"),prop.getProperty("treating_dentist_phone_number"),prop.getProperty("treating_dentist_id"),prop.getProperty("treating_dentist_lisence_number"),prop.getProperty("State"));
		reimbursement.member_information(prop.getProperty("patient_first_name"),prop.getProperty("patient_last_name"),prop.getProperty("patient_dob"),prop.getProperty("patient_bento_id"));
		reimbursement.Reimbursement_Payment_Information(prop.getProperty("business_entity_name"),prop.getProperty("type"),
				prop.getProperty("business_tax_id_type"),prop.getProperty("business_entity_address1"),prop.getProperty("business_entity_city"),
				prop.getProperty("State"),prop.getProperty("ZipCode"),prop.getProperty("director_first_name"),
				prop.getProperty("director_last_name"),prop.getProperty("director_dob"),prop.getProperty("director_last_4_ssn"),
				prop.getProperty("name_bank_account"),prop.getProperty("bank_account"),prop.getProperty("confirm_bank_account"),
				prop.getProperty("bank_routing"),prop.getProperty("confirm_bank_routing"));
	}
}

