package second.hometask;

public class ConversionsCelsius {

    public static void main(String[] args) {
        ConversionsCelsius.convertCelsiusToFahrenheit(50);
        ConversionsCelsius.convertFahrenheitToCelsius(122);
        ConversionsCelsius.convertCelsiusToKalvin(5);
    }

    public static void convertCelsiusToFahrenheit(double celsius) {
        double fahrenheit = (9d / 5) * celsius + 32;
        System.out.println(celsius +" ºC = " + fahrenheit + " ºF");
    }

    public static void convertFahrenheitToCelsius(double fahrenheit) {
        double celsius = (5d / 9) * (fahrenheit - 32);
        System.out.println(fahrenheit +" ºF = " + celsius + " ºC");
    }

    public static void convertCelsiusToKalvin(double celsius) {
        double kalvin = 273.16 + celsius;
        System.out.println(celsius +" ºF = " + kalvin + " ºC");
    }

}
