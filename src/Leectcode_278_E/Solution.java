package Leectcode_278_E;

public class Solution {
    public int firstBadVersion(int n){
        int low = 0;
        int high = n;
        while(low < high ){
            int mid = low + (low - high)/2;
//       }if(!firstBadVersion(mid)){
            low = mid + 1;
//        }else{
            high = mid ;

        }

        return low;
    }
}
