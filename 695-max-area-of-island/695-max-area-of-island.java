class Solution {
    int maxarea=0;
    int currentarea=0;
    int imax=0;
    int jmax=0;
    public void updateArea(int i, int j, int[][] grid){
        if(grid[i][j]==1){
            grid[i][j]=-1;
            currentarea++;
        }
        else
            return;
        if(i+1<=imax)
            updateArea(i+1,j,grid);
        if(j+1<=jmax)
            updateArea(i,j+1,grid);
        if(j-1>=0)
            updateArea(i,j-1,grid);
        if(i-1>=0)
            updateArea(i-1,j,grid);
    }
    public int maxAreaOfIsland(int[][] grid) {
        imax=grid.length-1;
        jmax=grid[0].length-1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1)
                    updateArea(i,j,grid);
                maxarea=Math.max(maxarea,currentarea);
                currentarea=0;
            }
        }
        return maxarea;
    }
}