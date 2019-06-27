class Solution {
    public void solve(char[][] board) {
		if((board==null)||board.length==0||board[0].length==0)
			return;
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				if ((row == 0) || (row == board.length - 1) || (col == 0) || (col == board[0].length - 1)) {
					if (board[row][col] == 'O') {
						color(board, row, col);
					}
				}
			}
		}

		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {

				if (board[row][col] == 'O') {
					board[row][col] = 'X';
				}
				if (board[row][col] == 'V') {
					board[row][col] = 'O';
				}
			}
		}
	}

	private void color(char[][] board, int row, int col) {
		board[row][col] = 'V';
		if (row + 1 < board.length) {
			if (board[row + 1][col] == 'O') {
				color(board, row + 1, col);
			}
		}
		if (row - 1 >= 0) {
			if (board[row - 1][col] == 'O') {
				color(board, row - 1, col);
			}
		}
		if (col + 1 < board[0].length) {
			if (board[row][col + 1] == 'O') {
				color(board, row, col + 1);
			}
		}
		if (col - 1 >= 0) {
			if (board[row][col - 1] == 'O') {
				color(board, row, col - 1);
			}
		}
	}
}
