package medium;

import java.util.Arrays;

public class SuccessfulPairsOfSpellsAndPotions_2300 {
    public static void main(String[] args) {
        int[] spells = {5,1,3};
        int[] potions = {1,2,3,4,5};
        long success = 7;

        Arrays.sort(potions);

        System.out.println(successfulPairs(spells, potions, success));
    }

    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] result_arr = new int[spells.length];

        for(int i=0; i<spells.length; i++){
            int start = 0;
            int end = potions.length - 1;

            while(start <= end) {
                int mid = (start + end) / 2;
                long multi_res = Long.valueOf(potions[mid]) * Long.valueOf(spells[i]);

                if(multi_res < success){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            result_arr[i] = potions.length - start;
        }


        return result_arr;
    }
}
