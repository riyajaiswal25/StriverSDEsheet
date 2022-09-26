import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Write your code here.
        Set<Integer> hashSet = new HashSet<Integer>();
        for(int num:arr)
        {
            hashSet.add(num);
        }
        int longs = 0;
        for(int num:arr)
        {
            if(!hashSet.contains(num-1))
            {
                int curr=num;
                int cust=1;
                while(hashSet.contains(curr+1))
                {
                    curr+=1;
                    cust+=1;
                }
                longs = Math.max(longs,cust);
            }
        }
        return longs;
    }
}
