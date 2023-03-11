package sms.exception;
public class MOBException extends Exception{

	public MOBException(){
		System.out.println("Error : Mark should be between 0-100");
	}
	public MOBException(int l,int h){
		System.out.println("Error : Mark should be between " + l + "-" + h);
	}


}
