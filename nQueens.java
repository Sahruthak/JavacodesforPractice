public class Main
{
	public static boolean nQueen(int board[][],int row){
	    if(row==n) return true;
	    for(int col=0;col<n;col++){
	        if(issafe(board,row,col)){
	            board[row][col]=1;
	            if(nQueen(board,row+1))  
	               return true;
	            board[row][col]=0;
	        }
	    }
	    return false;
	}
}
