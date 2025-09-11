package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// n皇后
public class LeetCode51 {
    List<List<String>> result = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] chessboard = new char[n][n];
        for (char[] chars : chessboard) {
            Arrays.fill(chars,'.'); // 每行都填满 '.'
        }
        backtracking(chessboard,n,0);
        return result;
    }

    public void backtracking(char[][] chessboard,int n , int row){
        if (row == n){
            result.add(constructBoard(chessboard));
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isValid(row,col,n,chessboard)){
                chessboard[row][col] = 'Q';
                backtracking(chessboard,n,row+1);
                chessboard[row][col] = '.';
            }
        }
    }

    /**
     * 将 char[][] 棋盘转成 List<String>
     */
    private List<String> constructBoard(char[][] chessboard){
        List<String> list = new ArrayList<>();
        for (char[] row : chessboard) {
            list.add(String.valueOf(row)); // 把每行字符数组转成字符串
        }
        return list;
    }

    public boolean isValid(int row , int col , int n , char[][] chessboard){
        // 检查是否在同一列
        for (int i = 0; i < row; i++) {
            if (chessboard[i][col] == 'Q'){
                return false;
            }
        }
        // 检查左上对角线
        for (int i = row - 1 ,j = col - 1; i >= 0 && j >= 0 ; i--,j--) {
            if (chessboard[i][j] == 'Q'){
                return false;
            }
        }
        // 检查右上角对角线
        for (int i = row - 1 , j = col + 1; i >= 0 && j <= n-1 ; i--,j++) {
            if (chessboard[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
}
