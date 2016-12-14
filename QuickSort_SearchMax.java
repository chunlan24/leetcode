public class QuickSort_SearchMaxMin {
    public static void main(String[] args) {
            // TODO Auto-generated method stub
     
            int[] nums = { 1, 3, 4, 5, 3, 8, 9, 6, 5, 2, 3, 1 };
            int max = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (max < nums[i]) {
                    max = nums[i];
                }
            }
            System.out.println("Max number is " + max);

            int min = nums[0];
            for (int j = 1; j <nums.length; j++) {
                if (min > nums[j]) {
                    min = nums[j];
                }
            }
            System.out.println("Min number is " + min);
        }
}