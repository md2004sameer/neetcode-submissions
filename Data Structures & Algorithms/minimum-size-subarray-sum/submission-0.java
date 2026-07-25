class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int min = Integer.MAX_VALUE;

        int l =0; int sum = 0;
        for(int h = 0 ; h < nums.length;h++){

            sum += nums[h];

            while(sum >= target){
                
                min = Math.min(min , h-l+1);
                sum -= nums[l++];
            }

        }

        return min == Integer.MAX_VALUE  ? 0 : min;
        
    }
}