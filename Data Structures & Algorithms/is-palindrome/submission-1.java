class Solution {
    public boolean isPalindrome(String s) {

        // clear the string , and convert it to lower case.
        StringBuilder st = new StringBuilder();

        for(char ch : s.toCharArray()){
            ch = Character.toLowerCase(ch);
            if((ch  >= 'a' && ch  <= 'z' ) || (ch >= '0' &&  ch <= '9') ) st.append(ch);
        }
        int l = 0; int h = st.length()-1;

        while(l <= h){
            if(st.charAt(l) != st.charAt(h)) return false;
            l++;h--;
        }
        return true;
        
    }
}
