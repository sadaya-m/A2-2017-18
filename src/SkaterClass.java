/* **********************************************************
 * Programmer:	Ma Pauline Sadaya
 * Class:	CS30S
 * 
 * Assignment:	A2-2017-18
 *
 * Description:	skater class    get id
 * *************************************************************/
 
 // import files here as needed
 
 
 public class SkaterClass
 {  // begin class
 	
    // *********** class constants ***********
     
       private static int nextID = 1000;        //id


    // ********** instance variable **********
       
       private int id;          //id number

    // ********** constructors ***************
       
       /************************************
        * Purpose: default constructor
        * Interface:
        *   in: none
        *   out: none
        ************************************/
       public SkaterClass(){
           id = nextID++;
       }//end skaterclass
     
    // ********** accessors ******************
       
       /************************************
        * Purpose: return the id number
        * Interface:
        *   in: none
        *   out: id
        ************************************/
       public int getID(){
           return id;
       }//end getID
       
       /************************************
        * Purpose: return the id to a string
        * Interface:
        *   in: none
        *   out: string
        ************************************/
       public String toStringID(){
           String string = "Student number " + this.getID();
           
           return string;
       }//end toStringID

    // ********** mutators *******************
 
 }  // end class