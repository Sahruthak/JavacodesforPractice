class Leetcode1047 {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();

        for(int i=0;i<s.length();i++){
            if(st.empty() || st.peek()!=s.charAt(i)) {
                st.push(s.charAt(i));
            }
            else{
                st.pop();
            }
        }
        String ans="";
        while(!st.empty()){
            ans=st.peek()+ans;
            st.pop();
        }
 
    return ans;   
    }
}
