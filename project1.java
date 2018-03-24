
		import java.util.Scanner;
		import java.io.*;		  
		  
public class RegularExpressions {


		  public static void main(String[] args) throws IOException { 
		    try {
		    //Scanner keyboard = new Scanner (System.in); //Allows user to input values
		    
		    //System.out.println("Enter the file name"); //Asks user to enter the file name
			  String input = args[0];
			  String file = args[1];       //Stores the file in String
		    //File textFile = new File(file);     //Stores the file into File value
			  Scanner myText = new Scanner(new FileReader(file));

//		    if(!textFile.exists()){             //If statement, ends the program if user enters invalid file name
//		      System.out.println("File does not exit. Please try again.");
//		      System.exit(0);
//		    }
		    
		      //Allows program to read file

		    //System.out.println("Please enter a Regular Expression."); //Asks user to enter number
		    
		  	char[] regex = input.toCharArray();
		  	int inputLength = input.length();
		  	
		    int lineCount = 0;
		    while(myText.hasNext()){    //While file has more Text, it will print
		    lineCount++;
		    String fileLine = myText.nextLine();
	    	char[] array = fileLine.toCharArray();
	    	
		    	for (int ch = 0; ch <= fileLine.length(); ch++)
		    	{
		    			boolean check = true;
		    			int lineInd = ch;
		    			
				    	String total = "";
		    			int posInd = 0;
		    			
		while(lineInd < fileLine.length() && posInd < inputLength)
			{
			if(array[lineInd] != regex[posInd]) 		//break if characters match at position
	    	{
	    	check = false;
	    	break; 
	        }
		    	    		
		 if (array[lineInd] == regex[posInd]) //if next position isnt equal to next pos in input, increase pos
			{
			char	 word = array[lineInd];
			 total = total + word;
			}
			lineInd++;
			posInd++;   
					    		
//			//if (regex[posInd+1] == '*' && lineInd < fileLine.length() && posInd < inputLength)    //PLUS
//		     if (regex[posInd+1] == '*' && posInd < inputLength)    //PLUS
//			{
//			while(array[lineInd] == regex[posInd] && lineInd < fileLine.length())
//			{
//			char mult = array[lineInd];
//			total = total + mult;
//		 	lineInd++;
//			}
//			}			    			    		

} //While loop Bracket   	
		    	
			if(check) 
		    {
			if(total == "")
			{
			break;
			}
		    System.out.println("Match found on Line " + lineCount + ", position " + (lineInd) + " " + total + " ");	
			break;
			}
	 	}
		 }	    
		myText.close();
	    System.out.println(); 			//Space 
}catch(FileNotFoundException e) {
		System.out.println("File not found");
     } 
  }		  
}
//if (regex[posInd+1] == '*')    //PLUS
//{
//		while(array[lineInd] == regex[posInd])
//		{
//		char mult = array[lineInd];
//		total = total + mult;
//		lineInd++;
//}
//}
