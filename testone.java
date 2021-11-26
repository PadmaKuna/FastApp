import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class testone {

	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to FastApp");
		System.out.println("......#Developed By Padma Kuna");
		String Path = null;
		try {
			Path = new java.io.File(".").getCanonicalPath();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		//System.out.println("Current Directory: "+Path);
		File file=new File(Path);
		File array[]=file.listFiles();
		
		for(int i=0;i<array.length;i++){
			if(array[i].getName().contains("Main"))
				break;
			else {
				Path=Path+"\\Main";
				file=new File(Path);
				file.mkdir();
				break;
			}
		}
		int FirstInput,SecondInput=0;
		do{		
		System.out.println("Enter 1 to retrive All files in Main folder");
		System.out.println("Enter 2 to perform other actions in Main folder");
		System.out.println("Enter 3 to close the Application");
		Scanner scan=new Scanner(System.in);
		FirstInput=scan.nextInt();
		switch(FirstInput) {
		case 1: 
			File array1[]=file.listFiles();
			for(int i=0;i<array1.length;i++)
				System.out.println(array[i]);
			break;
		case 2: 			
			do {
				System.out.flush(); 
				System.out.println("Enter 1 to create a new file in Main folder");
				System.out.println("Enter 2 to delete a file in Main folder");
				System.out.println("Enter 3 to list all the files starting with the provided name");
				System.out.println("Enter 4 to return to previous menu");
				System.out.println("Enter 5 to Exit the program");
				Scanner scan2=new Scanner(System.in);
				SecondInput=scan2.nextInt();
				Scanner scan3=new Scanner(System.in);
			switch(SecondInput) {
			case 1: 
				System.out.println("Enter the file name to be created in the Main folder");
				String filename=scan3.nextLine();
				Path=Path+"\\"+filename;
				file=new File(Path);
				try{
					file.createNewFile();
					System.out.println("File created succesfully");
				}
				catch(IOException e) {
					System.out.println("Sorry we will get back to you");	
				}
				break;
			case 2:
				System.out.println("Enter the file name to be deleted in the Main folder");
				filename=scan3.nextLine();
				Path=Path+"\\"+filename;
				if(file.exists()) {
					file.delete();
				}
				else
					System.out.println("File with the given name does not exists");				
				break;
			case 3: 
				System.out.println("Enter the filename to show the respective files starting with given name");
				String name=scan3.nextLine();
				File array2[]=file.listFiles();
				for(int i=0;i<array2.length;i++){
				if(array[i].getName().startsWith(name))
				System.out.println(array[i]);}
				break;
			case 4: 
				break;
			case 5: 
				System.out.println("Program terminated successfully in the second loop");
				System.exit(3);
				break;
				default:
					System.out.println("Input the correct value and retry");
					SecondInput=4;
					break;
					}}while(SecondInput==4);
			break;
				
		case 3: 
			System.out.println("Program terminated successfully in the first loop");
			System.exit(3);
			break;
		default:
			System.out.println("Input the correct value and retry");
			FirstInput=4;
			break;
		}
		}while(FirstInput==4);
		

	}

}
