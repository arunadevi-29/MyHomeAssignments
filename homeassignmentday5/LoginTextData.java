package homeassignmentday5;

public class LoginTextData extends TextData {

		// TODO Auto-generated method stub
			public void enterUsername()
			{
				System.out.println("enterUsername");
			}
			public void enterPassword()
			{
				System.out.println("enterPassword");
			}
			
			public static void main(String[] args) {
				
				LoginTextData data = new LoginTextData();
				data.enterCredentials();
				data.enterPassword();
				data.enterUsername();
				data.navigateToHomePage();
				
			}
}
