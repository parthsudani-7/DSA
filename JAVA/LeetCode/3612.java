class Solution {
    static StringBuilder hash(StringBuilder sb){
        sb.append(sb);
        return sb;
    }
    static StringBuilder star(StringBuilder sb){
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb;
    }
    static StringBuilder mode(StringBuilder sb){
        sb.reverse();
        return sb;
    }
    public String processStr(String s) {
        

        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(ch == '#'){
                sb = hash(sb);
            }
            else if(ch == '*'){
                sb = star(sb);
            }
            else if(ch == '%'){
                sb = mode(sb);
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}