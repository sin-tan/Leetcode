class Solution {
    public boolean check(int[] nums) {
      int  flag=0;
for(int i=0;i<nums.length-1;i++)
{
    if(nums[i]>nums[i+1])
flag++;
}
if(nums[nums.length-1]>nums[0]&&nums[nums.length-1]!=nums[0])
flag++;

if(flag>1)
return false;
else
return true;
    }
}