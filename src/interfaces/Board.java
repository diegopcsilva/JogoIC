package interfaces;

public class Board {

	private int board[][] = new int[22][22];
	
	public Board() {
			
			for(int i=0;i<22;i++){
				
				for(int j=0;j<22;j++){
					board[i][j]=0;
					if (i==0 ) board[i][j]=1;
					if (i==21) board[i][j]=1;
					if (j==0 ) board[i][j]=1;
					if (j==21) board[i][j]=1;
				}
			}
			
		}
	
	@SuppressWarnings("unused")
	private boolean isEmptyBoard(int linha, int coluna, int[][] board){
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if(board[i][j] == board[linha][coluna]){
					if(board[i][j] != 0){
						return false;
					}					
				}
			}
		}
		return true;
	}
	
	public int lookDownFor1(int ii,int jj){
		for (int i = ii; i < board.length; i++) {
		//	for (int j = jj; j < board.length; j++) {
				if(board[i][jj] == 1 || board[i][jj] == 3){
					if(board[i][jj] == 3) return i-ii;
					return i-ii-1;				
			}
		}
		return 0;	
	}
	public int lookLeftFor1(int ii,int jj){
		//System.out.println("lookleft ii e jj "+ii+" "+jj);
		for (int j = jj; j > 0; j--) {
			//System.out.println("x y"+ii+" "+j);
			//System.out.println("lookleft jj q vioru j e j-- "+j);
		//	for (int j = jj; j < board.length; j++) {
				if(board[ii][j] == 1 || board[ii][j] == 3){
					//System.out.println("Bingo lookleft ii e jj ");
					if(board[ii][j] == 3) return jj-j;
					return jj-j-1;				
			}
		}
		return jj-1;	
	}
	public int lookRightFor1(int ii,int jj){
		for (int j = jj; j < board.length; j++) {
		//	for (int j = jj; j < board.length; j++) {
				if(board[ii][j] == 1 || board[ii][j] == 3){ 
					if(board[ii][j] == 3) return j-jj;
					return j-jj-1;
				}	
				//if(board[ii][j] == 3) return j-jj+1;
		}
		return 0;	
	}
	public int retornaY1(int i){
		
			for (int j = 1; j < board.length; j++) {
				if(board[i][j] == 1){
					return j;				
				}
			}
		
		return 0;	
	}
	
	public int retornaY1esq(int i){
		
		for (int j = board.length; j < 1; j--) {
			if(board[i][j] == 1){
				return j;				
			}
		}
	
	return 0;	
}
	public int retornaX2(){
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if(board[i][j] == 2){
					return i;				
				}
			}
		}
		return 0;	
	}
	
	public int retornaX3(){
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if(board[i][j] == 3){
					return i;				
				}
			}
		}
		return 0;	
	}
	
	public int retornaY2(){
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if(board[i][j] == 2){
					return j;				
				}
			}
		}
		return 0;	
	}
	
	public int retornaY3(){
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if(board[i][j] == 3){
					return j;				
				}
			}
		}
		return 0;	
	}
	
	public void move(int x,int y){
		board[x][y]=2;
	}
	public void clean(int x,int y){
		board[x][y]=0;
	}
	
	public void destino(int x,int y){
		board[x][y]=3;
	}
	public boolean destinoReached(int x,int y){
		if(board[x][y]==3) return true;
		else return false;
		
	}
	public void setObstaculo(int x,int y){
		board[x][y]=1;
		board[x][y+1]=1;
		board[x][y+2]=1;
		board[x][y+3]=1;
		board[x][y+4]=1;
		board[x][y+5]=1;
	}
	public int[][] getBoard() {
		return board;
	}
	public void setBoard(int[][] board) {
		this.board = board;
	}

	public void reset() {
		for(int i=0;i<3;i++){
			
			for(int j=0;j<3;j++){
				board[i][j]=0;	
			}
		}
	}
	public void playerView(){
		for(int i=0;i<22;i++){

			for(int j=0;j<22;j++){
				if (j==21) System.out.printf("%d|\n",board[i][j]);
				else{
					if(board[i][j]==3)  System.out.printf("  ",board[i][j]);
					if(board[i][j]==0)  System.out.printf("  ",board[i][j]);
					if(board[i][j]==1) System.out.printf("%d ",board[i][j]);
					if(board[i][j]==8) System.out.printf("3 ",board[i][j]);
					if(board[i][j]==2) System.out.printf("%d ",board[i][j]);
				}
			}
		}
	}

	public void saida(){
		int x=0;
		int y=0;
		for(int i=0;i<22;i++){
			for(int j=0;j<22;j++){
				if(board[i][j]==3){
					//System.out.printf("",board[i][j]);
					board[i+1][j]=8;
					x=i;
					y=j;
					board[i][j]=0;
				}
			}
		}
		board[x][y]=3;
	}
	public boolean linhaDoFim() {
		if (retornaX2()==retornaX3() ) return true;
		return false;
	}	
			
			
			
}
