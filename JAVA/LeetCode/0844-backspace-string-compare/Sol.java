class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        Stack<Character> st = new Stack<>();

        for(int i = 0 ; i < s.length(); i++){
            if(!st.isEmpty() && s.charAt(i) == '#'){
                st.pop();
            }
            else{
                if(s.charAt(i) != '#'){
                    st.push(s.charAt(i));
                }
                
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        for(int i = 0 ; i < t.length(); i++){
            if(!st.isEmpty() && t.charAt(i) == '#'){
                st.pop();
            }
            else{
                if(t.charAt(i) != '#'){
                    st.push(t.charAt(i));
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        while(!st.isEmpty()){
            sb2.append(st.pop());
        }
        return sb.toString().equals(sb2.toString());
    }
}
