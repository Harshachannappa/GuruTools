package com.ctl.it.qa.omnivue.tools.pages.common;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OV_GearIcon extends OmniVuePage  {
	
	@FindBy(xpath="//a[text()='Administration']")
	public WebElementFacade gearicon_Admin;
	
	@FindBy(xpath="//a[text()='Manage Users']")
	public WebElementFacade Admin_ManageUsers;
	
	@FindBy(xpath="//a[text()='Manage Workgroups']")
	public WebElementFacade Admin_ManageWorkgroups;
	
	@FindBy(xpath="//select[@class='form-control-osip ng-pristine ng-untouched ng-valid']")
	public WebElementFacade ddl_FilterBy;
	
	@FindBy(xpath="//input[@ng-model='filterText']")
	public WebElementFacade tbx_Filtertext;
	
	@FindBy(xpath="//input[@value='Search User']")
	public WebElementFacade btn_SearchUser;
	
	@FindBy(xpath="//*[@id='row0jqxGrid0']/div[1]/div/input")
	public WebElementFacade btn_ViewUser;
	
	@FindBy(xpath="//a[text()='Manage Hierarchy']")
	public WebElementFacade tab_Manage_Hierarchy;
	
	@FindBy(xpath="//div[@style='padding-left: 149px;margin-top:36px;']")
	public WebElementFacade box_Manage_Hierarchy;
	
	@FindBy(xpath="//div[@ng-repeat='list in divlist']")
	public WebElementFacade count_Manage_Hierarchy;
	
	@FindBy(xpath="//select[@id='leftToRightWorkGroup']")
	public WebElementFacade ddl_select_workgroup;
	
	@FindBy(xpath="//button[@value='Edit Workgroup']")
	public WebElementFacade btn_Edit_Workgroup;
	
	@FindBy(xpath="//button[@value='Add Role']")
	public WebElementFacade btn_Add_Role;
	
	@FindBy(xpath="//input[@ng-model='roleInfo.roleName']")
	public WebElementFacade tbx_Role_Name;
	
	@FindBy(xpath="//input[@value='Create Role']")
	public WebElementFacade btn_Create_Role;
	
	@FindBy(xpath="//button[@value='Delete Role']")
	public WebElementFacade btn_Delete_Role;
	
	@FindBy(xpath="//div[@ng-init='viewWorkgroup(tab.content);']/div[1]")
	public WebElementFacade Delete_succes_msg;
	
	@FindBy(xpath="//select[@ng-model='userSelectWorkGroupRoleList']")
	public WebElementFacade ddl_userselected_role;
	
	public void Hierarchy_validation(){
	
		WebElement hierarchy_box = box_Manage_Hierarchy;
		
		List<WebElement> count = hierarchy_box.findElements(By.className("ng-scope"));
		
		for(int i=1; i<=count.size(); i++){
			
			String start = "//div[@class='row']/div[";
			String End = "][@class='ng-scope']/div/div/div/span";
			
			String Start2 = "//div[@class='row']/div[";
			String End2 = "][@class='ng-scope']/div/div/div/span[2]";
			
			String name = getDriver().findElement(By.xpath(start+i+End)).getText();
			
			String designation = getDriver().findElement(By.xpath(Start2+i+End2)).getText();
			
			System.out.println(name+" and "+designation);
			
		}
		
	}
		
	
	public void move_to_admin() throws Throwable{
		
		Actions a = new Actions(getDriver());
		a.moveToElement(gearicon_Admin).build().perform();
		a.moveToElement(Admin_ManageUsers).click().build().perform();
		a.moveToElement(btn_ViewUser).click();
		Thread.sleep(2000);
	}

	public void move_to_admin_wokgroups() throws Throwable{
		
		Actions a = new Actions(getDriver());
		a.moveToElement(gearicon_Admin).build().perform();
		a.moveToElement(Admin_ManageWorkgroups).click().build().perform();
		a.moveToElement(btn_ViewUser).click();
		Thread.sleep(2000);
	}
		
	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
