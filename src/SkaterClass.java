/* **********************************************************
 * Programmer:	Ma Pauline Sadaya
 * Class:	CS30S
 * 
 * Assignment:	A2-2017-18
 *
 * Description:	skater class
 * *************************************************************/
 
 // import files here as needed
// just testing to see if I can add and delete from this source code file RS
 
 
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
       private int getID(){
           return id;
       }//end getID
       
       /************************************
        * Purpose: return a string of the skater's times
        * Interface:
        *   in: none
        *   out: return string of times (in mm:ss)
        ************************************/
       private String getTimes(int index){
           return this.times[index].toString();
       }//end getTimes
       
       /************************************
        * Purpose: return the average (in seconds) of a skater's times
        * Interface:
        *   in: none
        *   out: average
        ************************************/
       public double getAverage(int index){
            return this.times[index].getAverage();
       }//end getAverage
       
       /************************************
        * Purpose: return the average of all of the skater's times
        * Interface:
        *   in: none
        *   out: average
        ************************************/
       private double getTotalAverage(int index){
            return this.times[index].getTotalAverage();
       }//end getAverage

       /************************************
        * Purpose: return the new average (in seconds) of the skater's times
        * Interface:
        *   in: none
        *   out: string average
        ************************************/
       private String getNewAverage(int index){
           return this.times[index].toStringAvg();
       }//end getNewAverage
       
       /************************************
        * Purpose: return the average speed of a skater object's times
        * Interface:
        *   in: none
        *   out: int average
        ************************************/
       private String getAverageSpeed(int index){
           return this.times[index].toStringAvgSpeed();
       }//end getAverageSpeed
       
        /************************************
        * Purpose: return the average speed of a skater object's times
        * Interface:
        *   in: none
        *   out: int average
        ************************************/
       public String getSpeed(int index){
           return this.times[index].toStringSpeed();
       }//end getAverageSpeed
       
       
       /************************************
        * Purpose: return a string of the skater's id, times, average time, average speed
        * Interface:
        *   in: none
        *   out: string of skater's id, times, average time, average speed
        ************************************/
       public String toString(int index){
           String string = "SkaterID: " + this.getID() + "\n";
           
           for(int i = 0; i < 10; i++){
               string += this.getTimes(i) + " ";
           }//end for loop
           
           //string += "\n" + this.getTotalAverage(index);
           
           string += "\nAverageTime: " + this.getNewAverage(index);
           
           string += "\nAverageSpeed: " + this.getAverageSpeed(index) + "km/h";
           
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
       
       /************************************
        * Purpose: sets values of average seconds
        * Interface:
        *   in: seconds
        *   out: none
        ************************************/
       public void pullAverage(int i, int avg){
           this.times[i].setAverage(avg);
       }
 
 }  // end class
