package LeetCodeProblems;
//LeetCode Problem 51 N-Queens
public class LeetCodeProblem51 {
    class Solution {
        public boolean isSafe(int row,int col,int n,char[][]board){
            int upperRow = row;
            int upperCol = col;
            while(upperRow>=0 && upperCol>=0){
                if(board[upperRow][upperCol]=='Q'){
                    return false;
                }
                upperRow--;
                upperCol--;
            }
            int leftRow = row;
            int leftCol = col;
            while(leftCol>=0){
                if(board[leftRow][leftCol]=='Q'){
                    return false;
                }
                leftCol--;
            }
            int lowerRow=row;
            int lowerCol = col;
            while(lowerRow<n && lowerCol>=0){
                if(board[lowerRow][lowerCol]=='Q'){
                    return false;
                }
                lowerRow++;
                lowerCol--;
            }
            return true;
        }
        public void solve(int col,int n, char[][]board,List<List<String>>ans){
            if(col==n){
                List<String>ds=new ArrayList<>();
                for(int i=0;i<n;i++){
                    ds.add(new String(board[i]));
                }
                ans.add(ds);
                return;
            }
            for(int row=0;row<n;row++){
                if(isSafe(row,col,n,board)){
                    board[row][col]='Q';
                    solve(col+1,n,board,ans);
                    board[row][col]='.';
                }
            }
        }
        public List<List<String>> solveNQueens(int n) {
            List<List<String>>ans = new ArrayList<>();
            char[][]arr = new char[n][n];
            for(int i=0;i<n;i++){
                Arrays.fill(arr[i],'.');
            }
            solve(0,n,arr,ans);
            return ans;
        }
    }
}
