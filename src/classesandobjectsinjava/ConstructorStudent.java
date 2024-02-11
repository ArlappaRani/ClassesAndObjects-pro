package classesandobjectsinjava;

public class ConstructorStudent {
	//Data Members(Properties or Attributes)
		String Name;
		int Age;
		int RollNumber;
		float Percentage;
		String Gender;
		//Creating a constructor 
		public  ConstructorStudent(String a,int b,int c,float d,String e)
		{
		Name=a;//Assigning variables to data members
		Age=b;
		RollNumber=c;
		Percentage=d;
		Gender=e;
		}

		//creating a Data functions(Behavior or methods of objects)
		void Study()
		{
			System.out.println(Name+" "+"is studying B.Tech his RollNumber is:"+RollNumber);
			
		}
}
