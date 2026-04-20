package Array;
public class SearchRotatedArray {

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // Case 1: Found target
            if (nums[mid] == target) {
                return mid;
            }

            // Case 2: Left half is sorted
            if (nums[start] <= nums[mid]) {
                // Check if target lies in left half
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            // Case 3: Right half is sorted
            else {
                // Check if target lies in right half
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int target = 0;

        int result = search(nums, target);
        System.out.println(result);
    }
}