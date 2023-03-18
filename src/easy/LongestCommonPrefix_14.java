package easy;

public class LongestCommonPrefix_14 {

    public static void main(String[] args) {

        String[] strs = {"flower","flow","flight"};
        // String[] strs = {"flower", "flower", "flower", "flower"};

        System.out.println(longestCommonPrefix(strs));
    }

    /*
    public static String longestCommonPrefix(String[] strs) {

        String str = strs[0];
        String result = "";

        if(strs == null || strs.length == 0){
            return "";
        }
        if(strs[0].length() > 0) {
            for (int i = 1; i < strs.length; i++) {
                for (int j = 0; j < strs[i].length(); j++) {
                    if (strs[i].charAt(j) == str.charAt(j) && j != str.length()-1) {
                        result += strs[i].charAt(j);
                    } else {
                        result = result.substring(0, j);
                        break;
                    }
                }
            }
        }
        else{
            result = strs[0];
        }

        return result;
    }
    */

    public static String longestCommonPrefix(String[] strs) {

        String result = strs[0];

        for(int i=1; i<strs.length; i++){
            while(strs[i].indexOf(result) != 0){ // 같지 않다면 -1, 같다면 0
                result = result.substring(0,result.length()-1);
            }
        }
        return result;
    }
}
