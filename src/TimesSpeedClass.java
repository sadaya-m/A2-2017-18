
import java.io.PrintStream;

/* **********************************************************
 * Programmer:	Ma Pauline Sadaya
 * Class:	CS30S
 * 
 * Assignment:	times speed class
 *
 * Description:	class to achieve calculations needed
 * *************************************************************/
 
 // import files here as needed
 
 
 public class TimesSpeedClass
 {  // begin class
 	
    // *********** class constants ***********

        private final int min = 60;     //constant of seconds in minutes
        private final double km = 5;       //total distance
     

    // ********** instance variable **********
     
        private int minutes = 0;        //minutes
        private int seconds = 0;        //seconds
        private double average = 0;        //average in seconds
        private int hours = 0;          //hours
     
    // ********** constructors ***************
        
        /************************************
        * Purpose: default constructor
        * Interface:
        *   in: none
        *   out: none
        ************************************/
        public TimesSpeedClass(){
            seconds = 0;
        }//end default constructor

    // ********** accessors ******************
        
        /************************************
        * Purpose: return the number of minutes
        * Interface:
        *   in: none 
        *   out: minutes
        ************************************/
        private int getMinutes(){
            return minutes;
        }//end getMinutes

        /************************************
        * Purpose: return the number of seconds
        * Interface:
        *   in: none
        *   out: seconds
        ************************************/
        private int getSeconds(){
            return seconds;
        }//end getSeconds
        
        /************************************
        * Purpose: get the average
        * Interface:
        *   in: none
        *   out: average
        ************************************/
        public double getAverage(){
            int average;
            average = (getMinutes()*min) + getSeconds();
            
            return average;
        }//end getAverage
        
        /************************************
        * Purpose: return a string of skater's times in minutes and seconds
        * Interface:
        *   in: none
        *   out: string
        ************************************/
        public String toString(){
            String string;
            string = String.format("%02d:%02d", this.getMinutes(), this.getSeconds());
            
            return string;
        }//end toString
        
        
        /************************************
        * Purpose: return the new average in seconds
        * Interface:
        *   in: none
        *   out: int average
        ************************************/
        public double getTotalAverage(){
            return average;
        }
        
        /************************************
        * Purpose: convert seconds to minutes
        * Interface:
        *   in: none 
        *   out: minutes
        ************************************/
        private int getAvgMinutes(){
            int minutes = (int) (getTotalAverage()/min);
            return minutes;
        }//end getAvgMinutes
        
        /************************************
        * Purpose: convert seconds
        * Interface:
        *   in: none 
        *   out: seconds
        ************************************/
        private int getAvgSeconds(){
            int seconds = (int) (getTotalAverage() % min);
            return seconds;
        }//end getAvgSeconds
        
        /************************************
        * Purpose: return the skater's average time in minutes and seconds
        * Interface:
        *   in: none
        *   out: string
        ************************************/
        public String toStringAvg(){
            String string;
            string = String.format("%02d:%02d", this.getAvgMinutes(), this.getAvgSeconds());
            
            return string;
        }//end toStringAvg
        
        
        /************************************
        * Purpose: convert total average of skater object's times from s to h
        * Interface:
        *   in: none
        *   out: int hours
        ************************************/
        private double getAvgHours(){
            double hours = this.getTotalAverage()/3600;
            
            return hours;
        }//end toStringAvg
        
        /************************************
        * Purpose: get speed
        * Interface:
        *   in: none 
        *   out: int speed
        ************************************/
        private double getAvgSpeed(){
            double speed = this.getAvgHours()/km;
            return speed;
        }//end getAvgSpeed
            
        /************************************
        * Purpose: return the skater's average speed
        * Interface:
        *   in: none
        *   out: string
        ************************************/
        public String toStringAvgSpeed(){
            String string;
            string = String.format("%.3f", this.getAvgSpeed());
            
            return string;
        }//end toStringAvg
        
        /************************************
        * Purpose: convert seconds of each time in a skater object to hours
        * Interface:
        *   in: none 
        *   out: hours
        ************************************/
        private double getHours(){
            double hour = this.getAverage()/3600;
            return hour;
        }//end getHours
        
        /************************************
        * Purpose: convert seconds of each time in a skater object to hours
        * Interface:
        *   in: none 
        *   out: hours
        ************************************/
        public double getSpeed(){
            double hour = this.getHours()/km;
            return hour;
        }//end getHours
        
        /************************************
        * Purpose: return the skater's speed for each individual time
        * Interface:
        *   in: none
        *   out: string
        ************************************/
        public String toStringSpeed(){
            String string;
            string = String.format("%.3f", this.getSpeed());
            
            return string;
        }//end toStringSpeed
        
    // ********** mutators *******************
        
        /************************************
        * Purpose: set time in minutes and seconds
        * Interface:
        *   in: minutes, seconds
        *   out: none
        ************************************/
        public void setTime(int mm, int ss){
            this.minutes = mm;
            this.seconds = ss;
        }//end setTime
        
        /************************************
        * Purpose: set minutes
        * Interface:
        *   in: minutes
        *   out: none
        ************************************/
        public void setMinutes(int mm){
            this.minutes = mm;
        }//end setMinutes
        
        /************************************
        * Purpose: set seconds
        * Interface:
        *   in: seconds
        *   out: none
        ************************************/
        public void setSeconds(int ss){
            this.seconds = ss;
        }//end setSeconds
        
        /************************************
        * Purpose: set time in minutes and seconds
        * Interface:
        *   in: minutes, seconds
        *   out: none
        ************************************/
        public void setAverage(int avg){
            this.average = avg;
        }//end setTime
 
 }  // end class