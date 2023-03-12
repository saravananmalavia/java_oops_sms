package sms.util;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.*;
import java.util.*;
public class FileHelper{

	private static String dataFile;

	static{
		dataFile = "students.data";
	}

	public static void setDataFileName(String file){
		dataFile = file;
	}


	public static Hashtable readData(){

		 FileInputStream inputFIS = null;
		 ObjectInputStream outputOIS = null;

		 Hashtable htStudents = null;
		 try {
		 	 inputFIS = new FileInputStream(dataFile);
			 outputOIS = new ObjectInputStream(inputFIS);

			 htStudents = (Hashtable) outputOIS.readObject();
			 inputFIS.close();
			 outputOIS.close();

			}
			catch(Exception e) {
				//e.printStackTrace();
				//System.out.println("IMSHelper.readData()");
				System.out.println(e);
			}

		 return htStudents;
	}
	public static boolean writeData(Hashtable htStudents){

		FileOutputStream outputFOS = null;
		ObjectOutputStream outputOOS = null;
		boolean result = false;

		try{
			outputFOS = new FileOutputStream(dataFile);
			outputOOS = new ObjectOutputStream(outputFOS);
			outputOOS.writeObject(htStudents);
			
			outputFOS.close();
			outputOOS.close();
			result = true;
		}
		catch(Exception e) {
			//e.printStackTrace();
			//result = true;
			System.out.println(e);
		}

		return result;
	}
}