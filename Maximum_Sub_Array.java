class MaximumSubarrayPrefixSum 
{
  public int maxSubArray(int[] nums) 
  {
      int len = nums.length;
      int max_Sum = Integer.MIN_VALUE;
      int sum = 0;
      for (int i = 0; i < len; i++) 
      {
        sum = 0;
        for (int j = i; j < len; j++) 
        {
          sum += nums[j];
          max_Sum = Math.max(max_Sum, sum);
        }
      }
      return max_Sum;
  }
}
