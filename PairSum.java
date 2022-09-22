import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
public class Solution{
    public static int[][] pairSum(int[] arr, int s) {
        // Write your code here.
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==s)
                {
                    List<Integer> a =new ArrayList<>();
                    a.add(arr[i]);
                    a.add(arr[j]);
                    list.add(a);
                }
            }
        }
        int[][] ans=new int[list.size()][2];
        for(int i=0;i<list.size();i++)
        {
            for(int j=0;j<2;j++)
            {
                ans[i][j]=list.get(i).get(j);
            }
        }
        return ans;
    }
}
