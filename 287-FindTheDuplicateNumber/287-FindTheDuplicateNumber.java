// Last updated: 09/07/2026, 15:08:55
class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                return num;
            }
            set.add(num);
        }
        return -1;
    }
}