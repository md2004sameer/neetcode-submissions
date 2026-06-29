class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> mp = new HashMap<>();

        for(String s : strs){
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            // form a key 

            if(!mp.containsKey(key)){
                mp.put(key , new ArrayList<>());
            } 

            // put a element in a key

            if(mp.containsKey(key)){
                mp.get(key).add(s);
            }
        }
        return new ArrayList<>(mp.values());

    }
}
