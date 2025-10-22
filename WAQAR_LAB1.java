import java.util.Scanner;
public class WAQAR_LAB1 {

public static void main(String[] args) {

//  creating a Grading system

System.out.println("Enter your name: ");

Scanner sc = new Scanner(System.in);
String name = sc.nextLine();

System.out.println("Enter your Grade");

String grade = sc.nextLine();  
System.out.println(" Your Grade is " + grade);


	if(grade.equalsIgnoreCase("A")){
		System.out.println("you Got A in all subjects" );
	}
	
	else if(grade.equalsIgnoreCase("B")){
		System.out.println("you Got B in all subjects" );
	}

	else if(grade.equalsIgnoreCase("c")) {
		System.out.println("you Got  C in all subjects" );
	}
	
	else{
		System.out.println("Better Luck Next time");
	}
  }
}
