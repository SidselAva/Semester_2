package hjemmearbejde;

public class MazeSolver {
    
    private Maze maze;
    
    public MazeSolver(Maze maze) {
        this.maze = maze;
    }
    
    public boolean traverse(int row, int column) {
        boolean done = false;
        
        if (maze.validPosition(row,column)) {
            maze.tryPosition(row, column);
            if (row == maze.getRows()-1 && column == maze.getColumns()-1) {
                done = true;
            }
            else {
                // down
                done = traverse(row+1,column);
                if (!done) {
                    // right
                    done = traverse(row,column+1);
                } if (!done) {
                    // up
                    done = traverse(row-1,column);
                } if (!done) {
                    // left
                    done = traverse(row,column-1);
                }
                if (done) {
                    maze.markPath(row,column);
                }
            }
        }
        return done;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
