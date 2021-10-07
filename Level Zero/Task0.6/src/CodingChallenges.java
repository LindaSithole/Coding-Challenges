public class Task6 {
    
    public static void main(String[] args){
        
       numbers(2,3,4) ;
    }
    static void numbers (int num1, int num2, int num3 ){
 
        if (num1 >= num2 && num1 >= num3)
            System.out.println( num1 );
        else if (num2 >= num1 && num2 >= num3)
            System.out.println( num2 );
        else
            System.out.println( num3 );
    }
}
