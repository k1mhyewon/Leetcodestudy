package easy;

public class SearchInsertPosition_35 {

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 2;

        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length-1;

        while(l <= r){
            int mid = (l+r)/2;

            if(target == nums[mid]){
                return mid;
            }

            if(target > nums[mid]){
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        return l;
    }
    /*
    public static int searchInsert(int[] nums, int target) {
        int result = 0;
        boolean bool = false;

        for(int i=0; i< nums.length; i++) {
            if(nums[i] == target){
                result = i;
                bool = true;
                break;
            }
        }
        if(!bool){
            for(int i=0; i< nums.length; i++){
                if(nums[i]>target){
                    result = i;
                    bool = true;
                    break;
                }
            }
            if(!bool){
                result = nums.length;
            }
        }
        return result;
    }
    */

}
