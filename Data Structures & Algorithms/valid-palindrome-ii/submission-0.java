class Solution {
    public boolean validPalindrome(String s) {

        StringBuilder st  = new StringBuilder();
        for(char ch : s.toCharArray()){
            
            if(ch >= '0' &&  ch <= '9' || ch >= 'a' && ch <= 'z' || ch >='A' && ch <= 'Z'){
                st.append(ch);
            }
        }
        String str = new String(st);

        int l =0 ; int h = str.length()-1;
        while( l < h){
            if(s.charAt(l) == s.charAt(h)){
                l++;h--;
            }else{
                // mismatch 

                return isValid(str , l +1 , h) || isValid(str , l , h-1);

            }
        }
        return true;


        
    }

    private boolean isValid(String s , int l , int h){

        while(l < h){
            if(s.charAt(l) != s.charAt(h)) return false;

            l++;
            h--;
        }
        return true;
    }
}