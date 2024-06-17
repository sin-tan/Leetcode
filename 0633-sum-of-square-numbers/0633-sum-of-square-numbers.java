class Solution {
    public boolean judgeSquareSum(int c) {
        //does not work for 4 digit numbers
        // int sq=(int)Math.sqrt(c);
        // int rem=c-(sq*sq);
        // if(Math.sqrt(rem)%1==0)
        // return true;
        // else
        // return false;

        
        for (int a = 0; a <= Math.sqrt(c); a++) {
            int b = (int) Math.sqrt(c - a * a);
            if (a * a + b * b == c) {
                return true;
            }
        }
        return false;
    }
}