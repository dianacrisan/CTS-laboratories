package ro.ase.csie.cts.g1092.dp.proxy;

public class LoginWith2FactorAuthentication implements LoginInterface {

	LoginInterface loginModule = null;
	
	public LoginWith2FactorAuthentication(LoginInterface loginModule) {
		super();
		this.loginModule = loginModule;
	}
	
	public boolean checkGeneratedCode(int code) {
		if(code == 1245) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean login(String username, String pass) {
		if(this.loginModule.login(username, pass)) {
			System.out.println("Please input the generated code received via SMS");
			System.out.println("Checking received code");
			if(checkGeneratedCode(1245)) {
				System.out.println("Hello " + username);
				return true;
			}
			else {
				System.out.println("The code is not correct");
			}
		}
		return false;
	}

	@Override
	public boolean checkServerStatus() {
		return this.loginModule.checkServerStatus();
	}

	// set method to change between different login modules can be implemented
}
