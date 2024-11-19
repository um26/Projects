import java.util.LinkedList;
import java.util.Queue;

public class Main{

  static int[][] maze = {
    {0,1,0,0,0},
    {0,1,0,1,0},
    {0,0,0,1,0},
    {0,1,0,0,1},
    {0,0,0,1,0}
  };

  public static void main(String[] args){
    //printMaze();

    int startX=0,startY=0,endX=4,endY=4;

    boolean BFSpathExists = bfs(startX, startY, endX, endY);
    System.out.println("Path found using BFS:" + BFSpathExists);

    boolean[][] visited = new boolean[maze.length][maze[0].length];
    boolean DFSpathExists = dfs(startX, startY, endX, endY, visited);
    System.out.println("Path found using DFS:" + DFSpathExists);}

  public static void printMaze(){
    for(int[] row : maze){
      for(int cell : row){
        System.out.print(cell + "");
      }
      System.out.println();
    }
  }

  public static boolean isSafe(int x, int y){
    return x>=0 && x<maze.length && y>=0 && y<maze[0].length && maze[x][y]==0;
  }

  public static boolean bfs(int startX, int startY, int endX, int endY){
    Queue<int[]> queue = new LinkedList<>();
    boolean[][] visited = new boolean[maze.length][maze[0].length];
    queue.add(new int[]{startX, startY});
    visited[startX][startY] = true;

    while(!queue.isEmpty()){
      int[] current = queue.poll();
      int x = current[0];
      int y = current[1];

      if (x==endX && y==endY){
        return true;
      }

      int [][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
      for(int[] direction : directions){
        int newX = x + direction[0];
        int newY = y + direction[1];

        if(isSafe(newX, newY) && !visited[newX][newY]){
          queue.add(new int[]{newX, newY});
          visited[newX][newY] = true;  
        }
      }

    }

    return false;
  }

  public static boolean dfs(int x, int y, int endX, int endY,boolean visited[][]){

    if (!isSafe(x,y) || visited[x][y]){
      return false;
    }

    visited[x][y] = true;

    if(x== endX && y==endY){
      return true;
    }

    int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};
    for(int[] direction : directions){
      int newX = x + direction[0];
      int newY = y + direction[1];

      if(dfs(newX, newY, endX, endY, visited)){

        return true;
      }
    }

    visited[x][y] = false;

    return false;
  }
  
}
