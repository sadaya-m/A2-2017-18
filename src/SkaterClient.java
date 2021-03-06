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
        String input;           //input
        
        String[] tokens = null;     //tokens for splitting
        String[] split = null;     //tokens for splitting
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

        BufferedReader fin = new BufferedReader(new FileReader("skaterData.txt"));

    // ***** processing *****

        strin = fin.readLine();
        
        while(strin != null){
            //SkaterClass ID = new SkaterClass();
            //System.out.println(ID.toStringID());        //print student id
            
            timesList[n] = new SkaterClass();       //create an object 
            
            tokens = strin.split(delim);        //split strin to tokens
            
            input = JOptionPane.showInputDialog("Add a time (in mm:ss)");
            
            if(tokens.length == 10){
                for(int i=0;i<tokens.length-1;i++){ 
                    tokens[i] = tokens[i+1];        //overwrite tokens[0] and all times go down by one index
                }
                tokens[tokens.length-1] = input;        //declare new time
            }//end if tokens length == 10
            
            System.out.println("\nTime\tSpeed");
            for(int i = 0; i < tokens.length; i++){
                //System.out.println(tokens[i]);              //print each token
                
                String[] time = tokens[i].split("[:]+");
                //String[] time2 = split[i].split("[:]+");
                
                //System.out.println(time[1]);      //testing;
                                
                timesList[n].pullTime(i, Integer.parseInt(time[0]), Integer.parseInt(time[1]));
                //timesList[n].pullTime(i, Integer.parseInt(time2[0]), Integer.parseInt(time2[1]));
                
                System.out.println(tokens[i] + "\t"+ timesList[n].getSpeed(i));//getting the time and speed of individual race
            }//end for loop
            
            int sum = 0;
            for(int i = 0; i < 10; i++){
                int x = (int) timesList[n].getAverage(i);
                sum = sum + x;
            }//end for loop for getting the average
            //System.out.println(sum);
            int average = sum/tokens.length;        //get the average
            
            timesList[n].pullAverage(n, average);
            
            n++; //increase counter by one
            //System.out.println(strin);
            strin = fin.readLine();
        }//end eof loop
        
    // ***** output *****
    
        for(int i = 0; i < n; i++){
            System.out.println("\n" + timesList[i].toString(i));
        } // end for loop
        
        
    // ***** closing message *****

        System.out.println("end of processing");

	}  // end main	
}  // end class