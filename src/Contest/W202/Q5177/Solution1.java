package Contest.W202.Q5177;

import java.util.Arrays;
import java.util.HashMap;

public class Solution1 {
    public String reformatDate(String date) {

        HashMap months = new HashMap();
        months.put("Jan","01");
        months.put("Feb","02");
        months.put("Mar","03");
        months.put("Apr","04");
        months.put("May","05");
        months.put("Jun","06");
        months.put("Jul","07");
        months.put("Aug","08");
        months.put("Sep","09");
        months.put("Oct","10");
        months.put("Nov","11");
        months.put("Dec","12");

        HashMap days = new HashMap();
        days.put("1st","01");
        days.put("2nd","02");
        days.put("3rd","03");
        days.put("4th","04");
        days.put("5th","05");
        days.put("6th","06");
        days.put("7th","07");
        days.put("8th","08");
        days.put("9th","09");
        days.put("10th","10");
        days.put("11st","11");
        days.put("12th","12");
        days.put("13rd","13");
        days.put("14th","14");
        days.put("15th","15");
        days.put("16th","16");
        days.put("17th","17");
        days.put("18th","18");
        days.put("19th","19");
        days.put("20th","20");
        days.put("21st","21");
        days.put("22nd","22");
        days.put("23rd","23");
        days.put("24th","24");
        days.put("25th","25");
        days.put("26th","26");
        days.put("27th","27");
        days.put("28th","28");
        days.put("29th","29");
        days.put("30th","30");
        days.put("31st","31");


//        String d = "6th Jun 1933";

        String[] s = date.split(" ");

        String year = s[2];
        String month = (String) months.get(s[1]);
        String day = (String) days.get(s[0]);

        System.out.println(Arrays.toString(s));

        String result = "\"" + year + "-" + month + "-" + day + "\"";

        System.out.println(result);
        return result;
    }
}


