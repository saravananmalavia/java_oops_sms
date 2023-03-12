package sms.student;
import sms.util.*;
import java.util.*;
import java.io.Serializable;
public class StudentHandler implements Serializable {
	  static Hashtable<Integer, Student> students ; 
					
					static boolean result;
	//CRUD


		static {
		students = FileHelper.readData();
		if(students == null){
				students = new Hashtable<Integer,Student>();
		}
	}

	public static boolean addStudent(Student student){
			result = false;

			try{
				students.put(student.getRegisterNumber(),student);
				FileHelper.writeData(students);
				
				result = true;
			}
			catch(Exception e){

			}
			return result;
	} 

	

	public static boolean removeStudent(int registerNumber ){
			
			result = false;


			try{
				students = FileHelper.readData();	
				if(students.containsKey(registerNumber)){
					students.remove(registerNumber);
					FileHelper.writeData(students);
					result = true;
				}
			}
			catch(Exception e){

				}
			
			
		return result;
	} 


	public static boolean updateStudent(Student student ){
			
			result = false;


			try{
				students = FileHelper.readData();	
				if(students.containsKey(student.getRegisterNumber())){
					students.remove(student.getRegisterNumber());

					students.put(student.getRegisterNumber(),student);
					FileHelper.writeData(students);
					 result = true;
				}
			}
			catch(Exception e){

				}
			
			
		return result;
	} 




	public static Student getStudent(int registerNumber ){
			
			Student student = null; 


			try{
				students = FileHelper.readData();	
				
				if(students.containsKey(registerNumber)){
					student = students.get(registerNumber);
				}
			}
			catch(Exception e){

				}
			
			
		return student;
	} 


	public static Hashtable getStudents(){

		students = FileHelper.readData();	
		return students;
	} 


}