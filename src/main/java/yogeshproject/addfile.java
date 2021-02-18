package yogeshproject;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class addfile 
{
 public static void main(String args[]){
	try {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter dir path");
    	String dirpath=sc.nextLine();
    	System.out.println("enter filename");
    	String filename=sc.nextLine();
    	String fullpath=dirpath+ '/' + filename;
        File file = new File(fullpath);
        if(file.createNewFile())
        {
            System.out.println("File creation successfull");
System.out.println(fullpath);
        }
        else
            System.out.println("Error while creating File, file already exists in specified path");
    }
    catch(IOException io) 
	{
        io.printStackTrace();
    }

}
}
