class Solution {
    int[][] graph;
    int mod=2000000000;
    public int uniquePaths(int m, int n) {
        graph=new int[m][n];
        Arrays.fill(graph[m-1],1);
        for(int i=0;i<m;i++){
            graph[i][n-1]=1;
        }
        for(int i=m-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                graph[i][j]=graph[i+1][j]+graph[i][j+1];
            }
        }
        return (int)graph[0][0]%mod;
    }
}