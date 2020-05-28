class Solution {
    public int mySqrt(int x) {
        return (int)Math.sqrt(x);
    }

    public int mySqrt2(int x) {
        if (x == 0)
            return 0;
        int left = 1, right = Integer.MAX_VALUE;
        while (true) {
            int mid = left + (right - left)/2;
            if (mid > x/mid) {
                right = mid - 1;
            } else {
                if (mid + 1 > x/(mid + 1))
                    return mid;
                left = mid + 1;
            }
        }
    }
    public int mySqrt3(int x) {
        long r = x;
        while (r*r > x)
            r = (r + x/r) / 2;
        return (int) r;
    }
   public int mySqrt4(int x) {
        if(x==0)
            return 0;
        int h=0;
        while((long)(1<<h)*(long)(1<<h)<=x) 
            h++;
        h--;
        int b=h-1;
        int res=(1<<h);
        while(b>=0){  
            if((long)(res | (1<<b))*(long)(res |(1<<b))<=x)
                res|=(1<<b);
            b--;
        }
        return res;
    }


}
