class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] pre = new int[n];
        pre[0] = 1;

        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] * nums[i - 1];
        }

        int pos[] = new int[n];
        pos[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            pos[i] = pos[i + 1] * nums[i + 1];
        }

        int ans[] = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = pos[i] * pre[i];
        }
        return ans;
    }
}
