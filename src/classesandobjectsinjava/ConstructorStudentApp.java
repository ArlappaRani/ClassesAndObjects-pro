package classesandobjectsinjava;

public class ConstructorStudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorStudent S1=new ConstructorStudent("Ajay",22,402,90.5F,"Male");
		S1.Study();
		//creating anonymous object
		new ConstructorStudent("jaya",21,405,97.5F,"Female").Study(); 
           
	}

}
