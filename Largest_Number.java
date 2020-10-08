class Solution {
  public static String largestNumber(ArrayList<Integer> A) {
      int[] nums = new int[A.size()];
      //A.toArray(nums);
      Iterator<Integer> iterator = A.iterator();
      for(int i=0;i<nums.length;i++)
      {
          nums[i]=iterator.next().intValue();
      }
      
      
      if(nums.length == 0)
          return "";
      
      String[] sa = new String[nums.length];
      for(int i=0;i<nums.length;i++)
      {
          sa[i]=Integer.toString(nums[i]);
      }
      Arrays.sort(sa, new Comparator<String>(){
          public int compare(String a, String b){
              String o1= a+b;
              String o2= b+a;
              return o2.compareTo(o1);
          }
          
      });
      if(sa[0].equals("0"))
          return "0";
      
      StringBuilder sb = new StringBuilder();
      for(String s:sa){
          sb.append(s);
      }
      return sb.toString();
  }
}
