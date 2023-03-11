package sms.util;

import java.util.*;
import sms.exception.*;

public class Helper{

	static Scanner scanner = new Scanner(System.in);


	public static double getArrayAverage(int values[]){

		int sum = 0; double avg;
		for(int i=0;i<values.length;i++){
			sum += values[i];
		}
		avg = sum/values.length;

		return avg;
	}


	public static int getI(){
		int val = 0;
		boolean corectValue = false;

		do{

			try{
				val = scanner.nextInt();
				corectValue = true;
				
			}
			catch(Exception e){
				getS(); 
				System.out.println("enter a valid integer");
			}

		} while(corectValue != true);
		
		return val;

	}

	public static String getS(){

		String val = scanner.next();
		return val;
	}

	public  static int getMark(){
		int mark = 0;
		boolean corectMark = false;

		do{
			try{
				mark = getI();
				if(mark<0 || mark >100){
					throw new MOBException();
				}
				corectMark = true;

			}
			catch(MOBException e){
				System.out.println("ente the valid mark");
			}
		}while(corectMark != true);
		
		return mark;
	}

	
	public static void sop(String message){

		System.out.println(message);

	}


	public static void main(String args[])
       {

		System.out.print("Enter the Mark :");
       	int i  = Helper.getMark();
       	System.out.println(i);

       }

	
}