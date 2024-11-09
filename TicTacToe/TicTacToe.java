import java.util.Scanner;

public class TicTacToe{

  private static char[][] board = new char[3][3];

  public static void main(String[] args){
    initializeBoard();
    playGame();
  }

  public static void initializeBoard(){
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        board[i][j] = '-';
      }
    }
  }

  public static void playGame(){
    boolean playerX = true;
    boolean gameEnded = false;

    while(!gameEnded){
      printBoard();
      char currentPlayer = playerX ? 'X' : 'O';
      System.out.println("Player " + currentPlayer + " enter your move (row and column):");
      int row = getInput(" Row");
      int col = getInput(" Column");

      if(board[row][col] == '-'){
        board[row][col] = currentPlayer;

        if (checkWin(currentPlayer)){
          System.out.println("Player " + currentPlayer + " wins!");
          gameEnded = true;
        }
        else if (checkDraw()){
          System.out.println("The game is Draw!");
          gameEnded = true;
        }
        else{
          playerX = !playerX;
        }
      }
      else{
        System.out.println("This cell is already Occupied. Please try again. ");
      }
    }
    printBoard();
  }

  public static void printBoard(){
    for(int i =0; i<3;i++){
      for(int j=0;j<3;j++){
        System.out.print(board[i][j] + "");
      }
      System.out.println();
    }
  }

  public static int getInput(String coordinate){
    Scanner scanner = new Scanner(System.in);
    int value = -1;
    while( value <0 || value>2){
      System.out.print("Enter " + coordinate + " (0, 1 or 2:");
      value = scanner.nextInt();
      if(value<0 || value>2){
        System.out.println(" Invalid input! Please enter a number between 0 and 2.");
      }
    }
    return value;
  }

  public static boolean checkWin(char player){
    for ( int i =0;i<3;i++){
      if(board[i][0]==player && board[i][1]== player && board[i][2]== player) return true;
      if(board[0][i]==player && board[1][i] == player && board[2][i]== player) return true;
    }

    if( board[0][0] == player && board[1][1] == player && board[2][2] == player) return true;
    if( board[2][0] == player && board[1][1] == player && board[0][2]== player) return true;
    return false;
  }

  public static boolean checkDraw(){
    for(int i =0;i<3;i++){
      for(int j=0;j<3;j++){
        if(board[i][j] == '-'){
          return false;
        }
      }
    }
    return true;
  }
}
