class Solution {
    public int minSetSize(int[] arr) {
        int min=arr.length/2;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i: arr){
            if(!map.containsKey(i))
                map.put(i,1);
            else
                map.put(i,map.get(i)+1);
        }
        PriorityQueue<Integer> q=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i:map.keySet()){
            q.offer(map.get(i));
        }
        int res=1;
        int newsize=arr.length-q.remove();
        while(newsize>min){
            res++;
            newsize-=q.remove();
        }
        return res;
    }
}