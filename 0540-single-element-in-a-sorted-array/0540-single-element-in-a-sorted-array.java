class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            map.put(nums[i],map.get(nums[i])+1);//map.get gives the value of the key
            else
            map.put(nums[i],1);

        }
        for(int i=0;i<nums.length;i++)
            {       
     if(map.get(nums[i])==1)//checked the values of the map
       { k=nums[i]; 
        break;
       }
    }
    return k;
    }
}