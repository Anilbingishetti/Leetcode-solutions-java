class Solution {
    public String stringHash(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('a',0);
        map.put('b',1);
        map.put('c',2);
        map.put('d',3);
        map.put('e',4);
        map.put('f',5);
        map.put('g',6);
        map.put('h',7);
        map.put('i',8);
        map.put('j',9);
        map.put('k',10);
        map.put('l',11);
        map.put('m',12);
        map.put('n',13);
        map.put('o',14);
        map.put('p',15);
        map.put('q',16);
        map.put('r',17);
        map.put('s',18);
        map.put('t',19);
        map.put('u',20);
        map.put('v',21);
        map.put('w',22);
        map.put('x',23);
        map.put('y',24);
        map.put('z',25);
        HashMap<Integer, Character> rev = new HashMap<>();
        rev.put(0, 'a');
        rev.put(1, 'b');
        rev.put(2, 'c');
        rev.put(3, 'd');
        rev.put(4, 'e');
        rev.put(5, 'f');
        rev.put(6, 'g');
        rev.put(7, 'h');
        rev.put(8, 'i');
        rev.put(9, 'j');
        rev.put(10, 'k');
        rev.put(11, 'l');
        rev.put(12, 'm');
        rev.put(13, 'n');
        rev.put(14, 'o');
        rev.put(15, 'p');
        rev.put(16, 'q');
        rev.put(17, 'r');
        rev.put(18, 's');
        rev.put(19, 't');
        rev.put(20, 'u');
        rev.put(21, 'v');
        rev.put(22, 'w');
        rev.put(23, 'x');
        rev.put(24, 'y');
        rev.put(25, 'z');
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i=i+k)
        {
            int cal = 0;
            for(int j=i;j<i+k && j < s.length();j++)
            {
                cal +=map.get(s.charAt(j));
            }
            int x = cal%26;
            sb.append(rev.get(x));
        }
        return sb.toString();
    }
}