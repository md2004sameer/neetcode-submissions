class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int n : stones){
            pq.offer(n);
        }

        while(pq.size() >= 2){

            int x = pq.poll();
            int y = pq.poll();

            if(x != y){
                int e = Math.abs(x - y);

                pq.offer(e);
            }

        }

        return pq.isEmpty() ? 0 : pq.peek();
        
    }
}
