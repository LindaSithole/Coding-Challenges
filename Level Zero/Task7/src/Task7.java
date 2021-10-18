class Task7 {
    public static void main(String[] args) {
        CelsiusConversion(5);
        FahrenheitConversion(8);
    }
    static double CelsiusConversion(double temperature){
        temperature = ((temperature * 1.8) + 32);
        System.out.println(" fahrenheit= " + temperature+"°F");
        return temperature;
    }
    static double FahrenheitConversion(double temperature){

        temperature = ((temperature - 32)*5)/9;
        System.out.println(" Celsius = " + temperature+"°C");
        return temperature;
    }
}


