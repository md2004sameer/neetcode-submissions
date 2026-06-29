class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mp = new HashMap<>();

        for (char ch : s.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) - 1);
        }

        for (int i : mp.values()) {
            System.out.println(i+ " ");
            if (i != 0)
                return false;
        }

        return true;
    }
}
