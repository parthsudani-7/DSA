class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        if(n == 1){
            return 1;
        }
        String answer = "";
        int count = 1, temp = 1;
        int j = 0;
        for(int i = 0; i < n - 1; i++){
            if(chars[i] == chars[i + 1]){
                temp++;
            }else{
                answer = answer + chars[i];
                if(temp > 1){
                    String ans = Integer.toString(temp);
                    answer = answer + ans;
                    temp = 1;
                }
            }
        }
        answer = answer + chars[n - 1];

        String ans = Integer.toString(temp);
        if(temp > 1){
            answer = answer + ans;
        }
        for(int i = 0; i < answer.length(); i++){
            chars[i] = answer.charAt(i);
        }
        
        return answer.length();
    }
}
