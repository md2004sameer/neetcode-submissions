class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int n : nums) {
            mp.put(n, mp.getOrDefault(n, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for (Map.Entry<Integer, Integer> e : mp.entrySet()) {
            pq.offer(e);

            if (pq.size() > k)
                pq.poll();
        }
        int[] arr = new int[k];
        int i = 0;

        while (pq.size() > 0) {
            Map.Entry<Integer, Integer> e = pq.poll();

            arr[i++] = e.getKey();
        }
        
        return arr;
    }
}
