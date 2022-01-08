package OOPS_Java_Encapsulation;

public class Company_1 {
	
	public String name;
	public String logo;
	public int EmpCount;
	private String searchEngine;
	private int revenue;
	
	//getter and setter
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
		//this.name=name +  " " + "super fast";
	}
	
	public String getLogo()
	{
		return logo;
	}
	
	public void setLogo(String logo)
	{
		this.logo=logo;
	}
	
	public int getempCount()
	{
		return EmpCount;
	}
	
	public  void setempCount(int empCount)
	{
		this.EmpCount=empCount;
		this.EmpCount=EmpCount+10;
	}
	
	public String getsearchEngine()
	{
		return searchEngine;
	}

	public void setEngine(String searchEngine)
	{
		this.searchEngine=searchEngine;
	}
	
	public int getrevenue()
	{
		return revenue;
	}
	
	public void setrevenue(int revenue)
	{
		this.revenue=revenue;
	}
}
