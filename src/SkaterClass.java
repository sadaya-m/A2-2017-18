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
       private final int max = 10;                    //max number of time


    // ********** instance variable **********
       
       private int id;          //id number
       private TimesSpeedClass[] times = new TimesSpeedClass[max];  //max number of times

    // ********** constructors ***************
       
       /************************************
        * Purpose: default constructor
        * Interface:
        *   in: none
        *   out: none
        ************************************/
       public SkaterClass(){
           id = nextID++;
           
           for(int i = 0; i < max; i++){
               times[i] = new TimesSpeedClass();
           }//end for loop
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
        * Purpose: return a string of the skater's times
        * Interface:
        *   in: none
        *   out: return string of times (in mm:ss)
        ************************************/
       public String getTimes(int index){
           return this.times[index].toString();
       }//end getTimes
       
       /************************************
        * Purpose: return a string of the skater's id and times
        * Interface:
        *   in: none
        *   out: string of skater's id and times
        ************************************/
       public String toString(){
           String string = "Student: " + this.getID() + "\n";
           
           for(int i = 0; i < 10; i++){
               string += this.getTimes(i) + " ";
           }//end for loop
           
           return string;
       }//end toString
       
    // ********** mutators *******************
       
       /************************************
        * Purpose: sets values of minutes and seconds
        * Interface:
        *   in: index, minutes, seconds
        *   out: none
        ************************************/
       public void pullTime(int i, int mm, int ss){
           this.times[i].setTime(mm,ss);
       }
 
 }  // end class