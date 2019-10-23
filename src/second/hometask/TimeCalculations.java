package second.hometask;

public class TimeCalculations {

    public static void main(String[] args) {
        TimeCalculations.convertSecondsToMinutes(120);
        TimeCalculations.convertMinutesToSeconds(20);
        TimeCalculations.convertSecondsToHours(10800);
        TimeCalculations.convertHoursToSeconds(3.5);
        TimeCalculations.convertSecondsToDays(2592000);
        TimeCalculations.converDaysToSeconds(18);
    }

    public static void convertSecondsToMinutes(double seconds) {
        double minutes = seconds / 60;
        System.out.println(seconds +" seconds = " + minutes + " minutes");
    }

    public static void convertMinutesToSeconds(double minutes) {
        double seconds = minutes * 60;
        System.out.println(minutes +" minutes = " + seconds + " seconds");
    }

    public static void convertSecondsToHours(double seconds) {
        double hours = seconds / 3600;
        System.out.println(seconds +" seconds = " + hours + " hours");
    }

    public static void convertHoursToSeconds(double hours) {
        double seconds = hours * 3600;
        System.out.println(hours +" hours = " + seconds + " seconds");
    }

    public static void convertSecondsToDays(double seconds) {
        double days = seconds / 86400;
        System.out.println(seconds +" seconds = " + days + " days");
    }

    public static void converDaysToSeconds(double days) {
        double seconds = days * 86400;
        System.out.println(days +" days = " + seconds + " seconds");
    }
}










