class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxh = new PriorityQueue<>();

        for(int num : nums){

            maxh.offer(num);
            if(maxh.size() > k) maxh.poll();
        }
        return maxh.peek();
    }
}
