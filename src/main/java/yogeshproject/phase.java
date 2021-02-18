package yogeshproject;
import java.io.File;
import java.io.IOException;
import java.util.*;




public class phase {
	
	
	String dirpath;
		public void filelist()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter dir path");
	    	 dirpath=sc.nextLine();
	 
	      File file = new File(dirpath);

	     
	      String[] fileList = file.list();
	      		if (fileList.length==0)
	      				{
	      			System.out.println("no files");
	      				}
	      		else
	      		{
	      			 for(String str : fileList) 
	      		      {
	      		        System.out.println(str);
	      		      }	
	      		}
	     
		}
		
		public void addfile()
		{
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
		
		public void deletefile()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter dir path");
	    	String dirpath=sc.nextLine();
	    	System.out.println("enter filename");
	    	String filename=sc.nextLine();
	    	String fullpath=dirpath+ '/' + filename;
	        File file = new File(fullpath);
			
	        File f = new File(fullpath); 
			  
	     
	        if (f.exists()) 
	        {
	            System.out.println("Exists"); 
	            if(f.delete()) 
	            { 
	                System.out.println("File deleted successfully"); 
	            } 
	            else
	            { 
	                System.out.println("Failed to delete the file"); 
	            } 
	        }
	        else
	            System.out.println("Does not Exists"); 
		}
		
		public void searchfile()
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
	  		
		    public static void main(String[] args)
		    {
		    phase ph=new phase();
		    Scanner sc2=new Scanner(System.in);	
		    while(true)
		    {
		    	System.out.println("menu  \n 1.all files \n 2.add file \n 3.delete file \n 4.search \n 5.exit");
		    	System.out.println("enter choice");
		    	int ch=sc2.nextInt();
		    	switch(ch)
		    	{
		    	case 1:
		    		ph.filelist();
		    		break;
		    		
		    	case 2:
		    		ph.addfile();
		    		break;
		    		
		    	case 3:
		    		ph.deletefile();
		    		break;
		    		
		    	case 4:
		    		ph.searchfile();
		    		break;
		    		
		    	case 5:
		    			System.exit(0);
		    		
		    	}
		    	
		    }
		    	
		    	
		    }
		  
}
		  	
	 
	 


