class Solution {
  public int characterReplacement(String s, int k) {
    HashMap<Character, Integer> mp = new HashMap<>();
    int max = Integer.MIN_VALUE;

    int l = 0;
    int h = 0;
    int ans = 0;

    while (h < s.length()) {
      char ch = s.charAt(h);
      mp.put(ch, mp.getOrDefault(ch, 0) + 1);
      max = Math.max(mp.get(ch), max);
      int change = (h - l + 1) - max;

      while ((h - l + 1) - max > k) {
        char remove = s.charAt(l);
        mp.put(remove, mp.getOrDefault(remove, 0) - 1);
        l++;
      }
      ans = Math.max(ans, h - l + 1);

      h++;
    }
    return ans;
  }
}
