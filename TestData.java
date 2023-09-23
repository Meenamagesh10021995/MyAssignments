package homeassignment;

public class TestData extends LoginTestData {
public void enterCredentials() {
	System.out.println("Enter the  valid Credentials");
}
public void navigatetoHomePage() {
	System.out.println("Home Page");
	
}
public static void main(String[] args) {
	TestData sd = new TestData();
	sd.enterCredentials();
	sd.navigatetoHomePage();
	sd.enterusername();
	sd.enterpassword();
}
}
