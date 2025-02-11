class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first= position(nums, target, -1);
        if(first == -1)
        return new int[]{-1, -1};
        return new int[]{first, position(nums, target, 1)};
        
    }
    int position(int[] nums, int target, int pos) {
    int left = 0, right = nums.length - 1;
    while (left <= right) {
        int middle = left + (right - left) / 2;

        if (nums[middle] == target) {
            boolean outOfBounds = (middle + pos < 0 || middle + pos >= nums.length);
            if (outOfBounds || nums[middle + pos] != target) {
                return middle;
            }
            if (pos == 1) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        } else if (nums[middle] < target) {
            left = middle + 1;
        } else {
            right = middle - 1;
        }
    }
    return -1;
}

}
