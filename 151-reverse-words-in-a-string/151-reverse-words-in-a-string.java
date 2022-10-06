class Solution {
    public String reverseWords(String s) {
        
        String st="";
        int i=s.length()-1;
        while(i>=0){
            
            while(i>=0 && s.charAt(i)==' ') i--;   //handle whitespace '  '
            
            int j=i;
            if(j>=0){
                while(i>=0 && s.charAt(i)!=' ') i--; // handle characters
                st+=s.substring(i+1,j+1)+" ";
            }
     
        }
        
        return st.substring(0,st.length()-1);
    }
}
