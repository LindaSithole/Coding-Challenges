class Task8 {

    public static void timeConversion(int fullSeconds) {
        int hours = 0;
        int minutes = 0;
        minutes = (minutes + fullSeconds) % 60;
        hours = hours + (minutes + fullSeconds)/ 60;
        if (hours > 1 || hours == 0) {
            System.out.print(hours + " hours, ");
        } else {
            System.out.print(hours + " hour, ");
        }

        if (minutes <= 1 ) {
            System.out.println(minutes + " minute");
        } else {
            if (minutes > 1 ) {
                System.out.println(minutes + " minutes");
            }
        }
    }

    public static void main(String[] args) {

        timeConversion(71);
    }
}

