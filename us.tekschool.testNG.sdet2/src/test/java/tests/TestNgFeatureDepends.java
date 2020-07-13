package tests;

import org.testng.annotations.Test;

public class TestNgFeatureDepends {
	
	@Test(priority=2,groups="Title")
	public void pageTitle() {
		System.out.println("Make sure page Title is desply");
		
	}
  @Test (invocationCount=3,groups="Logo")  //invocationCount=number will execute the method continuously base on ur number                                      
  public void pageLogo() {
	  System.out.println("check page logo is desplay");
	  
  }
  @Test(priority=1,groups="Registration")
  public void customerReg() {
	  System.out.println("required customer registration ");
	  
  }
  @Test(groups="Detials")
  public void customerDetails() {
	  System.out.println("add custoemr all details");
//	  add custoemr all details
//	  check page logo is desplay
//	  Make sure page Title is desply
//	  required customer registration 
//	  PASSED: customerDetails
//	  PASSED: pageLogo
//	  PASSED: pageTitle
//	  PASSED: customerReg
  }
}
