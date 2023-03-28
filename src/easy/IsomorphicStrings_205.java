package easy;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings_205 {
    public static void main(String[] args) {
        String s = "egg", t = "add";

        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {

        Map<Character, Character> sToT = new HashMap<>();
        Map<Character, Character> tToS = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            Character str_s = s.charAt(i);
            Character str_t = t.charAt(i);

            if( sToT.containsKey(str_s) && sToT.get(str_s) != str_t || tToS.containsKey(str_t) && tToS.get(str_t) != str_s){
                return false;
            }
            sToT.put(str_s, str_t);
            tToS.put(str_t, str_s);
        }
        return true;

        /*char[] sToT = new char[256];
        char[] tToS = new char[256];

        for(int i=0; i<s.length(); i++) {
            char ch_s = s.charAt(i);
            char ch_t = t.charAt(i);

            if(sToT[ch_s] == 0 && tToS[ch_t] == 0){
                sToT[ch_s] = ch_t;
                tToS[ch_t] = ch_s;
            }
            else if(sToT[ch_s] != ch_t){
                return false;
            }
        }
        return true;*/
    }
}
