package classesandobjectsinjava;

public class Employee {
	//Creating data members 
	String Name;
	int Id;
	float Salary;
	String Gender;
	String Team;
	//Creating a Constructor and solving a shadowing problem
	public Employee(String Name,int Id,float Salary,String Gender,String Team)
	{
		this.Name=Name;//Using this keyword 
		this.Id=Id;
		this.Salary=Salary;
		this.Gender=Gender;
		this.Team=Team;
	}
	//creating member functions
	void Introduce()
	{
	   System.out.println("Employee Name:"+Name);
	   System.out.println("Employee Id:"+Id);
	   System.out.println("Employee Salary:"+Salary);
	   System.out.println("Employee Gender:"+Gender);
	   System.out.println("Employee Team:"+Team);
	}
	

}
