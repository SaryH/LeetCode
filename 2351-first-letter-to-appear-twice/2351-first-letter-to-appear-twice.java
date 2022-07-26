class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        char res=' ';
        for(char c:s.toCharArray()){
            if(!map.containsKey(c))
                map.put(c,1);
            else{
                res=c;
                break;
            }
        }
        return res;
    }
}