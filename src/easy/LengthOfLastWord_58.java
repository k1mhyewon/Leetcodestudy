package easy;

public class LengthOfLastWord_58 {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";

        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {

        String[] arr_s = s.split(" ");
        String last = arr_s[arr_s.length-1];

        return last.length();


        /*
        int i = s.length()-1, length = 0;
        while(s.toCharArray()[i] == ' '){
            i--;
        }
        while(i>=0 && s.toCharArray()[i] != ' '){
            length++;
            i--;
        }

        return length;
        */
    }

}
