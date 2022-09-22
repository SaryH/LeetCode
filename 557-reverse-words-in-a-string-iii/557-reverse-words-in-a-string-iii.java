class Solution {
    public String rev(String s){
        String res="";
        for(int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }
        return res;
    }
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        String res="";
        int counter=0;
        for(String word:words){
            counter++;
            res+=rev(word);
            if(counter!=words.length)
                res+=" ";
        }
        return res;
    }
}