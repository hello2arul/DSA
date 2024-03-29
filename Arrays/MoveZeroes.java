package Arrays;

//https://leetcode.com/problems/move-zeroes/
//O(n) O(1)

class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int start = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[start];
                nums[start++] = nums[i];
                nums[i] = temp;
            }
        }
    }

    public void moveZeroes2(int[] nums) {
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                nums[index++] = nums[i];
            }
        }
        for(int i = index; i < nums.length; i++){
           nums[i] = 0;
        }        
    }
}