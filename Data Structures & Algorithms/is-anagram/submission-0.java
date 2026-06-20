class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> s_letters = new HashMap<>();
        Map<Character, Integer> t_letters = new HashMap<>();

        for (char curr : s.toCharArray()){
            s_letters.put(curr,s_letters.getOrDefault(curr, 0) + 1);
        }

        for (char curr : t.toCharArray()){
            t_letters.put(curr,t_letters.getOrDefault(curr, 0) + 1);
        }
        return t_letters.equals(s_letters);
    }
}
