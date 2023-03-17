package easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt_13 {

    public static void main(String[] args) {

        String s = "MCMXCIV";

        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();

        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int len = s.length();
        int result = romanMap.get(s.charAt(len-1));

        for(int i=len-2; i>=0; i--){
            if(romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i+1))){
                result -= romanMap.get(s.charAt(i));
            }
            else {
                result += romanMap.get(s.charAt(i));
            }
        }

        return result;
    }


}
