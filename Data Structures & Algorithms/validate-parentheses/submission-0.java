class Solution {
    public boolean isValid(String s) {
        if(s.length() == 1) {
            return false;
        }



        Stack<Character> st = new Stack<>();
        int n = s.length();
        int i=0;
        while(i < n) {
            char ch = s.charAt(i);
            //Open
            if(ch == '{' || ch == '[' || ch == '(') {
                st.push(ch);
            }
            else {
                
                if (st.isEmpty()) {
                    return false;
                }

                char top = st.peek();

                if ((ch == ')' && top == '(') ||
                    (ch == '}' && top == '{') ||
                    (ch == ']' && top == '[')) {
                    st.pop();
                } else {
                    return false;
                }
            
            }
            i++;
        }

        return st.size() == 0? true : false;
    }
}
