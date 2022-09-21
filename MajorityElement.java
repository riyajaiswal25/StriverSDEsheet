import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findMajority(int[] arr, int n) {
		// Write your code here.
        int m = n >> 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int val:arr){
            int f=map.getOrDefault(val,0)+1;
            if(f>m){
                return val;
            }
            map.put(val,f);
        }
        return -1;
        
	}
}
