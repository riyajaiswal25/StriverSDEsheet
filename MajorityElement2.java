import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // Write your code here.
        ArrayList<Integer> ans=new ArrayList<Integer>();
        int num1=-1, num2=-1, c1=0, c2=0, n=arr.size();
        for(int i=0;i<n;i++)
        {
            if(arr.get(i)==num1)
                c1++;
            else if(arr.get(i)==num2)
                c2++;
            else if(c1==0)
            {
                num1=arr.get(i);
                c1=1;
            }
            else if(c2==0)
            {
                num2=arr.get(i);
                c2=1;
            }
            else{
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for(int i=0;i<n;i++)
        {
            if(arr.get(i)==num1)
                c1++;
            else if(arr.get(i)==num2)
                c2++;
        }
       if(c1>n/3)
           ans.add(num1);
       if(c2>n/3)
           ans.add(num2);
        
      return ans;     
    }
}
