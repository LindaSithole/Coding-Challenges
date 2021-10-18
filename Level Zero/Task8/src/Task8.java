class Task8 {

    public static void TimeConversion(int fullSeconds) {
        int hours = fullSeconds % 3600 / 60;
            if (hours >= 2 || hours == 0) {
                System.out.print(hours + "Hours,");
            }else {
                System.out.print(hours + "Hour,");
            }
        int  minutes = fullSeconds % 3600 % 60;
            if (minutes >= 2 || minutes == 0) {
                System.out.print(minutes + "minutes");
            }else {
                System.out.print(hours + "minute");
            }
            }
    public static void main (String[] args){

        TimeConversion(0);
    }
}

