class Solution {
    public String compressedString(String word) {
        int count = 1, temp = 1;
        String answer = "";
        for(int i = 0; i < word.length() - 1; i++){

            if(word.charAt(i) == word.charAt(i + 1)){
                if(temp < 9){
                    temp++;
                }

                else{
                    answer = answer + Integer.toString(temp);
                    answer = answer + word.charAt(i);
                    temp = 1;
                }
            }else{
                answer = answer + Integer.toString(temp);
                answer = answer + word.charAt(i);
                temp = 1;
            }
           
        }
        answer = answer + Integer.toString(temp);
        answer = answer + word.charAt(word.length() - 1);
         return answer;
    }
}