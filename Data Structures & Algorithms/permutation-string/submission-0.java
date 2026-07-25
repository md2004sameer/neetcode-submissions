class Solution {
    public boolean checkInclusion(String s1, String s2) {

        // in this we problem we have to find a substring of s1 in the s2 ,
        // we can do so using the very sliding window cause here we talk about the substring

        HashMap<Character , Integer > mp1= new HashMap<>();

        HashMap<Character  , Integer > mp2 = new HashMap<>();

        for(char ch : s1.toCharArray()){
            mp1.put(ch , mp1.getOrDefault(ch , 0)+1);
        }

        int l =0 , k = s1.length();
        for(int h = 0;h < s2.length() ;h++){

            char ch = s2.charAt(h);

            mp2.put(ch , mp2.getOrDefault(ch ,0)+1);

            while(h-l+1 > k){

                char del = s2.charAt(l);

                mp2.put(del , mp2.getOrDefault(del , 0)-1);
                if(mp2.get(del) == 0) mp2.remove(del);
                l++;
            }

            if(h-l+1 == k && mp1.equals(mp2)) return true;
        }
        return false;
        
    }
}
