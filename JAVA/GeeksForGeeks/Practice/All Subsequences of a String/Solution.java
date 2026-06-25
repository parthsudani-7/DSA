import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    static void seq(String s, int idx, String current, List<String> ans) {
        if (idx >= s.length()) {
            ans.add(current);
            return;
        }
        
        seq(s, idx + 1, current, ans);
        seq(s, idx + 1, current + s.charAt(idx), ans);
    }
    
    public List<String> powerSet(String s) {
        List<String> ans = new ArrayList<>();
        seq(s, 0, "", ans);
        Collections.sort(ans);
        return ans;
    }
}
