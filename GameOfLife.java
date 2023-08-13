class GameOfLife( {
    public void gameOfLife(int[][] board) {
        int row = board.length;
        int col = board[0].length;
        int[][] nextBoard = new int[row][col]; // Create a new array to store the next state
        
        int[][] directions = {
            {-1, -1}, {-1, 0}, {-1, 1},
            {0, -1},           {0, 1},
            {1, -1}, {1, 0}, {1, 1}
        };
        
        // Loop through each cell in the board
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int liveNeighbors = 0;
                
                // Count the number of live neighbors around the current cell
                for (int[] dir : directions) {
                    int x = i + dir[0];
                    int y = j + dir[1];
                    if (x >= 0 && x < row && y >= 0 && y < col && board[x][y] == 1) {
                        liveNeighbors++;
                    }
                }
                
                // Apply the rules of the game to update the next state
                if (board[i][j] == 1) {
                    if (liveNeighbors < 2 || liveNeighbors > 3) {
                        nextBoard[i][j] = 0; // Cell dies due to under-population or over-population
                    } else {
                        nextBoard[i][j] = 1; // Cell survives
                    }
                } else {
                    if (liveNeighbors == 3) {
                        nextBoard[i][j] = 1; // Cell becomes alive due to reproduction
                    }
                }
            }
        }
        
        // Copy the next state back to the original board
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                board[i][j] = nextBoard[i][j];
            }
        }
    }
}
