class Solution {
    public double myPow(double x, int n) {
        double c=1;
        int m=n;
        if(m<0) m=m*-1;
        while(m!=0){
            c*=x;
            m--;
        }
        
        return (n<0)? 1/c : c;
    }
}