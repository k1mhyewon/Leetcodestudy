package easy;

public class Sqrt_69 {
    public static void main(String[] args) {
        int x = 8;

        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {
        /*int start = 1;
        int end = x;
        int res = 0;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid <= x / mid){
                res = mid;
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return res;*/

        int start = 0;
        int end = x;
        int res = 0;

        while(start <= end){
            int mid = start + (end-start) / 2;
            if(mid*mid > x) {
                end = mid - 1;
            }
            else if(mid*mid < x) {
                start = mid + 1;
                res = mid;
            }
            else {
                return mid;
            }
        }

        return res;

    }
}
