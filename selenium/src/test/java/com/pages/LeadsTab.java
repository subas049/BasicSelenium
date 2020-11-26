package com.pages;

import com.common.GenericImplementation;

public class LeadsTab extends GenericImplementation {
	
		
	public  LeadsTab enterLeadCompanyNam() throws Exception {
		
		enterById("createLeadForm_companyName", "BBM");
		
		return this;
	}
	
	public  LeadsTab enterLeadFirstNam() throws Exception {
		
			enterById("createLeadForm_firstName", "FirstNam");
			
			return this;
		}
	
	public  LeadsTab enterLeadLastNam() throws Exception {
		
		enterById("createLeadForm_lastName", "LastNam");
		
		return this;
	}
	
	public  LeadsTab enterLeadPinCod() throws Exception {
		
		enterById("createLeadForm_generalPostalCodeExt", "10203");
		
		return this;
	}
	
	
public  LeadsTab clickCreateLeadBtn() throws Exception {
		
		//clickById("ext-gen615"); //unable to handle it by id but there is no dup values, why?
	clickByClassName("smallSubmit");
		
		return this;
	}

public  LeadsTab isComanyNameDisplayed() throws Exception {
	
	//clickById("ext-gen615"); //unable to handle it by id but there is no dup values, why?
isElementDisplayedById("viewLead_companyName_sp");
	
	return this;
}
	
/*public  LeadsTab isFirstNamLocalDisplayed() throws Exception {
	
	//clickById("ext-gen615"); //unable to handle it by id but there is no dup values, why?
isElementDisplayedById("viewLead_firstNameLocal_sp");
	
	return this;
}	*/

public  LeadsTab isReasignBtnEnabled() throws Exception {
	
	//clickById("ext-gen615"); //unable to handle it by id but there is no dup values, why?
//isElementDisplayedById("ext-gen605");
	isElementEnabledByXpath("//div[@id='_G18209__body']//tr[2]//td[2]//input[@id='ext-gen596']");

/*//div[@id='_G18209__body']//tr[2]//td[2]/input
*/	
	return this;
}	
	

	

}
