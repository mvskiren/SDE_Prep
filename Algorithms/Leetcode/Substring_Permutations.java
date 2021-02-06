class Solution {
    public boolean checkInclusion(String s1, String s2) {
        boolean flag=false;
        HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
        HashMap<Character,Integer> hmap_check=new HashMap<Character,Integer>();
      for(int i=0;i<s1.length();i++) hmap.put(s1.charAt(i), hmap.getOrDefault(s1.charAt(i), 0) + 1); 
            for(int i=0;i<s2.length()-s1.length()+1;i++){
               for(int j=i;j<i+s1.length();j++){ 
                  hmap_check.put(s2.charAt(j), hmap_check.getOrDefault(s2.charAt(j), 0) + 1); 
               }
               if(hmap_check.equals(hmap) ) { flag=true; break; }
               else hmap_check.clear(); 
            }
             if(flag) return true;
             else return false;   
    }
}