package easy;

public class MergeSortedArray_88 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        merge(nums1, m, nums2, n);

        for(int i:nums1){
            System.out.println(i);
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m + n - 1;

        while(m > 0 && n > 0) {
            if(nums1[m-1] > nums2[n-1]) {
                nums1[last] = nums1[m-1];
                m--;
            }
            else {
                nums1[last] = nums2[n-1];
                n--;
            }
            last--;
        }

        while(n > 0) {
            nums1[last] = nums2[n-1];
            n--; last--;
        }
    }
}
