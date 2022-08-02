class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int[] i:matrix){
            for(int j: i){
                q.offer(j);
            }
        }
        for(int i=0;i<k-1;i++){
            q.remove();
        }
        return q.remove();
    }
}