package yogeshproject;

import java.io.File;
import java.util.Scanner;

public class temp
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter dir path");
    	String dirpath=sc.nextLine();
    	System.out.println("enter filename");
    	String filename=sc.nextLine();
    	String fullpath=dirpath+ '/' + filename;
        File file = new File(fullpath);
		
        File f = new File(fullpath); 
		  
        // Check if the specified file 
        // Exists or not 
        if (f.exists()) 
        System.out.println("Exists"); 
          
        else
            System.out.println("Does not Exists"); 
	}

}
