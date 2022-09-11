class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int[][] temp=new int[n][2];
        for(int i=0;i<n;i++){
            temp[i]=new int[] {efficiency[i],speed[i]};
        }
        Arrays.sort(temp,(a,b) -> b[0]-a[0]);
        PriorityQueue<Integer> pq=new PriorityQueue<>(k,(a,b)->a-b);
        long res=0,sum=0;
        for(int[] x:temp){
            pq.add(x[1]);
            sum+=x[1];
            if(pq.size()>k)
                sum-=pq.poll();
            res=Math.max(res,(sum*x[0]));
        }
        return (int)(res%(long)(1e9+7));
    }
}