package PIECE;

public class Queen extends Piece implements color {
	   
	   Piece p = new Piece();
	   
	   public int[][] pMoves (int[][] state, int y, int x, int color){
	      
	      int arr[][] = new int[8][8];
	      int prey, prex, i, j;
	      
	      prey = y;
	      prex = x;
	      
	      //위
	      y = prey-1;
	      while(!out(y, x)) {
	         if(hPiece(state, y, x) == 0) arr[y][x] = 1;
	         else if(enemy(state, prey, prex, y, x) == 1) {
	            arr[y][x] = 1;
	            break;
	         }
	         else break;
	         
	         
	         y--;
	      }
	      
	      //아래
	      y=prey+1;
	      while(!out(y, x)) {
	         if(hPiece(state, y, x) == 0) arr[y][x] = 1;
	         else if(enemy(state, prey, prex, y, x) == 1) {
	            arr[y][x] = 1;
	            break;
	         }
	         else break;
	         
	         y++;
	      }
	      
	      //오른쪽
	      x = prex+1;
	      y = prey;
	      while(!out(y, x)) {
	         if(hPiece(state, y, x) == 0) arr[y][x] = 1;
	         else if(enemy(state, prey, prex, y, x) == 1) {
	            arr[y][x] = 1;
	            break;
	         }
	         else break;
	         
	         x++;
	      }
	      
	      //왼쪽
	      x = prex-1;
	      while(!out(y, x)) {
	         if(hPiece(state, y, x) == 0) arr[y][x] = 1;
	         else if(enemy(state, prey, prex, y, x) == 1) {
	            arr[y][x] = 1;
	            break;
	         }
	         else break;
	         
	         x--;
	      }
	      
	      //오른쪽위
	      x = prex+1;
	      y = prey-1;
	      while(!out(y, x)) {
	         if(hPiece(state, y, x) == 0) arr[y][x] = 1;
	         else if(enemy(state, prey, prex, y, x) == 1) {
	            arr[y][x] = 1;
	            break;
	         }
	         else break;
	         
	         x++;
	         y--;
	      }
	      
	      //왼쪽 위
	      x = prex-1;
	      y = prey-1;
	      while(!out(y, x)) {
	         if(hPiece(state, y, x) == 0) arr[y][x] = 1;
	         else if(enemy(state, prey, prex, y, x) == 1) {
	            arr[y][x] = 1;
	            break;
	         }
	         else break;
	         
	         x--;
	         y--;
	      }
	      
	      //오른쪽 아래
	      x = prex+1;
	      y = prey+1;
	      while(!out(y, x)) {
	         if(hPiece(state, y, x) == 0) arr[y][x] = 1;
	         else if(enemy(state, prey, prex, y, x) == 1) {
	            arr[y][x] = 1;
	            break;
	         }
	         else break;
	         
	         x++;
	         y++;
	      }
	      
	      //왼쪽 아래
	      x = prex-1;
	      y = prey+1;
	      while(!out(y, x)) {
	         if(hPiece(state, y, x) == 0) arr[y][x] = 1;
	         else if(enemy(state, prey, prex, y, x) == 1) {
	            arr[y][x] = 1;
	            break;
	         }
	         else break;
	         
	         x--;
	         y++;
	      }
	      
	      return arr;   
	   }
	   
	public int[][] pMoves2 (int[][] state, int y, int x, int color){
	      
	      int arr[][] = new int[14][14];
	      int prey, prex, i, j;
	      
	      prey = y;
	      prex = x;
	      
	      //위
	      y = prey-1;
	      while(!out2(y, x)) {
	         if(hPiece(state, y, x) == 0) arr[y][x] = 1;
	         else if(enemy2(state, prey, prex, y, x) == 1) {
	            arr[y][x] = 1;
	            break;
	         }
	         else break;
	         
	         
	         y--;
	      }
	      
	      //아래
	      y=prey+1;
	      while(!out2(y, x)) {
	         if(hPiece(state, y, x) == 0) arr[y][x] = 1;
	         else if(enemy2(state, prey, prex, y, x) == 1) {
	            arr[y][x] = 1;
	            break;
	         }
	         else break;
	         
	         y++;
	      }
	      
	      //오른쪽
	      x = prex+1;
	      y = prey;
	      while(!out2(y, x)) {
	         if(hPiece(state, y, x) == 0) arr[y][x] = 1;
	         else if(enemy2(state, prey, prex, y, x) == 1) {
	            arr[y][x] = 1;
	            break;
	         }
	         else break;
	         
	         x++;
	      }
	      
	      //왼쪽
	      x = prex-1;
	      while(!out2(y, x)) {
	         if(hPiece(state, y, x) == 0) arr[y][x] = 1;
	         else if(enemy2(state, prey, prex, y, x) == 1) {
	            arr[y][x] = 1;
	            break;
	         }
	         else break;
	         
	         x--;
	      }
	      
	      //오른쪽위
	      x = prex+1;
	      y = prey-1;
	      while(!out2(y, x)) {
	         if(hPiece(state, y, x) == 0) arr[y][x] = 1;
	         else if(enemy2(state, prey, prex, y, x) == 1) {
	            arr[y][x] = 1;
	            break;
	         }
	         else break;
	         
	         x++;
	         y--;
	      }
	      
	      //왼쪽 위
	      x = prex-1;
	      y = prey-1;
	      while(!out2(y, x)) {
	         if(hPiece(state, y, x) == 0) arr[y][x] = 1;
	         else if(enemy2(state, prey, prex, y, x) == 1) {
	            arr[y][x] = 1;
	            break;
	         }
	         else break;
	         
	         x--;
	         y--;
	      }
	      
	      //오른쪽 아래
	      x = prex+1;
	      y = prey+1;
	      while(!out2(y, x)) {
	         if(hPiece(state, y, x) == 0) arr[y][x] = 1;
	         else if(enemy2(state, prey, prex, y, x) == 1) {
	            arr[y][x] = 1;
	            break;
	         }
	         else break;
	         
	         x++;
	         y++;
	      }
	      
	      //왼쪽 아래
	      x = prex-1;
	      y = prey+1;
	      while(!out2(y, x)) {
	         if(hPiece(state, y, x) == 0) arr[y][x] = 1;
	         else if(enemy2(state, prey, prex, y, x) == 1) {
	            arr[y][x] = 1;
	            break;
	         }
	         else break;
	         
	         x--;
	         y++;
	      }
	      
	      return arr;   
	   }

}
