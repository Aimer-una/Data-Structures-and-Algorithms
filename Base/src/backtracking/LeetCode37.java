package backtracking;

public class LeetCode37 {
    public void solveSudoku(char[][] board) {
        backtracking(board);
    }

    public boolean backtracking(char[][] board){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.'){
                    continue;
                }
                for (char k = '1'; k <= '9' ; k++) {
                    if (isValidSudoku(i,j,k,board)){
                        board[i][j] = k;
                        if (backtracking(board)){
                            return true;
                        }
                        board[i][j] = '.';
                    }
                }
                // 9个数都试完了，都不行，那么就返回false
                return false;
                // 因为如果一行一列确定下来了，这里尝试了9个数都不行，说明这个棋盘找不到解决数独问题的解！
                // 那么会直接返回， 「这也就是为什么没有终止条件也不会永远填不满棋盘而无限递归下去！」
            }
        }
        // 遍历完没有返回false，说明找到了合适棋盘位置了
        return true;
    }

    public boolean isValidSudoku(int row, int col, char val , char[][] board){
        // 检查同一行中是否有相同的数字
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == val) {
                return false;
            }
        }
        // 检查同一列中是否有相同的数字
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == val){
                return false;
            }
        }
        // 检查九宫格中是否有相同的数字
        int startRow = (row/3)*3;
        int startCol = (col/3)*3;
        for (int i = startRow; i < startRow+3 ; i++) {
            for (int j = startCol; j < startCol+3; j++) {
                if (board[i][j] == val){
                    return false;
                }
            }
        }
        return true;
    }
}
