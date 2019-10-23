package second.hometask;

public class ResultsPercents {

    public static void main(String[] args) {
        ResultsPercents.calculateResult();
        ResultsPercents.calculateMultiple();

    }
        public static void calculateResult() {
        int total_test = 10;
        int marked_test = 8;

        int result = (100 * marked_test) / total_test;

        System.out.println(result + "% - Result");
    }

    public static void calculateMultiple() {
        int total_cases = 10;
        int passed_cases = 3;
        int failed_cases = 7;

        int passed = (100 * passed_cases) / total_cases;
        System.out.println(passed + "% - Passed tests");

        int failed = (100 * failed_cases) / total_cases;
        System.out.println(failed + "% - Failed tests");

    }
}

