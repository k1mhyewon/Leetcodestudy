import java.util.HashSet;
import java.util.Set;

public class OptimalPartitionOfString_2405 {
    public static void main(String[] args) {
        String s = "abacaba";

        System.out.println(partitionString(s));
    }

    public static int partitionString(String s) {
        int result = 0;

        Set<Character> set = new HashSet<>();

        for(char c : s.toCharArray()) {
            if(set.contains(c)){
                result++;

                set = new HashSet<>();
                set.add(c);
            }
            else {
                set.add(c);
            }
        }

        if(!set.isEmpty()) result++;

        return result;
    }
}
