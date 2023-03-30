package easy;

public class IsSubsequence_392 {

    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";

        System.out.println(isSubsequence(s,t));

    }

    public static boolean isSubsequence(String s, String t) {
        int s_pointer = 0;
        int t_pointer = 0;

        while(s_pointer < s.length() && t_pointer < t.length()){
            if(t.charAt(t_pointer) == s.charAt(s_pointer)){
                s_pointer++;
            }
            t_pointer++;
        }

        return s_pointer == s.length();
    }
}
