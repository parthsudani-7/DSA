import java.util.*;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        Stack<Integer> st = new Stack<>();
        Queue<Integer> q = new LinkedList<>();

        for (int student : students) {
            q.offer(student);
        }
        for (int i = sandwiches.length - 1; i >= 0; i--) {
            st.push(sandwiches[i]);
        }

        int count = 0;
        while (!q.isEmpty() && !st.isEmpty() && count < q.size()) {

            if (q.peek().equals(st.peek())) {
                q.poll();
                st.pop();
                count = 0; 
            } else {
                q.offer(q.poll()); 
                count++;
            }
        }

        return q.size();
    }
}
