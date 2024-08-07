package Arrays;

// https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/description/
// O(n) O(1)

class SecondLargest {
    public int maxProduct(int[] nums) {
        int largest = Math.max(nums[0], nums[1]);
        int secondLargest = Math.min(nums[0], nums[1]);

        for(int i = 2; i < nums.length; i++) {
            if(nums[i] >= largest) {
                secondLargest = largest;
                largest = nums[i];
            } else if (nums[i] >= secondLargest) {
                secondLargest = nums[i];
            }
        }
        return (largest - 1) * (secondLargest - 1);
    }
}