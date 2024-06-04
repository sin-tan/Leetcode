class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        //The outer List will contain multiple List<Integer> objects,
        // where each List<Integer> represents a subset of the input array.
        List<List<Integer>> result=new ArrayList<>();
int n=nums.length;
//loop running equal to the subsets
for(int i=0;i<Math.pow(2,n);i++)
{   
    List<Integer> subset=new ArrayList<>();
    for(int j=0;j<n;j++)
    {//dealing with n bits only
        if((i&(1<<j))>0)
        {//int the above step 1 is shifted j times
        //later AND with i
            subset.add(nums[j]);
        }
    }
    //adding subsets
    result.add(subset);
}
return result;
    }
}