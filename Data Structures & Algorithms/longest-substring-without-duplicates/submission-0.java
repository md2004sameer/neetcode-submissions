class Solution {
  public int lengthOfLongestSubstring(String s) {
    HashSet<Character> set = new HashSet<>();
    int l = 0, h = 0;
    int max = 0;

    for (char ch : s.toCharArray()) {

      while (set.contains(ch)) {
        char remove = s.charAt(l);
        set.remove(remove);
        l++;
      }
      set.add(ch);

      max = Math.max(max, h - l + 1);

      h++;
    }
    return max;
  }
}
