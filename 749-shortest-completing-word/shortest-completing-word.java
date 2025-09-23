class Solution {
    public String shortestCompletingWord(String li, String[] words) {
        HashMap<Character,Integer> map = new HashMap<>();
        li = li.toLowerCase();
        
        // build frequency map for license plate
        for(char c : li.toCharArray()){
            if(Character.isLetter(c)){
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }

        String ans = null;
        for(String s : words){
            if(is_done(s.toLowerCase(), map)){
                if(ans == null || s.length() < ans.length()){
                    ans = s;
                }
            }
        }
        return ans;
    }

    public boolean is_done(String word, HashMap<Character,Integer> map){
        HashMap<Character,Integer> freq = new HashMap<>();
        for(char c : word.toCharArray()){
            freq.put(c, freq.getOrDefault(c,0)+1);
        }

        for(char key : map.keySet()){
            if(freq.getOrDefault(key,0) < map.get(key)){
                return false;
            }
        }
        return true;
    }
}
