package easy;

public class Twosum_1 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] result_arr = twoSum(nums, target);

        for (int n: result_arr) {
            System.out.println(n);
        }



    }

    public static int[] twoSum(int[] nums, int target) {

        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{};
    }

}
