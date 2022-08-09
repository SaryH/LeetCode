class Solution {
    int mod=1000000007;
    public int numFactoredBinaryTrees(int[] arr) {
        int size=arr.length;
        Arrays.sort(arr);
        long[] dp=new long[size];
        Arrays.fill(dp,1);
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<size;i++){
            map.put(arr[i],i);
        }
        
        for(int i=0;i<size;i++){
            for(int j=0;j<i;j++){
                if(arr[i]%arr[j]==0){
                    int r=arr[i]/arr[j];
                    if(map.containsKey(r))
                        dp[i]=(dp[i]+dp[j]*dp[map.get(r)])%mod;
                }
            }
        }
        
        long res=0;
        for(long temp:dp){
            res+=temp;
        }
        return (int)(res%mod);
    }
}