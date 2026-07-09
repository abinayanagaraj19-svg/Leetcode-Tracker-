// Last updated: 09/07/2026, 15:08:08
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer>Stack=new Stack<>();
        int[]ret=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            while(!Stack.isEmpty()&& temperatures[i]>temperatures[Stack.peek()]){
                int idx=Stack.pop();
                ret[idx]=i-idx;
            }
            Stack.push(i);
        }
        return ret;



        
    }
}