class Solution {

    static void solve(StringBuilder s, ArrayList<String> ans, int index) {

        if (index == s.length()) {
            ans.add(s.toString());
            return;
        }

        for (int i = index; i < s.length(); i++) {

            char temp = s.charAt(index);
            s.setCharAt(index, s.charAt(i));
            s.setCharAt(i, temp);

            solve(s, ans, index + 1);

            temp = s.charAt(index);
            s.setCharAt(index, s.charAt(i));
            s.setCharAt(i, temp);
        }
    }

    public ArrayList<String> permutation(String s) {

        ArrayList<String> ans = new ArrayList<>();

        StringBuilder curr = new StringBuilder(s);

        solve(curr, ans, 0);

        Collections.sort(ans);

        return ans;
    }
}
