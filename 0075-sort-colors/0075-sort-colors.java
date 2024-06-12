class Solution {
    public void sortColors(int[] nums) {
        int l=nums.length;
        int z=0,o=0,t=0;
       for(int i=0;i<l;i++) 
       {
        if(nums[i]==0)
        z++;
        else if(nums[i]==1)
        o++;
        else if(nums[i]==2)
        t++;

       }
       int num[]=new int[l];
       int k=0;
      
       while(z>0)
       {
        nums[k]=0;
        z--;
        k++;

       }
       while(o>0)
       {
        nums[k]=1;
        o--;
        k++;

       }
        while(t>0)
       {
        nums[k]=2;
        t--;
        k++;

       } 
       
    }
}