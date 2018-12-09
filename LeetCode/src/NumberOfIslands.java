
public class NumberOfIslands {
	
	    public int numIslands(char[][] grid) {
	        if(grid.length <= 0)
	            return 0;
	        int count = 0;
	        for(int i=0; i<grid.length; i++){
	            for(int j=0; j<grid[0].length; j++){
	                if(grid[i][j] == '1'){
	                    grid[i][j] = '2';
	                    traverse(grid, i, j);
	                    ++count;
	                }
	            }
	        }
	        
	        return count;
	    }
	    
	    public void traverse(char[][] grid, int i, int j){
	        //up
	        if(i > 0 && grid[i-1][j] == '1'){
	            grid[i-1][j] = '2';
	            traverse(grid, i-1, j);
	        }
	        //down
	        if(i < grid.length - 1 && grid[i+1][j] == '1'){
	            grid[i+1][j] = '2';
	            traverse(grid, i+1, j);
	        }
	        //left
	        if(j > 0 && grid[i][j-1] == '1'){
	            grid[i][j-1] = '2';
	            traverse(grid, i, j-1);
	        }
	        //right
	        if(j < grid[0].length - 1 && grid[i][j+1] == '1'){
	            grid[i][j+1] = '2';
	            traverse(grid, i, j+1);
	        }
	    }

}
