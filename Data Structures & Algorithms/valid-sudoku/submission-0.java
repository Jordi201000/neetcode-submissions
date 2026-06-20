class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<Character> rowSet = new HashSet<>();
        Set<Character> colSet = new HashSet<>();
        Set<Character> sqrSet = new HashSet<>();

        for (int row=0; row<9; row++){
            rowSet = new HashSet<>();
            for (int col=0; col<9; col++){

                if(board[row][col]=='.')
                continue;

                if(rowSet.contains(board[row][col]))
                return false;

                rowSet.add(board[row][col]);

            }
        }

        for (int col=0; col<9; col++){
            colSet = new HashSet<>();
            for (int row=0; row<9; row++){

                if(board[row][col]=='.')
                continue;

                if(colSet.contains(board[row][col]))
                return false;

                colSet.add(board[row][col]);

            }
        }

        for (int sqr=0; sqr<9; sqr++){
            sqrSet = new HashSet<>();

            for (int row=0; row<3; row++){
                 for (int col=0; col<3; col++){

                if(board[(sqr/3)*3+row][(sqr%3)*3+col]=='.')
                continue;

                if(sqrSet.contains(board[(sqr/3)*3+row][(sqr%3)*3+col]))
                return false;

                sqrSet.add(board[(sqr/3)*3+row][(sqr%3)*3+col]);

            }
        }
        }

    return true;
    }
}
