// Last updated: 23/09/2026, 15:22:30
1class Solution {
2    public List<String> fizzBuzz(int n) {
3        List<String>res=new ArrayList<>();
4        for(int i=1;i<=n;i++){
5            if(i%3==0 && i%5==0){
6                res.add("FizzBuzz");
7            }
8            else if(i%3==0){
9                res.add("Fizz");
10            }
11            else if(i%5==0){
12                res.add("Buzz");
13            }
14            else{
15                res.add(String.valueOf(i));
16            }
17        }
18        return res;
19    }
20}