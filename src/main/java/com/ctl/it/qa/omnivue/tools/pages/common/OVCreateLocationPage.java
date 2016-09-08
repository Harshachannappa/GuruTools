package com.ctl.it.qa.omnivue.tools.pages.common;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;

public class OVCreateLocationPage extends OmniVuePage {
	
	@FindBy(xpath="//div[@ng-show='showLocationType']/select")
	public WebElementFacade ddl_Locationtype;
	
	@FindBy(xpath="//button[@ng-click='create();']")
	public WebElementFacade btn_Location_create;
	
	@FindBy(xpath="//input[@id='addRangeY']")
	public WebElementFacade rdbtn_addRange;
	
	@FindBy(xpath="//select[@id='locationRole']") //1
	public WebElementFacade ddl_locationRole;
	
	@FindBy(xpath="//input[@id='addressNumber']") //2
	public WebElementFacade tbx_addressNumber;
	
	@FindBy(xpath="//input[@id='street']") //3
	public WebElementFacade tbx_street;
	
	@FindBy(xpath="//select[@id='state']") //4
	public WebElementFacade ddl_state;
	
	@FindBy(xpath="//select[@id='city']") //5
	public WebElementFacade ddl_city;
	
	@FindBy(xpath="//input[@id='zip']") //6
	public WebElementFacade tbx_zip;
	
	@FindBy(xpath="//select[@id='NewConstructionIndicator']") //7
	public WebElementFacade ddl_NewConstructionIndicator;
	
	@FindBy(xpath="//input[@id='sWCCLLI']") //8
	public WebElementFacade tbx_sWCCLLI;
	
	@FindBy(xpath="//select[@id='addrangeVal']") //9
	public WebElementFacade ddl_addrangeVal;
	
	@FindBy(xpath="//input[@value='Find Address Range']") //10
	public WebElementFacade btn_FindAddressRange;
	
	@FindBy(xpath="//select[@id='ContractType']") //11
	public WebElementFacade ddl_CTL_ContractType;
	
	@FindBy(xpath="//select[@id='RestrictedAddressCode']") //12
	public WebElementFacade ddl_RestrictedAddressCode;
	
	@FindBy(xpath="//input[@value='Create']") //13
	public WebElementFacade btn_Create;
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	

}
