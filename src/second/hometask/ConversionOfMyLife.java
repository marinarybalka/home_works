package second.hometask;

import java.util.*;
import java.text.*;

public class ConversionOfMyLife {


    public static void main(String[] args) {
        ConversionOfMyLife.calculateYears();
        ConversionOfMyLife.calculateMinutes();
    }

    public static void calculateYears() {
        GregorianCalendar birthDay = new GregorianCalendar(1989,GregorianCalendar.SEPTEMBER,16);
        GregorianCalendar checkDay = new GregorianCalendar(2019,GregorianCalendar.OCTOBER,23);


        int years = checkDay.get(GregorianCalendar.YEAR) - birthDay.get(GregorianCalendar.YEAR);

        // корректируем, если текущий месяц в дате проверки меньше месяца даты рождения
        int checkMonth = checkDay.get(GregorianCalendar.MONTH);
        int birthMonth = birthDay.get(GregorianCalendar.MONTH);
        if ( checkMonth < birthMonth ) {
            years --;
        } else  if (checkMonth == birthMonth
                && checkDay.get(GregorianCalendar.DAY_OF_MONTH) < birthDay.get(GregorianCalendar.DAY_OF_MONTH)) {
            // отдельный случай - в случае равенства месяцев, но меньшего дня месяца в дате проверки - корректируем
            years --;
        }
        System.out.println(years + " - years from 16.09.1989 to 23.10.2019");

        int moths = years * 12;

        System.out.println(moths + " - months");

    }
    public static void calculateMinutes() {

        String date1 = "23.10.2019";
        String date2 = "16.09.1989";

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        Date dateOne = null;
        Date dateTwo = null;

        try {
            dateOne = format.parse(date1);
            dateTwo = format.parse(date2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Number of days between dates in milliseconds
        long difference = dateOne.getTime() - dateTwo.getTime();

        int days =  (int)(difference / (24 * 60 * 60 * 1000));

        System.out.println(days + " - days");

        int seconds = days * 24 * 60 * 60;

        System.out.println(seconds + " - seconds");

        int minutes = days * 24 * 60;

        System.out.println(minutes + " - minutes");

        int hours = days * 24;

        System.out.println(hours + " - hours");

        int weeks =  days / 7;

        System.out.println(weeks + " - weeks");
    }
}



