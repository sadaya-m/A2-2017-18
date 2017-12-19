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
     

    // ********** instance variable **********
     
        private int minutes = 0;        //minutes
        private int seconds = 0;        //seconds
        private int average = 0;        //average in seconds
     
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
        public int getMinutes(){
            return minutes;
        }//end getMinutes

        /************************************
        * Purpose: return the number of seconds
        * Interface:
        *   in: none
        *   out: seconds
        ************************************/
        public int getSeconds(){
            return seconds;
        }//end getSeconds
        
        /************************************
        * Purpose: get the average
        * Interface:
        *   in: none
        *   out: average
        ************************************/
        public int getAverage(){
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
        public int getTotalAverage(){
            return average;
        }
        
        /************************************
        * Purpose: convert seconds to minutes
        * Interface:
        *   in: none 
        *   out: minutes
        ************************************/
        public int getAvgMinutes(){
            int minutes = getTotalAverage()/60;
            return minutes;
        }//end getAvgMinutes
        
        /************************************
        * Purpose: convert seconds
        * Interface:
        *   in: none 
        *   out: seconds
        ************************************/
        public int getAvgSeconds(){
            int seconds = (getTotalAverage() % 60);
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