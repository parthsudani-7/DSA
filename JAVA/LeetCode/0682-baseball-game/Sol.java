class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < operations.length; i++) {

            String op = operations[i];

            if (op.equals("C")) {
                st.pop();
            } else if (op.equals("D")) {
                st.push(st.peek() * 2);
            } else if (op.equals("+")) {
                int temp = st.pop();
                int ans = temp + st.peek();
                st.push(temp);
                st.push(ans);
            } else {
                st.push(Integer.parseInt(op));
            }
        }
        int ans = 0;
        while(!st.isEmpty()){
            ans += st.pop();
        }
    return ans;
    }
}
