package Overloading;

public class LoginToApplication {
	
	//already stored credentials
	public void login()
	{
		System.out.println("login to app as already stored credentials");
	}

	public void login(String username)
	{
		System.out.println("Login to the app by: " + username);
	}
	
	public void login(String username, char Password)
	{
		System.out.println("Login to the app by: " + username + Password);
	}
	
	public void login(int PhoneNo,char Password)
	{
		System.out.println("Login to the app by: " + PhoneNo + Password);
	}
	
	public void login(int otp)
	{
		System.out.println("Login to the app by: " + otp);
	}
	
	public void login(String username, int PhoneNo)
	{
		System.out.println("Login to the app by: " + username + PhoneNo);
	}
	
	
}
