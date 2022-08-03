class Solution {
    public void rotate(int[][] matrix) {
        Stack<Integer> stack=new Stack<>();
        for(int[] i:matrix){
            for(int j: i){
                System.out.print(j);
                stack.push(j);
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=matrix.length-1;j>=0;j--){
                matrix[j][i]=stack.pop();
            }
        }
    }
}