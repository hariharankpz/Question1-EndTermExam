package main;
import java.util.Scanner;

class Courses {
	public String displayCourseDetails(String dept) {
			
			return "You have chosen "+dept+" department.\nThe common subjects are:\n1. Engineering Mathematics\n2. Physics\n3. Chemistry\n";
		}
}

class ECE extends Courses { //extend the parent class here 
	public String displayCourseDetails(String dept) {
		Courses objk = new Courses();
		String commonSubjects = objk.displayCourseDetails("ECE");//call the parent function after using inheritence
		String subject1 = "Microprocessor"; //write the specific subjects name here
		String subject2 = "Linear Integrated Circuits"; //write the specific subjects name here
		String specificSubjects = " specific subjects are:\n4. "+subject1+"\n5. "+subject2;
		System.out.println(commonSubjects+dept+specificSubjects);
		return commonSubjects+dept+specificSubjects;
	}
}
class Mechanical extends Courses{ //extend the parent class here 
	public String displayCourseDetails(String dept) {
		
		Courses objk = new Courses();
		String commonSubjects = objk.displayCourseDetails("Mechanical");//call the parent function after using inheritence
		String subject1 = "Fluid Mechanics"; //write the specific subjects name here
		String subject2 = "Thermodynamics"; //write the specific subjects name here
		
		String specificSubjects = " specific subjects are:\n4. "+subject1+"\n5. "+subject2;
		System.out.println(commonSubjects+dept+specificSubjects);
		return commonSubjects+dept+specificSubjects;	
	
	}

}
class CSE extends Courses { //extend the parent class here 
	public String displayCourseDetails(String dept) {
		Courses objk = new Courses();
		String commonSubjects = objk.displayCourseDetails("CSE");
		//call the parent function after using inheritence
		String subject1 = "Network Theory"; //write the specific subjects name here
		String subject2 = "Operating Systems"; //write the specific subjects name here
		
		String specificSubjects = " specific subjects are:\n4. "+subject1+"\n5. "+subject2;
		System.out.println(commonSubjects+dept+specificSubjects);
		return commonSubjects+dept+specificSubjects;		
	}
}

public class Question1 {
	public static void main(String[] args){
		System.out.println("Departments:");
		System.out.println(" 1) ECE \n 2) Mechanical \n 3) CSE");
		System.out.println("Choose the department:");
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		Question1 mn=new Question1();
		switch(choice) {
		case 1:
		{
		if(choice==1) {
			Courses obj = new ECE();
			obj.displayCourseDetails("ECE");
			
		}
			//Initialize the Class using appropriately taking the concept of inheritence and polymorphism in mind.
			System.out.println("");//call the function of the class that you initialized
			break;
		}
		case 2:
		{
			if(choice==2) {
				Courses obj = new Mechanical();
				obj.displayCourseDetails("Mechanical");
				
			}
			break;
		}
		case 3:
		{
			if(choice==3) {
				Courses obj = new CSE();
				obj.displayCourseDetails("CSE");
				
			}
			break;
		}
		default:
			System.out.println("Invalid input!");
		break;
		}
	}
}