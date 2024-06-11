class Solution {
    public boolean isPowerOfTwo(int n) {
     for(int i=0;i<31;i++)
         {
        //   if(Math.pow(2,i)==n){ This approach is using simple operators

            if(1<<i==n) //bit manipulation
           return true;
          }
         
       return false;   
    }
}