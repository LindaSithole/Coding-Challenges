class Task8 {

    public static void timeConversion(int fullSeconds) {
        int hours = fullSeconds % 3600 / 60;
        if (hours >= 2 || hours == 0) {
            System.out.print(hours + " hours, ");
        } else {
            System.out.print(hours + " hour, ");
        }
        int minutes = fullSeconds % 3600 % 60;
        if (minutes == 1 ) {
            System.out.println(minutes + " minute");
        } else {
            System.out.println(hours + " minutes");
        }
    }

    public static void main(String[] args) {

        timeConversion(21);
    }
}

