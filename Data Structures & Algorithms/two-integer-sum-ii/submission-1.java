class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = 0;
        int h = nums.length-1;

        while( l < h){

            int sum = nums[l] + nums[h];

            if(sum == target) return new int[]{l +1, h+1};

            if(sum > target) h--;
            else l++;
        }
        return new int[]{};
    }
}
