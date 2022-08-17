class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] mors={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<Character,String> map=new HashMap<>();
        char temp='a';
        for(String x:mors){
            map.put(temp++,x);
        }
        int res=0;
        HashSet<String> set=new HashSet<>();
        for(String word:words){
            String trans="";
            for(char x:word.toCharArray()){
                trans+=map.get(x);
            }
            if(!set.contains(trans)){
                set.add(trans);
                res++;
            }
        }
        return res;
    }
}