import java.util.*;
public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.
        if(n==0)
            return 0;
        int i=0;
        for(int j=1;j<n;j++)
        {
            if(arr.get(i)!=arr.get(j))
            {
                i++;
                arr.set(i,arr.get(j));
            }
        }
        return i+1;
	}
}
