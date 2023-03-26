package easy;

public class PlusOne_66 {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 3, 5};

        int[] plus_digits = plusOne(digits);
        for(int i=0; i<plus_digits.length; i++){
            System.out.println(plus_digits[i]);
        }
    }

    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i=len-1; i>=0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int new_digits[] = new int[len+1];
        new_digits[0] = 1;

        return new_digits;

    }
}
