class Solution {
    public static char extraChar(String s1, String s2) {
        int xor = 0;

        for (int i = 0; i < s1.length(); i++) {
            xor ^= s1.charAt(i);
            xor ^= s2.charAt(i);
        }

        xor ^= s2.charAt(s2.length() - 1);

        return (char) xor;
    }
}
