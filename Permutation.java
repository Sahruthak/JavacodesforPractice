class Permutation {
    public void nextPermutation(int[] nums) {

    int n = nums.length;
    int i = n - 2;

    // Step 1: Find the first pair of adjacent elements in decreasing order
    while (i >= 0 && nums[i] >= nums[i + 1]) {
        i--;
    }

    if (i >= 0) {
        // Step 2: Find the smallest element greater than nums[i] on its right side
        int j = n - 1;
        while (nums[j] <= nums[i]) {
            j--;
        }

        // Step 3: Swap nums[i] and nums[j]
        swap(nums, i, j);
    }

    // Step 4: Reverse the subarray from index i+1 to the end
    reverse(nums, i + 1, n - 1);
}

private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}

private void reverse(int[] nums, int start, int end) {
    while (start < end) {
        swap(nums, start, end);
        start++;
        end--;
    }
}
}
