import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		// Write your code here.
        HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
        int c=0, xorn=0, n=arr.size();
        for(int i=0;i<n;i++)
        {
            xorn=xorn^arr.get(i);
            if(map.get(xorn^x)!=null)
                c+=map.get(xorn^x);
            if(xorn==x)
                c++;
            if(map.get(xorn)!=null)
                map.put(xorn,map.get(xorn)+1);
            else
                map.put(xorn,1);
        }
        return c;
	}
}
