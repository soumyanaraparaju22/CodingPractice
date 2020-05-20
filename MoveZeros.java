class Solution {
    public void moveZeroes(int[] nums)
    {
            if(nums==null||nums.length<=1)
            {
                return;
            }
        int last_nzero=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[last_nzero++]=nums[i];
            }
        }
        for(int j=last_nzero;j<nums.length;j++)
        {
            nums[j]=0;
        }
        
    }
}
