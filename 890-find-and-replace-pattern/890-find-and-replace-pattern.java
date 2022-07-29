class Solution {
    public boolean check(String word, String pattern){
        HashMap<Character,Character> map=new HashMap<>();
        char temp='a';
        for(char c:word.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c,temp++);
            }
        }
        String res="";
        for(char c:word.toCharArray()) {
            res += map.get(c);
        }
        return res.equals(pattern);
    }
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list=new ArrayList<>();
        String dpattern="";
        HashMap<Character,Character> map=new HashMap<>();
        char temp='a';
        for(char c:pattern.toCharArray()){
            if(!map.containsKey(c))
                map.put(c,temp++);
        }
        for(char c:pattern.toCharArray()) {
            dpattern += map.get(c);
        }
        for(String word:words){
            if(check(word,dpattern))
                list.add(word);
        }
        return list;
    }
}