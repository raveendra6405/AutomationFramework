package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	
	WebDriver oBrowser=null;
	public ActiTimePage(WebDriver oBrowser)
	{
		this.oBrowser=oBrowser;
		PageFactory.initElements(oBrowser, this);
	}
	
	
	//UserName text field WebElement
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	

	
	//Password text field WebElement
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	
	//Login button WebElement
	@FindBy(xpath="//*[@id='loginButton']/div")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}
	
	//FlyoutWindow WebElement
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}			
	
	// closeflyoutWindow WebElement
    private WebElement gettingStartedShortcutsMenuCloseId;
    public WebElement getCloseButtonWindow()
    {
    	return gettingStartedShortcutsMenuCloseId;
    }
	//click on user button
	@FindBy(xpath="//a[@href='/administration/userlist.do']")
	private WebElement userbutton;
	public WebElement getuser()
	{
		return userbutton;
	}
	
	//click on add user
	@FindBy(xpath="//*[@id=\"createUserDiv\"]/div")
	private WebElement adduserbutton;
	public WebElement getuseradd()
	{
		return adduserbutton;
	}
	
	//Firstname textfieldin adduser
	private WebElement userDataLightBox_firstNameField;
	public WebElement getFirstName()
	{
		return userDataLightBox_firstNameField;
	}
	
	//email textfield in add user
	private WebElement userDataLightBox_emailField;
	public WebElement getEmail()
	{
		return userDataLightBox_emailField;
	}
	
	//lastname textfield for add user 
	private WebElement userDataLightBox_lastNameField;
	public WebElement getLastName()
	{
		return userDataLightBox_lastNameField;
	}
	
	//username for users in adduser
	private WebElement userDataLightBox_usernameField;
	public WebElement getAddUserName()
	{
		return userDataLightBox_usernameField;
	}
	
	//password for user in adduser
	private WebElement userDataLightBox_passwordField;
	public WebElement getPasswordUser()
	{
		return userDataLightBox_passwordField;
	}
	
	//confirmpassword for user
	private WebElement userDataLightBox_passwordCopyField;
	public WebElement getconfirmPasswordUser()
	{
		return userDataLightBox_passwordCopyField;
	}
	
	//click on createuserbutton
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']")
	private WebElement commituser;
	public WebElement getcreateuserbutton()
	{
		return commituser;
	}
	
	//start exploring actitime webelement
	@FindBy(xpath="//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")
	private WebElement seactitimebutton;
	public WebElement getSEActitimeButton()
	{
		return seactitimebutton;
	}
	
	//search textbox WebElement for user
	@FindBy(xpath="//*[@id='userListTableHeader']/tr[2]/th[1]/table/tbody/tr/td[1]/table/tbody/tr/td[1]/input")
	private WebElement textbox;
	public WebElement getClickOnTextBox()
	{
		return textbox;
	}
	
	//searchtextbox closebutton webelement
	@FindBy(xpath="//*[@id='userListTableHeader']/tr[2]/th[1]/table/tbody/tr/td[1]/table/tbody/tr/td[2]/div")
	private WebElement crossbuttonforusertextbox;
	public WebElement getUserCloseButton()
	{
		return crossbuttonforusertextbox;
	}
	
