package sms.student;
import sms.util.Helper;
import java.util.Hashtable;
import java.util.Enumeration;
class StudentManagement{
	
	public static void main(String[] args) 
	{
		int registerNumber;
		
		Student student;

		

		// CRUD - create read update delete
		int option;
		do{
			
			Helper.sop("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			Helper.sop("~~ Student mangement System ~~");
			Helper.sop("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			Helper.sop(" 1. Add a new Student   ");
			Helper.sop(" 2. Remove a  Student   ");
			Helper.sop(" 3. Edit a  Student     ");
			Helper.sop(" 4. Display a  Student  ");
			Helper.sop(" 5. Display all Student ");
			Helper.sop(" 6. Exit ");
			Helper.sop("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			Helper.sop(" Enter the option (1-6) " );	
			option = Helper.getI();


			switch(option){
				case 1 :
					
							boolean result;
						
							student = new Student();
						
							Helper.sop("Enter the new Student details");
							student.readStudent();
							result = StudentHandler.addStudent(student);

						if(result){

							Helper.sop("Student details added successfully");

						}
						else{
								Helper.sop("Please Try again later");

						}

						break;
				case 2 :
					result = false;	
					Helper.sop("Enter the Register Number of the Student to be removed");
					registerNumber = Helper.getI();
						result = StudentHandler.removeStudent(registerNumber);

						if(result){

							Helper.sop("Student details removed successfully");

						}
						else{
								Helper.sop("There is no student with this Register Number" );

						}

						break;
				case 3 :
					result = false;	
					student = new Student();
					Helper.sop("Enter the details of Student to be updated");
							student.readStudent();
						result = StudentHandler.updateStudent(student);

						if(result){

							Helper.sop("Student details updated successfully");

						}
						else{
							
							Helper.sop("There is no student with this Register Number" );

						}

						break;
				case 4 :
				
						Helper.sop("Enter the roll no of Student to be viewed");
						registerNumber = Helper.getI();

						student = StudentHandler.getStudent(registerNumber);
						if(student != null)	
						{
							Helper.sop("******* Student details *******");
							student.displayStudent();

						}else{

							Helper.sop("There is no student with this Register Number" );
						}



						break;
				case 5 :
						Hashtable<Integer, Student> students = null;

					try{
								students = StudentHandler.getStudents();
								if(students != null){
									Enumeration<Integer> enumeration = students.keys();
				 					while(enumeration.hasMoreElements()) {
						 				 registerNumber = enumeration.nextElement();
						 				student = students.get(registerNumber);
						   				student.displayStudent();
					   				}

								}
								else{
									System.out.println("There is no data");
								}

					  			
							}
							catch(Exception e){
								
							}
						
						break;
				case 6 :
						System.exit(0);
						break;
				default :
						System.out.println("Enter the correct option (1-6)");
						break;

			}

		}while(option != 6);
	}


}

