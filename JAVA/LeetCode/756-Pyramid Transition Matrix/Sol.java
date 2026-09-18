class Solution {
    Map<String, List<Character>> map = new HashMap<>();

    public boolean pyramidTransition(String bottom, List<String> allowed) {
        for (String s : allowed) {
            String pair = s.substring(0, 2);
            map.computeIfAbsent(pair, k -> new ArrayList<>()).add(s.charAt(2));
        }
        return dfs(bottom);
    }

    private boolean dfs(String row) {
        if (row.length() == 1) return true;

        return buildNext(row, 0, new StringBuilder());
    }

    private boolean buildNext(String row, int i, StringBuilder next) {
        if (i == row.length() - 1) {
            return dfs(next.toString());
        }

        String pair = row.substring(i, i + 2);

        if (!map.containsKey(pair)) return false;

        for (char c : map.get(pair)) {
            next.append(c);

            if (buildNext(row, i + 1, next)) return true;

            next.deleteCharAt(next.length() - 1);
        }

        return false;
    }
}
