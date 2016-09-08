package com.ctl.it.qa.omnivue.tools.pages.common;

import org.openqa.selenium.WebDriver;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVServiceDetailsPage extends OmniVuePage {
	
	
	
	@FindBy(id="NAME")
	public WebElementFacade tbx_editDeviceName;
	
	@FindBy(xpath=".//*[@id='left-content-tab']/div/div/div[1]/div/div/div[14]/div[1]/div/span/input[@value='Save']")
	public WebElementFacade btn_save;
	
	@FindBy(xpath=".//*[@id='mainTab']/div/ul/li[2]/a/tab-heading")
	public WebElementFacade tab_device;
	
	@FindBy(xpath=".//*[@id='mainTab']/div/ul/li[3]/a/tab-heading/a[@ng-click='removeTab(tab.id,$index)']/img[1]")
	public WebElementFacade tab_close;
	// close tab of service page []
	
	@FindBy(xpath=".//*[@id='mainTab']/div/ul/li[3]/a/tab-heading/a[@ng-click='removeTab(tab.id,$index)']/img[2]")
	public WebElementFacade tab1_close;
	//close tab of service page [*]
	
	@FindBy(xpath=".//*[@id='dropdownMenu1']/img")
	public WebElementFacade img_settings;
	
	@FindBy(xpath=".//div[2]/div/label[3]/img[@ng-click='deletePoolRange(ind)']")
	public WebElementFacade btn_Ctagdelete;
		
	@FindBy(xpath="//a[text()='Logout']")
	public WebElementFacade lnk_logoutInSettings;
	
	//Order Validation
	
	@FindBy(xpath=".//label[text()='CSOF Order Number:']/following-sibling::label[1]")
	public WebElementFacade lbl_csof_id;
	
	@FindBy(xpath=".//label[text()='Subscriber:']/following-sibling::label[1]")
	public WebElementFacade lbl_subscriber;
	
	@FindBy(xpath=".//label[text()='DTN:']/following-sibling::label[1]")
	public WebElementFacade lbl_dtn;
	
	@FindBy(xpath=".//label[text()='EnsembleOrderNumber']/following-sibling::label[1]")
	public WebElementFacade lbl_EnsembleOrderNumber;
	
	@FindBy(xpath="//*[(@class='col-sm-3 control-label')and(contains(text(),'IPTV Unicast Service'))]")
	public WebElementFacade lbl_IPTV_unicast;
	
	@FindBy(xpath="//a[@ng-click='executeServiceSearch(unicastDetail)']")
	public WebElementFacade link_IPTV_unicast;
	
	@FindBy(xpath="//span[@ng-hide='editIPTVUnicastService']/label[2]")
	public WebElementFacade Name_IPTV_unicast;
	// End of Order Validation
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		
		return null;
	}
	
		
	public void click_savebtn() throws Exception {
		btn_save.click();
		Thread.sleep(5000);
	}
	
	
	public void click_devicetab() throws Exception {
		//close_tab.click();
		//Thread.sleep(5000);
		tab_device.click();
	}
	
	
	public void click_closetab(){
	
		// trying to click on close button .As it have 2image of close , we kept it in nested try.
		try {
			tab_close.click();
			Thread.sleep(2000);
		}
			catch (Exception  e) {
				e.printStackTrace();
		try { 
			tab1_close.click();
			//Thread.sleep(2000);
		}
		catch (Exception e1) {	
		// TODO Auto-generated catch block
			e1.printStackTrace();
			
		}
			}
	
	}
	public void Revertname(){
		
		tbx_editDeviceName.sendKeys("77/L1XX/785391//CTQF");	
	}
	
	public void click_logoutinsettings() throws Exception {
		img_settings.click();
		Thread.sleep(2000);
		lnk_logoutInSettings.click();
		Thread.sleep(15000);
	}

	public void click_Ctagdelete() {
		btn_Ctagdelete.click();
	}
}
