package sms.student;

public class Student{

	private int registerNumber;
	private String studentName;
	private int marks[] = new int[3];
	private String result;
	private int total;
	private double average;

	private static  int PASS_MARK;

	static{

		PASS_MARK = 50;
	}


	public int getRegisterNumber(){

		return this.registerNumber;
	}
	public void setRegisterNumber(int registerNumber){

		this.registerNumber = registerNumber;
	}

	public String getStudentName(){

		return this.studentName;
	}
	public void setStudentName(String studentName){

		this.studentName = studentName;
	}

	public int[] getMarks(){

		return this.marks[];
	}
	public void setRegisterNumber(int[] marks){

		this.marks = marks;
	}


	public String getResult(){

		result = "PASS";

		for(int i=0; i<marks.length; i++){
			if(marks[i] < PASS_MARK ){
				result = "FAIL";
			}	
		}

		return this.result;
	}

	public int getTotal(){

	
		for(int i = 0; i<marks.length; i++){
			total += marks[i];
		}

		return this.total;
		
	}

	public double getAverage(){

		
	}


	
}