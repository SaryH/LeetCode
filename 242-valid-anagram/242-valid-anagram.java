class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            if(!map.containsKey(c))
                map.put(c,1);
            else
                map.put(c,map.get(c)+1);
        }
        for(char c:t.toCharArray()){
            if(!map.containsKey(c))
                return false;
            else if(map.get(c)>0)
                map.put(c,map.get(c)-1);
            else
                return false;
        }
        return s.length()==t.length();
    }
}