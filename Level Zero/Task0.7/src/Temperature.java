class Task7 {
    public static void main(String[] args) {
        
            celsius(5);
            fahrenheit(8);
        }
        static void celsius(double  temperature){

            temperature = ((temperature-32)*5/9);
            System.out.println(" fahrenheit= " + temperature+"°F");
        }
    static void fahrenheit(double  temperature){

        temperature = ((temperature - 32)*5)/9;
        System.out.println(" Celsius = " + temperature+"°C");
    }
}

