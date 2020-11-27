package com.pages;

import com.common.GenericImplementation;

public class LeadCreatePage extends GenericImplementation {

	public static String leadCreatnpagLablActVal = prop.getProperty("leadsCreatPagActVal");
	public static String leadCreationpagLablLocatrVal = prop.getProperty("leadCreatnpag_ById");
	
	public static String comapnyNamTxtFd = prop.getProperty("comapnyNamTxtFd");
	public static String cmpnyNamTxtFdLocById = prop.getProperty("cmpnyNamTxtFdLocById");
	
	public static String firstNamTxtFd = prop.getProperty("firstNamTxtFd");
	public static String firstNamTxtFdLocById = prop.getProperty("firstNamTxtFdLocById");
	
	public static String lastNameTxtFd = prop.getProperty("lastNameTxtFd");
	public static String lastNamTxtFdLocById = prop.getProperty("lastNamTxtFdLocById");
	
	public static String pinCodeTxtFd = prop.getProperty("pinCodeTxtFd");
	public static String pinCodTxtFdLocById = prop.getProperty("pinCodTxtFdLocById");
	
	public static String creatLeadBtnLocByClasNam = prop.getProperty("creatLeadBtnLocByClasNam");	
	
	public LeadCreatePage verifyLeadCreationPage () {		
		verifyTextById(leadCreationpagLablLocatrVal, leadCreatnpagLablActVal); 
		return this;		
		
	}	

	public  LeadCreatePage enterLeadCompanyNam() throws Exception {
	
	enterById(cmpnyNamTxtFdLocById, comapnyNamTxtFd);
	
	return this;
	}
	
	public  LeadCreatePage enterLeadFirstNam() throws Exception {
	
		enterById(firstNamTxtFdLocById, firstNamTxtFd);
		
		return this;
	}
	
	public  LeadCreatePage enterLeadLastNam() throws Exception {
	
	enterById(lastNamTxtFdLocById, lastNameTxtFd);
	
	return this;
	}
	
	public  LeadCreatePage enterLeadPinCod() throws Exception {
	
	enterById(pinCodTxtFdLocById, pinCodeTxtFd);
	
	return this;
	}
	
	
	public  LeadCreatePage clickCreateLeadBtn() throws Exception {
	
	//clickById("ext-gen615"); //unable to handle it by id but there is no dup values, why?
	clickByClassName(creatLeadBtnLocByClasNam);
	
	return this;
	}
	

	
}
