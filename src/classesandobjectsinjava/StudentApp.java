package classesandobjectsinjava;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student S1=new Student();//creating object with reference variable
		S1.Name="Arjun";//with reference variable we assigning the values 
		S1.Age=22;
		S1.RollNumber=402;
		S1.Percentage=70.5F;
		S1.Gender="Male";
		S1.Study();//with reference variable calling the method
		S1.play();

	}


}
