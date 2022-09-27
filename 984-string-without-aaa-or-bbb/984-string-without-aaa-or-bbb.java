class Solution {
    public String strWithout3a3b(int A, int B) {
        StringBuilder ans = new StringBuilder();
        
        while (A > 0 || B > 0)
        {
            boolean writeA = false;
            int l = ans.length();
            if (l >= 2 && ans.charAt(l-1) == ans.charAt(l-2))
            {
                if (ans.charAt(l-1) == 'b')
                    writeA = true;
            } else {
                if (A >= B)
                    writeA = true;
            }
            if (writeA){
                A--;
                ans.append('a');
            }
            else {
                B--;
                ans.append('b');
            }
        }
        return ans.toString();
        
    }
}