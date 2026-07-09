class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{')
                st.push(ch);

            if (ch == ')' || ch == ']' || ch == '}') {
                if (st.isEmpty())
                    return false;
                else {
                    char top = st.peek();
                    if (top == '(' && ch == ')')
                        st.pop();
                    else if (top == '[' && ch == ']')
                        st.pop();
                    else if (top == '{' && ch == '}')
                        st.pop();
                    else
                        return false;
                }
            }
        }
        if (!st.isEmpty())
            return false;

        return true;
    }
}
