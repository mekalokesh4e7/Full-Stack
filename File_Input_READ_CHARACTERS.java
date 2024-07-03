package homework_1;
import java.io.*;
public class File_Input_READ_CHARACTERS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
     FileInputStream FIS = new  FileInputStream("C:\\Users\\Lokesh\\OneDrive\\Documents\\Desktop\\lokeshTMF.txt");
  /*int i =  FIS.read();
   System.out.println((char)i);*/
    int i;
     while((i=FIS.read())!= -1)
     {
    	 System.out.print((char)i);
     }
   FIS.close();
		}catch(Exception e) 
		{System.out.println(e);}
	}
	}
