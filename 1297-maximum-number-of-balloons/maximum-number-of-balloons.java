class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : text.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int min = Integer.MAX_VALUE;
        for(char c : map.keySet()){
            if(!map.containsKey('b') ||
               !map.containsKey('a') ||
               !map.containsKey('l') ||
               !map.containsKey('o') ||
               !map.containsKey('n') )
               {
                return 0;
               }
            if(c=='a'){
                min = Math.min(min,map.get(c)/1);
            }
            if(c=='b'){
                min = Math.min(min,map.get(c)/1);
            }
            if(c=='l'){
                min = Math.min(min,map.get(c)/2);
            }
            if(c=='o'){
                min = Math.min(min,map.get(c)/2);
            }
            if(c=='n'){
                min = Math.min(min,map.get(c)/1);
            }
        }
        return min;
    }
}