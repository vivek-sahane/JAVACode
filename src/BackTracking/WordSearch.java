package BackTracking;

public class WordSearch {

    public boolean print(int sr, int sc, char[][]board, String word, boolean[][]isVisited, int index){
        if(index==word.length())return true;
        if(sr<0 || sc<0 || sr >=board.length || sc >=board[0].length || isVisited[sr][sc] || board[sr][sc] !=word.charAt(index))
            return false;

        isVisited[sr][sc]=true;
        boolean found = print(sr+1,sc,board,word,isVisited,index+1) ||
                        print(sr,sc+1,board,word,isVisited,index+1) ||
                        print(sr-1,sc,board,word,isVisited,index+1) ||
                        print(sr,sc-1,board,word,isVisited,index+1) ;
                isVisited[sr][sc]=false;
        return found;
    }

    public boolean exist(char[][]board, String word){
        int n=board.length;
        int m=board[0].length;
        boolean [][]isVisited=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(print(i,j,board,word,isVisited,0))
                    return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {


    }
}
