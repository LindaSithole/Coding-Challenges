class Task7 {
    public static void main(String[] args) {
        celsiusConversion(5);
        fahrenheitConversion(8);
    }
    static double celsiusConversion(double temperature){
        temperature = ((temperature * 1.8) + 32);

        return temperature;
    }
    static double fahrenheitConversion(double temperature){

        temperature = ((temperature - 32)*5)/9;
        return temperature;
    }
}


