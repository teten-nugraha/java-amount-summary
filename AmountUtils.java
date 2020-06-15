public class AmountUtils {

    private static String KILO = "K";
    private static String MILLION = "M";
    private static String BILLION = "B";

    private static Long K_LIMIT_BOTTOM = 1000L;
    private static Long K_LIMIT_TOP = 999999L;

    private static Long M_LIMIT_BOTTOM = 1000000L;
    private static Long M_LIMIT_TOP = 999999999L;

    private static Long B_LIMIT_BOTTOM = 1000000000L;
    private static Long B_LIMIT_TOP = 999999999999L;


    public static String summary(String input) {
        String result = "";

        final Long realInput = Long.valueOf(input);

        if((K_LIMIT_BOTTOM >= realInput) || (realInput <= K_LIMIT_TOP)) {
            result = thousandSummary(input);
        }else if((M_LIMIT_BOTTOM >= realInput) || (realInput <= M_LIMIT_TOP)) {
            result = millionSummary(input);
        }else if((B_LIMIT_BOTTOM >= realInput) || (realInput <= B_LIMIT_TOP)) {
            result = billionSummary(input);
        }

        return result;
    }

    private static String billionSummary(String input) {
        String result = "";
        int count = input.length();
        if(count == 10) {
            result = input.substring(0,1);
        }else if(count == 11) {
            result = input.substring(0,2);
        }else{
            result = input.substring(0,3);
        }
        return result + BILLION;
    }

    private static String thousandSummary(String input) {
        String result = "";
        int count = input.length();
        if(count == 4) {
            result = input.substring(0,1);
        }else if(count == 5) {
            result = input.substring(0,2);
        }else{
            result = input.substring(0,3);
        }
        return result + KILO;
    }

    private static String millionSummary(String input) {
        String result = "";
        int count = input.length();
        if(count == 7) {
            result = input.substring(0,1);
        }else if(count == 8) {
            result = input.substring(0,2);
        }else{
            result = input.substring(0,3);
        }
        return result + MILLION;
    }


}