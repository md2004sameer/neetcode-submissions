class Solution {
    public int search(int[] nums, int target) {
        /*
        this is classical bs problem , given the rotated array , in this we have
        to find minIdx , so we can search from ( low to midIdx -1) and (midIdx to h)
        to find the target , as it is rotated , so it is diffrentiating factor.

        */
        int l = 0;
        int h = nums.length - 1;
        int minIdx = findMin(nums);
        System.out.println(minIdx);

        int fh = bs(nums, l, minIdx - 1, target);

        int sh = bs(nums, minIdx, h, target);

        if(fh == -1) return sh;

        return fh;

    }

    private int findMin(int nums[]) {
        int l = 0;
        int h = nums.length - 1;

        while (l < h) {

            int mid = l + (h - l) / 2;

            if (nums[mid] > nums[h]) {
                l = mid + 1;
            } else {
                h = mid;
            }
        }
        return l;
    }

    private int bs(int nums[], int l, int h, int target) {

        while (l <= h) {

            int mid = l + (h - l) / 2;

            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                l = mid + 1;
            else
                h = mid - 1;
        }
        return -1;
    }
}
