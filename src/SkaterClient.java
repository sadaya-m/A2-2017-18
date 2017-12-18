// **********************************************************************
//  Programmer:         Ma Pauline Sadaya
//  Class:		CS30S
//
//  Assignment:         A2-2017-18
//
//  Description:	skater client
//
//
//  Input:		describe any input from keyboard or file
//
    //  Output:		describe the result of your program
// ***********************************************************************

import javax.swing.*;
import java.text.DecimalFormat;
import java.io.*;

public class SkaterClient
{  // begin class
    public static void main(String args[]) throws IOException
    {  // begin main
    // ***** declaration of constants *****

    // ***** declaration of variables *****
        
        String strin;           //string
        
        String[] tokens = null;     //tokens for splitting
        String delim = "[ ]+";     //delimiter string for splitting
        
        SkaterClass[] timesList = new SkaterClass[10];
        
        int n = 0;  //counter
        
    // ***** create objects *****


    // ***** create input stream *****

        //ConsoleReader console = new ConsoleReader(System.in);

    // ***** Print Banner *****

        System.out.println("**********************************");
        System.out.println("NAME:        Ma. Pauline Sadaya");
        System.out.println("Class:       CS30S");
        System.out.println("Assignment:  A2-2017-18");
        System.out.println("**********************************");

    // ***** get input *****

        BufferedReader fin = new BufferedReader(new FileReader("skaterList.txt"));

    // ***** processing *****

        strin = fin.readLine();
        
        while(strin != null){
            //SkaterClass ID = new SkaterClass();
            //System.out.println(ID.toStringID());        //print student id
            
            timesList[n] = new SkaterClass();       //create an object 
            
            tokens = strin.split(delim);        //split strin to tokens
            
            for(int i = 0; i < tokens.length; i++){
                System.out.println(tokens[i]);              //print each token
                String[] time = tokens[i].split("[:]+");
                //System.out.println(time[1]);      //testing
                
                timesList[n].pullTime(i, Integer.parseInt(time[0]), Integer.parseInt(time[1]));
            }//end for loop
            
            n++; //increase counter by one
            //System.out.println(strin);
            strin = fin.readLine();
        }//end eof loop

    // ***** output *****
    
        for(int i = 0; i < n; i++){
            System.out.println(timesList[i].toString());
        } // end for loop
        

    // ***** closing message *****

        System.out.println("end of processing");

	}  // end main	
}  // end class