// Last updated: 25/09/2026, 09:37:18
1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3        
4        HashMap<Integer, Integer> map = new HashMap<>();
5        
6        for (int i = 0; i < nums.length; i++) {
7            
8            if (map.containsKey(nums[i])) {
9                int previousIndex = map.get(nums[i]);
10                
11                if (i - previousIndex <= k) {
12                    return true;
13                }
14            }
15            
16            map.put(nums[i], i);
17        }
18        
19        return false;
20    }
21}