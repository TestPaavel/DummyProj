//Private: Specific class                      Public: Any class or Package
//Default: Specific Package                    Protected: Subsiding Class

package OOPS_Java_Encapsulation_2;

public class Web_Automation {
	
	public void launch_Browser()
	{
		interactWithBrowser();
	}

	private void interactWithBrowser() 
	{
		// TODO Auto-generated method stub
		checkBrowserCompatability();
	}

	private void checkBrowserCompatability() 
	{
		// TODO Auto-generated method stub
		checkBrowserVersion();
	}

	private void checkBrowserVersion() 
	{
		// TODO Auto-generated method stub
		checkBrowserWithOS();
	}

	private void checkBrowserWithOS() 
	{
		// TODO Auto-generated method stub
		System.out.println("launching the Browser");
	}

	public static void main(String[] args)
	{
		Web_Automation Program1= new Web_Automation();
		Program1.launch_Browser();
	}
}
