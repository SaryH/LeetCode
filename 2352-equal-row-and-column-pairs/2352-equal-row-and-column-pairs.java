class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String,Integer> map=new HashMap<>();
        int n=grid.length;
        int res=0;
        for(int i=0;i<n;i++){
            String temp="";
            for(int j=0;j<n;j++){
                temp+=grid[i][j];
                temp+="/";
            }
            if(!map.containsKey(temp))
                map.put(temp,1);
            else
                map.put(temp,map.get(temp)+1);
        }
        for(int i=0;i<n;i++){
            String test="";
            for(int j=0;j<n;j++){
                test+=grid[j][i];
                test+="/";
            }
            if(map.containsKey(test))
                res+=map.get(test);
        }
        return res;
    }
}