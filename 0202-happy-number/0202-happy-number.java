class Solution {
    public boolean isHappy(int n) {
     while(n>=7){
        int sum=0;
        while(n!=0){
            int a=n%10;
            sum=sum+a*a;
            n=n/10;
        }
        n=sum;
     }   
     if(n==1){
        return true;
     }
     else{
        return false;
     }
    }
}