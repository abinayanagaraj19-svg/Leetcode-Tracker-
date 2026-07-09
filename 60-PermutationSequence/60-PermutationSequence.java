// Last updated: 09/07/2026, 15:10:18
class Solution {
    int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++)f*=i;
            return f;
    }
    
    public String getPermutation(int n, int k) {
        List<Integer> arr=new ArrayList<>();
        for(int i=1;i<=n;i++)arr.add(i);
        k-=1;
        k%=fact(n);
        String s="";
        for(int i=0;i<n;i++){
            int f=fact(n-(i+1));
            int r=k/f;
            s=s+arr.get(r);
            arr.remove(r);
            System.out.println(s+" "+k+" "+f);
            k%=f;
            if(arr.size()==1){
                s=s+arr.get(0);
                break;
            }
        }
        return s;

        
    }
}