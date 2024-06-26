package Arrays;

// An element is a leader if it is greater than all the elements to its right side
// https://www.geeksforgeeks.org/leaders-in-an-array/
// O(n) O(n)

import java.util.ArrayList;
import java.util.List;

public class LeadersInAnArray {
    public List<Integer> leader(int[] nums) {
        List<Integer> leaders = new ArrayList<>();
        int length = nums.length;
        leaders.add(nums[length - 1]);
        int currentLeader = nums[length - 1];

        for(int i = length - 2; i >= 0; i--) {
            if (currentLeader < nums[i]) {
                currentLeader = nums[i];
                leaders.add(currentLeader);
            }
        }
        return leaders;
    }
}
