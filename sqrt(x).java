public class Solution {
    public int mySqrt(int x) {
    int start=0;
    int result=0;
    int end=x;
    while(start<=end){
      int mid=start+(end-start)/2;
      if((long)mid*mid==x){
        result=mid;
        return result;
      }else if((long)mid*mid<x){
        start=mid+1;
        result=mid;
      }else{
        end=mid-1;
      }
    }
   return result;
    }
}
