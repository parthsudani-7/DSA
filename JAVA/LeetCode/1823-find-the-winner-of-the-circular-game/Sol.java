class Solution {

    public int findTheWinner(int n, int k) {

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }

        int temp = 1;

        while (q.size() > 1) {

            if (temp == k) {
                q.poll();
                temp = 1;
            } else {
                q.offer(q.poll());
                temp++;
            }
        }

        return q.peek();
    }
}
