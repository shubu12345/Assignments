
public class Student {

		  String firstName;
		  String lastName;
		  int age;

//		  Student constructor
		  public Student(){
		      firstName = "Rahul";
		      lastName = "Patil";
		      age = 25;
		  }
		  
		  public void Student(String firstName,String lastName,int age,float percentage)
		  {
			  firstName="Shubham";
			  lastName="Shinde";
			  age=20;
			  percentage=72;
		  }
		  
		  public static void main(String args[]) {
		      Student myStudent = new Student();//if we delete default constructor it will throw error
		      System.out.println(myStudent.firstName);
		      // 100
		  }
		}

