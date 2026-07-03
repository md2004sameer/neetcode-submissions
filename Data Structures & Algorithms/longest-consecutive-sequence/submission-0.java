class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }

        int max = 0;

        // check if previous element exist in set , if not it means it could be new sequence , 
        // start building new sequnce , store the max len of sequence.

        for (int n : nums) {
            if (!set.contains(n - 1)) {
                int curr = n;
                int cnt = 1;

                while (set.contains(curr + 1)) {
                    curr++;
                    cnt++;
                }
                max = Math.max(max, cnt);
            }
        }
        return max;
    }
}
