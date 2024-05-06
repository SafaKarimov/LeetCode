package Sudoku36;

import java.util.HashSet;
import java.util.Set;

//class Solution {
//    public boolean isValidSudoku(char[][] board) {
//        Set<String> seen = new HashSet<>();
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                if (board[i][j] != '.') {
//                    String numStr = String.valueOf(board[i][j]);
//                    if (!seen.add(numStr + i) || !seen.add(j + numStr) || !seen.add(i / 3 + numStr + j / 3)) {
//                        return false;
//                    }
//
//
//                }
//
//            }
//
//        }
//
//        return true;
//    }
//
//[["5","3",".",".","7",".",".",".","."]
//["6",".",".","1","9","5",".",".","."],
//[".","9","8",".",".",".",".","6","."]
//["8",".",".",".","6",".",".",".","3"]
//\["4",".",".","8",".","3",".",".","1"],
//["7",".",".",".","2",".",".",".","6"],
//[".","6",".",".",".",".","2","8","."],
//[".",".",".","4","1","9",".",".","5"],
//[".",".",".",".","8",".",".","7","9"]]
//}
class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                if (num != '.') {
                    String numStr = String.valueOf(num);
                    if (!seen.add(numStr + "row" + i) && !seen.add(numStr + "col" + j) && !seen.add(numStr + "box" + i/3 + "-" + j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}