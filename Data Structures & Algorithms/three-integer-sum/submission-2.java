class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int target = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int l = i + 1;
            int h = nums.length - 1;

            while (l < h) {
                int sum = nums[i] + nums[l] + nums[h];

                if (sum == target) {
                    ans.add(Arrays.asList(nums[i], nums[l], nums[h]));
                    l++;
                    h--;
                    while (l < h && nums[l] == nums[l - 1]) l++;
                    while (l < h && nums[h] == nums[h + 1]) h--;
                } else if (sum > target)
                    h--;
                else
                    l++;
            }
        }
        return ans;
    }
}
