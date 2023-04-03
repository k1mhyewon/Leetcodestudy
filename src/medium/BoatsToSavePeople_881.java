package medium;

import java.util.Arrays;

public class BoatsToSavePeople_881 {
    public static void main(String[] args) {
        int[] people = {3,2,2,1,5,10};
        int limit = 10 ;

        System.out.println(numRescueBoats(people, limit));
    }

    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int result = 0;
        int start = 0;
        int end = people.length - 1;

        while(start <= end) {
            int remain = limit - people[end];
            end--;
            result++;

            if(start <= end && remain >= people[start]){
                start++;
            }
        }
        return result;
    }
}
