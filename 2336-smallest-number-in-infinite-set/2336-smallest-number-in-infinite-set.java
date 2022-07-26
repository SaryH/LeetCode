class SmallestInfiniteSet {
    boolean[] temp;
    public SmallestInfiniteSet() {
        temp=new boolean[1001];
        Arrays.fill(temp,true);
    }
    
    public int popSmallest() {
        for(int i=1;i<2000;i++){
            if(temp[i]){
                temp[i]=false;
                return i;
            }
        }
        return 0;
    }
    
    public void addBack(int num) {
        temp[num]=true;
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */