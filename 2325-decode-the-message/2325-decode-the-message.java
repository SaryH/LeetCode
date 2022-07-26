class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> hashmap=new HashMap<Character,Character>();
        char temp='a';
        hashmap.put(' ',' ');
        for(char c:key.toCharArray()){
            if(!hashmap.containsKey(c)){
                hashmap.put(c,temp++);
            }
        }
        String result="";
        for(char c:message.toCharArray()){
            result+=hashmap.get(c);
        }
        return result;
    }
}