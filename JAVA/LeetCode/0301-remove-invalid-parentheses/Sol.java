class Solution {
    public List<String> removeInvalidParentheses(String s) {
        Set<String> result = new HashSet<>();
        int left = 0, right = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                left++;
            } else if (c == ')') {
                if (left > 0) {
                    left--;
                } else {
                    right++;
                }
            }
        }

        backtrack(s, 0, left, right, 0, new StringBuilder(), result);

        return new ArrayList<>(result);
    }

    private void backtrack(String s, int index, int leftRem, int rightRem,
                           int balance, StringBuilder current, Set<String> result) {
        if (index == s.length()) {
            if (leftRem == 0 && rightRem == 0 && balance == 0) {
                result.add(current.toString());
            }
            return;
        }

        char c = s.charAt(index);

        if (c == '(' && leftRem > 0) {
            backtrack(s, index + 1, leftRem - 1, rightRem,
                      balance, current, result);
        }

        if (c == ')' && rightRem > 0) {
            backtrack(s, index + 1, leftRem, rightRem - 1,
                      balance, current, result);
        }

        current.append(c);

        if (c == '(') {
            backtrack(s, index + 1, leftRem, rightRem,
                      balance + 1, current, result);
        } else if (c == ')') {
            if (balance > 0) {
                backtrack(s, index + 1, leftRem, rightRem,
                          balance - 1, current, result);
            }
        } else {
            backtrack(s, index + 1, leftRem, rightRem,
                      balance, current, result);
        }

        current.deleteCharAt(current.length() - 1);
    }
}
