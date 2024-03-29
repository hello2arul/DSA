package Arrays;
//https://leetcode.com/problems/rotate-array/
//O(n) O(1)

class RotateArrayK {
    public void rotate(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k == 0) {
            return;
        }
        k %= nums.length;
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, 0, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}