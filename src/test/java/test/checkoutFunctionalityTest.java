package test;

import org.testng.annotations.BeforeMethod;

import utilities.commonMethods;



public class checkoutFunctionalityTest extends commonMethods {
	
	homepageFunctionalityTest hpf = new homepageFunctionalityTest();
	productpageFunctionalityTest pdf = new productpageFunctionalityTest();
	cartpageFunctionalityTest cpf = new cartpageFunctionalityTest();
	
	@BeforeMethod
	public void setUp() {
		getDriver();
	}

}
