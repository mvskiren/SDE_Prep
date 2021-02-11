Lets say we have an array of strings str[]= [flight, flower,flair,flat,flaw]

Longest prefix would be finialized by string with shortest length in the array.
(Sort Array to get the string with shortest length)

Take the shortest string and compare it with the longest string in the array i.e last one in the array.
(We dont need to care about inbetween strings as the last string would be suffice to check prefix)

Step1 : Sort the array - final array looks like - [flat,flair,flaw,flight,flower]

Step 2: Consider the first string in the array i.e (flat) and compare it with last string in the array (flower) (** flat ---> flower** ( longest prefix would be fl ) )


/*************************************************************************************************************************************************************************************/




class Solution {
    public String longestCommonPrefix(String[] strs) {
       String arr[]=strs;
        if(arr.length==0 || arr == null) return "";
        Arrays.sort(arr);
        String res = "";
        int len = arr[0].length();
        int i=0;
        while(true) 
		{
            if(i<len && arr[0].charAt(i)== arr[arr.length-1].charAt(i))  i++;
            else break;  
         }
        return arr[0].substring(0,i);    
    }
}
Time complexity: O(M *n* logn); 