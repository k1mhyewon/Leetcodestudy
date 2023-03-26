package easy;

public class RunningSumOf1dArray_1480 {

    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};

        int[] print_nums = runningSum(nums);
        for(int i=0; i<print_nums.length; i++){
            System.out.println(print_nums[i]);
        }
    }
    public static int[] runningSum(int[] nums) {
        int len = nums.length;
        int[] res_nums = new int[len];

        res_nums[0] = nums[0];
        for(int i=1; i<len; i++){
            res_nums[i] = res_nums[i-1] + nums[i];
        }

        return res_nums;
    }
}
