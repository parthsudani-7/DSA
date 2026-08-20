class Solution {
    static void solve(String digits, List<String> ans, StringBuilder curr, String[] map, int index){

        if(curr.length() >= digits.length()){
            ans.add(curr.toString());
            return;
        }
        int val = digits.charAt(index) - '0';
        String mapVal = map[val];
        

        for(int i = 0; i < mapVal.length(); i++){
            curr.append(mapVal.charAt(i));
            solve(digits, ans, curr, map, index + 1);
            curr.deleteCharAt(curr.length() - 1);
        }

    }
    public List<String> letterCombinations(String digits) {
        
        List<String> ans = new ArrayList<>();
        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        StringBuilder curr = new StringBuilder();

        solve(digits, ans, curr, map, 0);
        return ans;

    }
}
