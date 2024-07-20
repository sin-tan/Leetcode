class Solution {
    public int search(int[] nums, int target) {
        int f = 0;               // Start index of the array
        int end = nums.length - 1; // End index of the array
        
        while (f <= end) {
            int mid = f + (end - f) / 2;  // Calculate the middle index
            
            if (nums[mid] == target) {
                return mid;  // Return the index if target is found
            } 
            if (nums[f] <= nums[mid]) {
                if (nums[f] <= target && target <= nums[mid]) {
                    end = mid - 1;  // If target is in the left half, adjust `end`
                } else {
                    f = mid + 1;  // If target is in the right half, adjust `f`
                }
            } else {
                if (nums[mid] <= target && target <= nums[end]) {
                    f = mid + 1;  // If target is in the right half, adjust `f`
                } else {
                    end = mid - 1;  // If target is in the left half, adjust `end`
                }
            }
        }
        return -1;  // Return -1 if target is not found in the array
    }
}

