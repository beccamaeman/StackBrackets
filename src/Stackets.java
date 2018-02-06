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

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Stackets{//begin class
    
    public static void main(String args[])throws IOException {//begin main
        
	//*****declaration of constants*****
	
	//*****declaration of variables*****
        
            String strin = "";
            
        //*****create objects*****
            
            PrintBanner();
        
            Stack stackets = new Stack();
            
            BufferedReader fin = new BufferedReader(new FileReader("input.txt"));
		
	//*****get input*****
        
            strin = fin.readLine();         //read first line from input buffer
            //System.out.println(strin);      //echo the input
            
        //*****processing*****
        
            while(strin != null){
                
                String[] brackets = strin.split("");
                stackets.push(brackets[0]);
                
                if(brackets[0].equals(")") || brackets[0].equals("}") || brackets[0].equals("]"))
                    System.out.println("Unbalanced`");
                else{
                    for(int b = 0; b < brackets.length; b++){
                    
                        if(brackets[b].equals(")")){
                            String check = "(";
                            if(stackets.peek().equals(check))
                                stackets.pop();
                            else
                                stackets.push("unb");
                        }//end if )
                        else if(brackets[b].equals("}")){
                            String check = "{";
                            if(stackets.peek().equals(check))
                                stackets.pop();
                            else
                                stackets.push("unb");
                        }//end else if }
                        else if(brackets[b].equals("]")){
                            String check = "[";
                            if(stackets.peek().equals(check))
                                stackets.pop();
                            else
                                stackets.push("unb");
                        }//end else if ]
                        else
                            stackets.push(brackets[b]);
                    }//end main nested for int b
                    
                    Boolean isEmpty = stackets.isEmpty();
                    
                    if(isEmpty == true)
                        System.out.println("Balanced");
                    else
                        System.out.println("Unbalanced");
                    
                }//end run program else
                
                strin = fin.readLine();
                //System.out.println(strin);    //echo the input
            }//end while strin != null
            
        //*****output*****
	
            fin.close();                    //close input buffer stream
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
    * print closing message to output window
    * IN: none
    * OUT: none
    ****************************************/
    public static void ClosingMessage(){
        String closMes = "end of processing";
        System.out.println("\n\n");
        System.out.println(closMes);
    }//end ClosingMessage method
    
}//end class