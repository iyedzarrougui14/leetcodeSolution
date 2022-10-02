class Solution {
    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) {
        return 0;
    }
        int[] previous = previousSmaller(heights);
        int[] next = nextSmaller(heights);
        int Max = 0;
        for(int i = 0 ; i < heights.length ; i++){
            int curr = (next[i]-previous[i]-1)*heights[i];
            Max = Math.max(Max , curr);
        }
        return Max;
    }
    public  int[] previousSmaller(int[] a){
        int[] ps = new int[a.length];
        Stack<Integer> s = new Stack<Integer>();
        for(int i = 0 ; i < a.length ; i++){
            while(!s.isEmpty() && a[s.peek()]>=a[i] ){
                s.pop();
            }
            if(s.isEmpty()){
                ps[i] = -1;
            }else{
                ps[i] = s.peek();
            }
            s.push(i);
        }
        return ps;
    }
    
        public int[] nextSmaller(int[] a){
        int[] ns = new int[a.length];
        Stack<Integer> s = new Stack<Integer>();
        for(int i = a.length-1 ; i >= 0 ; i--){
            while(!s.isEmpty() && a[s.peek()]>=a[i] ){
                s.pop();
            }
            if(s.isEmpty()){
                ns[i] = a.length;
            }else{
                ns[i] = s.peek();
            }
            s.push(i);
        }
            return ns;
    }
}