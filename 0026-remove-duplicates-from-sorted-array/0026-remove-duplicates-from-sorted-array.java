class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int i = 1; // Start at index 1 because the first element is always considered unique
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[j - 1]) {
                nums[i] = nums[j];
                i++;
            }
        }
        
        return i;
    }
}
