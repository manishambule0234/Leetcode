class Solution {
    public  int reverse(int x) {
           long  rem=0;
           long  y=x;
       long  rev=0;
        while(y!=0){
            rem=y%10;
            rev=rev*10+rem;
            y=y/10;
            
        }
        long a=Integer.MAX_VALUE;
         if(rev>a-1){
            return 0;
        }  
         else if(rev<-a){
            return 0;
        } 
        int v=(int)rev;
        return v;
    }
}