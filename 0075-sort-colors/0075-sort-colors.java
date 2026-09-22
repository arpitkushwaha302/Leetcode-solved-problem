class Solution {
    public void sortColors(int[] nums) {

        int index = 0;

        // Put all 0s first
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;

                index++;
            }
        }

        // Put all 1s after 0s
        for (int i = index; i < nums.length; i++) {
            if (nums[i] == 1) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;

                index++;
            }
        }
    }
}