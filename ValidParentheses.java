class Solution 
{
  public boolean checkValidString(String s) 
  {
    int l = 0;
    int h = 0;
    for (char c : s.toCharArray()) 
    {
      l += c == '(' ? 1 : -1;
      h += c != ')' ? 1 : -1;
      if (h < 0) 
      {
        break;
      }
      l = Math.max(l, 0);
    }
    return l == 0;
  }
