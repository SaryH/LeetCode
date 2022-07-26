class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new LinkedList<>();
        for(int i=0;i<numRows;i++){
            list.add(new LinkedList<>());
                for(int j=0;j<i+1;j++){
                    if(j>0 && j<i){
                        int x=list.get(i-1).get(j)+list.get(i-1).get(j-1);
                        list.get(i).add(x);
                    }
                    else
                        list.get(i).add(1);
                }
        }
        return list;
    }
}