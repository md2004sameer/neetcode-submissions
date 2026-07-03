class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board[0].length;
        // rows

        for (int i = 0; i < 9; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.')
                    continue;

                if (set.contains(board[i][j]))
                    return false;

                set.add(board[i][j]);
            }
        }

        // cols

        for (int i = 0; i < n; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < n; j++) {
                if (board[j][i] == '.')
                    continue;

                if (set.contains(board[j][i]))
                    return false;

                set.add(board[j][i]);
            }
        }

        //
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!isValid(board, i , i + 3 , j , j +3)) return false;
            }
        }
        return true;
    }

    private boolean isValid(char[][] board, int sr, int er , int sc , int ec) {
        HashSet<Character> set = new HashSet<>();

        for (int i = sr; i < er; i++) {
            for (int j = sc; j < ec; j++) {
                if (board[i][j] == '.')
                    continue;

                if (set.contains(board[i][j]))
                    return false;

                set.add(board[i][j]);
            }
        }
        return true;
    }
}
