class StackReverseString {
    public void reverseString(char[] s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length;i++){
            st.push( s[i]);
        }
        for(int i=0;i<s.length;i++){
            s[i]=st.peek();
            st.pop();
        }
    }
}
