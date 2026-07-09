// Last updated: 09/07/2026, 15:10:27
import java .util.*;
class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int water=0;
        int larr[]=new int[n];
        int rarr[]=new int[n];
        int max=height[0];
        for(int i =0;i<n;i++){
            if (max<height[i]){
                max=height[i];
              
            }
            larr[i]=max;
        }
        int ans=0;
        max=height[n-1];
        for(int i=n-1;i>=0;i--){
            if (max<height[i])max=height[i];
                
                rarr[i]=Math.min(max,larr[i]);
                ans+=Math.abs(rarr[i]-height[i]);

            
    
        }
        return ans;
        
    }
}