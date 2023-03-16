package easy;

public class palindromeNumber_9 {
    public static void main(String[] args) {

        int x = 100001;

        System.out.println(isPalindrome(x));
    }



    public static boolean isPalindrome(int x) {

        String str_x = Integer.toString(x);
        StringBuilder sb = new StringBuilder(str_x);

        return sb.reverse().toString().equals(str_x);
        // Since the reverse() method returns a StringBuilder object, we need to use the toString() method to convert it to a String.

    }

    /*
    public static boolean isPalindrome_2(int x) {
        if(x < 0) return false;

        int n_original = x;
        int n_reverted = 0;

        while(n_original > 0) {
            n_reverted = n_reverted*10 + n_original%10;
            n_original /= 10;
        }

        return x == n_reverted;
    }

    public static boolean isPalindrome_3(int x) {

        String str_x = Integer.toString(x);

        // Since we are comparing the each ends values, we can iterate just half of the sequence.
        for(int i=0; i<str_x.length()/2; i++) {
            char first = str_x.charAt(i);
            char last = str_x.charAt(str_x.length()-1-i);

            if(first != last) return false;
        }

        return true;
    }
    */

}