/*	//clickon user2 WebElement
	@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr/td[1]/div/table/tbody/tr/td/div[1]/span[2]")
	private WebElement clickonuser2;
	public WebElement getUser2()
	{
		return clickonuser2;
	}
*/	
	//click on user1,2,3
	@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement clickonuser;
	public WebElement getClickOnUser()
	{
		return clickonuser;
	}
	
	/*//clickon user3 WebElement
		@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr/td[1]/div/table/tbody/tr/td/div[1]/span[2]")
		private WebElement clickonuser3;
		public WebElement getUser3()
		{
			return clickonuser3;
		}*/
	
	//click on delete button
	@FindBy(xpath="//*[@id='userDataLightBox_deleteBtn']")
	private WebElement deleteuser;
	public WebElement getClickOnDeleteButton()
	{
		return deleteuser;
	}
	
	//click on tasks
	@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[3]/a")
	private WebElement clickontasks;
	public WebElement getClickOnTasks()
	{
		return clickontasks;
	}
	
	//click on addnew in tasks
	@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[3]")
	private WebElement clickonaddnew;
	public WebElement getClickOnAddnewButton()
	{
		return clickonaddnew;
	}
	
	//click on new customer
	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement clickonnewcustomer;
	public WebElement getClickOnNewCustomerButton()
	{
		return clickonnewcustomer;
	}
	
	//click on customer text field
	@FindBy(xpath="//*[@id='customerLightBox_nameField']")
	private WebElement clickoncustomertextfield;
	public WebElement  getClickonCustomerTextField()
	{
		return clickoncustomertextfield;
	}
	
	//CLICK ON commit CUSTOMERBUTTON
	@FindBy(xpath="//*[@id='customerLightBox_commitBtn']/div/span")
	private WebElement clickoncommitbutton;
	public WebElement getClickonCustomerCommitbutton()
	{
		return clickoncommitbutton;
	}
	
	//click on editbutton customer
	@FindBy (xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement clickoneditbutton;
	public WebElement getClickOnCustomereditButton()
	{
		return clickoneditbutton;
	}
	
	//clickon action button
	@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div/div[2]")
	private WebElement actionbutton;
	public WebElement getClickonCustomerActionButton()
	{
		return actionbutton;
	}
	
	//clickon deletecustomer button
	@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")
	private WebElement deletecustomer;
	public WebElement getClickonDeleteCustomerbutton()
	{
		return deletecustomer;
	}
	
	//click on deletepermanentlybutton for customer
	@FindBy(xpath="//*[@id='customerPanel_deleteConfirm_submitTitle']")
	private WebElement deletepermanentlybutton;
	public WebElement getClickonDeletepermanentlyButton()
	{
		return deletepermanentlybutton;
	}
	
	// modifycustomer 
	@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
	private WebElement modifycustomer;
	public WebElement getModifyCustomer()
	{
		return modifycustomer;
	}
	
	//closebutton for modifycustomer window
	@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[1]/div[1]")
	private WebElement closebutton;
	public WebElement getCustomerCloseButton()
	{
		return closebutton;
	}
	
	//click on newprojectButton
	@FindBy(xpath="/html/body/div[14]/div[2]")
	private WebElement newproject;
	public WebElement getClickonNewProjectButton()
	{
		return newproject;
	}
	
	//click on projectname textfield
	@FindBy(xpath="//*[@id='projectPopup_projectNameField']")
	private WebElement projectnametextfield;
	public WebElement getClickOnProTextField()
	{
		return projectnametextfield;
	}
	
	//project submit button
	@FindBy(xpath="//*[@id='projectPopup_commitBtn']/div/span")
	private WebElement projectcommitbutton;
	public WebElement getClickOnProCommitButton()
	{
		return projectcommitbutton;
	}
	
	//project editbutton
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement projecteditbutton;
	public WebElement getClickonCusEditButton()
	{
		return projecteditbutton;
	}
	
	//project description 
	@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
	private WebElement projectdescription;
	public WebElement getClickonProjectDescription()
	{
		return projectdescription;
	}
	
	//closebutton for modifyproject window
		@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[1]/div[1]")
		private WebElement closebuttonforpro;
		public WebElement getProjectCloseButton()
		{
			return closebuttonforpro;
		}
	//action button for customer
	@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement action;
	public WebElement getClickonProjectActionButton()
	{
		return action;
	}
	
	//delete button for customer
	@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]/div")
	private WebElement delbutcus;
	public WebElement getClickonProjectDeleteButton()
	{
		return delbutcus;
	}
	
	//deletepermanently button for customer
	@FindBy(xpath="//*[@id='projectPanel_deleteConfirm_submitBtn']/div")
	private WebElement customerdeletepermanentlybutton;
	public WebElement getClickonCusDelPerBut()
	{
		return customerdeletepermanentlybutton;
	}
	
	//click on addnewtasks
	@FindBy(xpath="//*[@id='taskListBlock']/div[1]/div[1]/div[3]/div/div[3]")
	private WebElement addnewtasks;
	public  WebElement getAddNewTasks()
	{
		return addnewtasks;
	}
	
	//click on create new tasks
	@FindBy(xpath="/html/body/div[13]/div[1]")
	private WebElement createnewtasks;
	public WebElement getCreateNewTasks()
	{
		return createnewtasks;
	}
	
	//task text field
	@FindBy(xpath="//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input")
	private WebElement tasktextfield;
	public WebElement  getTaskTextField()
	{
		return tasktextfield;
	}
	
	//create task commit button
	@FindBy(xpath="//*[@id='createTasksPopup_commitBtn']")
	private WebElement createtask;
	public WebElement getClickonCreateTaskButton()
	{
		return createtask;
	}
	
	//click on created task
	@FindBy(xpath="//*[@id='taskListBlock']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]")
	private WebElement clickcreatedtaskaction;
	public WebElement getClickOnCreatedUserAction1()
	{
		return clickcreatedtaskaction;
	}
	
	//actionbutton for created task  
	@FindBy(xpath="//*[@id='taskListBlock']/div[3]/div[1]/div[2]/div[3]/div/div")
	private WebElement clickonactionbutton;
	public WebElement getActionButtonForUser1()
	{
		return clickonactionbutton;
	}
	
	//delete button for task1
	@FindBy(xpath="//*[@id='taskListBlock']/div[3]/div[4]/div/div[3]/div")
	private WebElement deletebuttonfortask1;
	public WebElement getDeleteButtonForTask1()
	{
		return deletebuttonfortask1;
	}
	
	//deletepermanently button for task
	@FindBy(xpath="//*[@id='taskPanel_deleteConfirm_submitBtn']/div")
	private WebElement actionfordelpermanentlyfortask;
	public WebElement getDeletePermanentlyButtonForTask()
	{
		return actionfordelpermanentlyfortask;
	}
	//Logout Link WebElement
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}
	
	

}
