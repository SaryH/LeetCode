class Solution {
    public int maxCoins(int[] piles) {
        int coins=0;
        LinkedList<Integer> list=new LinkedList<>();
        for(int i:piles){
            list.add(i);
        }
        Collections.sort(list);
        while(!list.isEmpty()){
            list.removeLast();
            coins+=list.removeLast();
            list.removeFirst();

        }
        return coins;
    }
}