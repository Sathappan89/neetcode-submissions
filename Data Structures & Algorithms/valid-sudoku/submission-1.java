class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, Set<Character>> rows = new HashMap<>();
        HashMap < Integer, Set < Character >> cols = new HashMap<>();
        HashMap < Integer, Set < Character >> squares = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            rows.put(i, new HashSet<>());
            cols.put(i, new HashSet<>());
            squares.put(i, new HashSet<>());
        }
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char c = board[row][col];
                if (c == '.') {
                    continue;
                }
                int sqKey = ((row / 3) * 3) + col / 3;

                if (rows.get(row).contains(c) || cols.get(col).contains(c)
                    || squares.get(sqKey).contains(c)) {
                    return false;
                }

                rows.get(row).add(c);
                cols.get(col).add(c);
                squares.get(sqKey).add(c);
            }
        }
        return true;
    }
}
