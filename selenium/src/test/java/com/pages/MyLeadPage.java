package com.pages;

import com.common.GenericImplementation;

public class MyLeadPage extends GenericImplementation {

	public static String leadspagLablActVal = prop.getProperty("leadsPagActVal");
	public static String leadspagLablLocatrVal = prop.getProperty("leadspag_ById");
	public static String leadCreationTabLocatrVal = prop.getProperty("leadCreation_ByLink");

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

	public MyLeadPage verifyLeadPage() {
		verifyTextById(leadspagLablLocatrVal, leadspagLablActVal);
		return this;

	}

	public MyLeadPage clickCreateLeadLink() throws Exception {

		clickByLink(leadCreationTabLocatrVal);
		return this;
	}

	
	public MyLeadPage enterLeadCompanyNam() throws Exception {

		enterById(cmpnyNamTxtFdLocById, comapnyNamTxtFd);

		return this;
	}

	public MyLeadPage enterLeadFirstNam() throws Exception {

		enterById(firstNamTxtFdLocById, firstNamTxtFd);

		return this;
	}

	public MyLeadPage enterLeadLastNam() throws Exception {

		enterById(lastNamTxtFdLocById, lastNameTxtFd);

		return this;
	}

	public MyLeadPage enterLeadPinCod() throws Exception {

		enterById(pinCodTxtFdLocById, pinCodeTxtFd);

		return this;
	}

	public MyLeadPage clickCreateLeadBtn() throws Exception {

		clickByClassName(creatLeadBtnLocByClasNam);

		return this;
	}
	
	public MyLeadPage verifyLeadCreation() throws Exception {
		if (isElementDisplayedById("sectionHeaderTitle_leads")) {
			System.out.println("Lead created successfully");
		} else {
			System.out.println("Lead not created");
			throw new Exception();
		}
		return this;
	}

}
