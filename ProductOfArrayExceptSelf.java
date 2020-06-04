class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int n=nums.length;
        int[] a=new int[n];
        
        for(int i=0;i<n;i++)
        {
            a[i]=1;
            for(int j=0;j<n;j++)
            {
               
                if(i!=j)
                {
                   a[i]=a[i]*nums[j];
                }
            }
        }
     return a;   
    }
}
