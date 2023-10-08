package Backtracking;
import java.util.*;
public class N_Queens_for_Attacking_Position {
    public static boolean issafe(char board[][],int row,int col){
        // Vertical UP
        for(int i=row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        // Diagonal Left UP
        for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        // Diagonal Right UP
        for(int i=row-1,j=col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void nqueens(char board[][],int row){
        // Base Case
        if(row==board.length){
            printboard(board);
            return;
        }
        //Column Loop
        for(int j=0; j<board.length; j++){
           if(issafe(board,row,j)){
            board[row][j]='Q';
            nqueens(board,row+1);  // Function Call
            board[row][j]='X';
           }
        }
    }
    public static void printboard(char board[][]){
        System.out.println("------------CHESS BOARD------------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
        char board[][]= new char[n][n];
        // Initialize
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                board[i][j]='X';

            }
        }
        nqueens(board,0);
    }
    
}
