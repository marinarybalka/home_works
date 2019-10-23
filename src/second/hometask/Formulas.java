package second.hometask;

public class Formulas {

    public static void main(String[] args) {

        double x = 20.1;
        double resultY = Math.pow(1.1, -x) + Math.abs(Math.cos(Math.sqrt(Math.PI * x))) - (3.0/ 8.0);
        System.out.println(resultY);

        double x1 = 21;
        double result = (1.0 /3.0) * Math.sqrt(Math.abs(Math.sin(x1)) * Math.pow(0.12, x1));
        System.out.println(result);

        double x2 = 12;
        double result1 = (Math.PI * x2) - Math.abs(Math.sin(Math.sqrt(10.5 * x2))) * (1.0 /Math.pow(x2, 2) + (1.0 / 7.0));
        System.out.println(result1);

        double x4 = 8;
        double result3 = Math.pow(5, Math.pow(-2, + x4)) * (1.0 / Math.sqrt(Math.pow(x4, 2) + Math.pow(x4, 4) + Math.log (x4 - 3.14)));
        System.out.println(result3);

        double x3 = 12;
        double result2 = Math.log((Math.sqrt(Math.abs(2 - x3) + 1.2) * (1.0 / (2.0 + Math.pow(1, -x3)) + Math.pow(3, (2.0 / x3)))));
        System.out.println(result2);

    }

}
