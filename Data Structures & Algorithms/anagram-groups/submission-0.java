class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> myMap = new HashMap<>();
        for (String curr : strs){
        int[] count = new int[26];

           for (int i=0; i<curr.length(); i++){
            char myC = curr.charAt(i);
            count[myC-'a']++;
           }
          myMap.putIfAbsent((Arrays.toString(count)),new ArrayList<>());
          myMap.get((Arrays.toString(count))).add(curr);

        }
                return new ArrayList<>(myMap.values());


    }
}
