class Solution {
public int strStr(String haystack, String needle) {
 
        String s1=haystack;
	     String s2=needle;
        if(s2.length() == 0) return 0;
            
       if(s2.length()> s1.length()) return -1;
        int j=0;
        int firstIndex=-1;
      for(int i=0;i<s1.length();i++){
          if(s1.charAt(i)==s2.charAt(j))
          {
              if(firstIndex==-1) firstIndex=i;
              j++;
          }
          else {
              i=i-j;
               j=0; 
              firstIndex=-1;
          }
          if(j==s2.length()) return firstIndex;
      }
    
    return -1;
    
    
}
}

Time complexity: O(n*m) wrost case;
Space : 0(1); //No extra space required;