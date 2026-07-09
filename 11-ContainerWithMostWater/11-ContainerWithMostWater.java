// Last updated: 09/07/2026, 15:10:56
import java.util.*;
class Solution {
    public int maxArea(int[] height) {
        Scanner sc=new Scanner(System.in);
        int start=0;
        int end =height.length-1;
        int maxarea=0;
        while( start< end){
            int l=Math.min(height[start],height[end]);
            int w=Math.abs(start-end);
            int area=l*w;
            maxarea=Math.max(maxarea,area);
            if (height[start]<height[end]){
                start++;
            }else{
                end--;
            }
        }
        return maxarea;
    }
}