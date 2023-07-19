class LeetCode20 {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if(current=='(')   st.push(current);
            else if(current=='{')   st.push(current);
            else if(current=='[')   st.push(current);
            else {
            if(st.empty()){
                return false;
            } 
            else if((st.peek()== '(' && current == ')') || (st.peek()== '{' && current == '}') || (st.peek()== '[' && current == ']')) {
                st.pop();
            } 
            else 
                return false;
            }
            }
        return st.empty();
    }
}
