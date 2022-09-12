class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int l=0,r=tokens.length-1,score=0,max=0;
        while(l<=r){
            if(power>=tokens[l]){
                power-=tokens[l++];
                score++;
                max=Math.max(max,score);
            }
            else if(score>0){
                score--;
                power+=tokens[r--];
            }
            else
                break;
        }
        return max;
    }
}