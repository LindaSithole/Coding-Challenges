
package Time;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Time {
    public static void main (String[] args){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter"  );
        
        int sec = sc .nextInt();
        int mins = sec % 3600 / 60;
        int hr = sec / 3600;
        int s2 = sec %3600%60;
      
      
     System.out.println(hr + "Hour(s)" + mins +"minute(s)"+s2+"Second(s)"); 
       
   }
    
        
    }
        
        
    
            
      
                

 

    
    
     
              
           
      
        
  

    



