class Solution {
    public int numberOfSteps(int num) {
        int n =num;
        int steps=0;
        while(n>0){
        if(n%2==0){
          n=n/2;
        }
        else{
            n=n-1;
        }
        steps++;
        }
        return steps;
    }
}