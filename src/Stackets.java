/**********************************************************************
* Programmer:   Becca Man
* Class:	CS40S
*
* Assignment:	
*
* Description:	a brief description of the program goes here
*
* Input:	describe any input from keyboard or file
*
* Output:	describe the result of your program
***********************************************************************/

public class Stackets{//begin class
    
    public static void main(String args[]){//begin main
        
	//*****declaration of constants*****
	
	//*****declaration of variables*****
        
            String bal = "({[]})";
            String unb = "{[)}";

	//*****create objects*****
		
	//*****create input stream*****
	
        //*****get input*****
	
	//*****processing*****

            PrintBanner();
	
	//*****output*****
	
            ClosingMessage();

	}//end main
    
    /****************************************
    * print banner to output window
    * IN: none
    * OUT: none
    ****************************************/
    public static void PrintBanner(){
        String bannerOut = "";       //string to print banner to message dialog
        bannerOut += "******************************* \n";
        bannerOut += "Name: R. Man \n";
        bannerOut += "Class: CS40S \n";
        bannerOut += "Assignment: a3 q2 \n";
        bannerOut += "******************************* \n";
        System.out.println(bannerOut);
    }//end PrintBanner method
    
    /****************************************
    * print closing message to outout window
    * IN: none
    * OUT: none
    ****************************************/
    public static void ClosingMessage(){
        String closMes = "end of processing";
        System.out.println("\n\n");
        System.out.println(closMes);
    }//end ClosingMessage method
    
}//end class