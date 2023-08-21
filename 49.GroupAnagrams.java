class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s: strs){
            char[] ca= new char[26];
            for(char c: s.toCharArray()){
                ca[c-'a']++;
            }
            String k= String.valueOf(ca);
            if(!map.containsKey(k)){
                map.put(k,new ArrayList<>());
            }
            map.get(k).add(s);

        }
        return new ArrayList<>(map.values());
    }
}
