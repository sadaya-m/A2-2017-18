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


    // ********** instance variable **********
     
        private int minutes = 0;        //minutes
        private int seconds = 0;        //seconds
     
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
 
 }  // end class