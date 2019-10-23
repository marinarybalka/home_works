package second.hometask;

public class ConvertValues {

    public static void main(String[] args) {
        ConvertValues.convertMetrsToInches(50);
        ConvertValues.convertInchesToMetrs(10);
        ConvertValues.convertMilesToKilometres(4);
        ConvertValues.convertKilometresToMiles(9);
        ConvertValues.convertKilogramsToPounds(2);
        ConvertValues.convertPoundsToKilograms(4);
        ConvertValues.convertKilometres_per_hourToMiles_per_hour(4);
        ConvertValues.convertMiles_per_hourToKilometres_per_hour(7);
    }

    public static void convertMetrsToInches(double metrs) {
        double inches = metrs * 39.37;
        System.out.println(metrs +" metrs = " + inches + " inches");
    }

    public static void convertInchesToMetrs(double inches) {
        double metrs = inches / 39.37;
        System.out.println(inches +" inches = " + metrs + " metrs");
    }

    public static void convertMilesToKilometres(double kilometres) {
        double miles = kilometres / 1.609;
        System.out.println(miles +" miles = " + kilometres + " kilometres");
    }

    public static void convertKilometresToMiles(double miles) {
        double kilometres = miles * 1.609;
        System.out.println(kilometres +" kilometres = " + miles + " miles");
    }

    public static void convertKilogramsToPounds(double kilograms) {
        double pounds = kilograms / 2.2046;
        System.out.println(pounds +" pounds = " + kilograms + " kilograms");
    }

    public static void convertPoundsToKilograms(double pounds) {
        double kilograms = pounds * 2.2046;
        System.out.println(kilograms +" kilograms = " + pounds + " pounds");
    }

    public static void convertKilometres_per_hourToMiles_per_hour(double miles_per_hour) {
        double kilometres_per_hour = miles_per_hour * 0.6214;
        System.out.println(kilometres_per_hour +" kilometres_per_hour = " + miles_per_hour + " miles_per_hour");
    }

    public static void convertMiles_per_hourToKilometres_per_hour(double kilometres_per_hour) {
        double miles_per_hour = kilometres_per_hour / 0.6214;
        System.out.println(miles_per_hour +" miles_per_hour = " + kilometres_per_hour + " kilometers_per_hour");
    }

}
