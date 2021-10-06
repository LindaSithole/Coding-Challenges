public class Task8 {

public static void Conversion(int fullSeconds) {
    
    int hours = fullSeconds % 3600 / 60;
    int  minutes = fullSeconds % 3600 % 60;
    
    System.out.println(hours + "Hour(s)" + minutes + "minute(s)" );
}
    public static void main (String[] args){

        Conversion(117);
    }
}
