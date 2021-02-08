class Solution {
    public int lengthOfLongestSubstring(String s) {
   char[] sc = s.toCharArray();
        Set<Character> set = new HashSet();
        int left = 0;
        int res = 0;
        for(int i = 0; i<sc.length; i++){
            while(set.contains(sc[i])){
                set.remove(sc[left]);
                left++;
            }
            set.add(sc[i]);
            res = Math.max(res, set.size());
        }
        return res;
    }
}           