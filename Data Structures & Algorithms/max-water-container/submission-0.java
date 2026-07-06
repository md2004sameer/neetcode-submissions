class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int h = heights.length - 1;
        int max = 0;

        while (l < h) {
            int len = h - l;
            int breath = Math.min(heights[l], heights[h]);
            int area = len * breath;

            max = Math.max(area, max);

            if (heights[l] < heights[h]) {
                l++;
            } else {
                h--;
            }
        }
        return max;
    }
}
