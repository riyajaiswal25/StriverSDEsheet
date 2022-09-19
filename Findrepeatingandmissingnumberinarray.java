import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int x=0, y=0, xor, setbit, i;
        xor=arr.get(0);
        for(i=1;i<n;i++)
            xor=xor^arr.get(i);
        for(i=1;i<=n;i++)
            xor=xor^i;
        setbit=xor & ~(xor-1);
        for(i=0;i<n;i++)
        {
            if((arr.get(i) & setbit)!=0)
                x=x^arr.get(i);
            else
                y=y^arr.get(i);
        }
        for(i=1;i<=n;i++)
        {
            if((i & setbit) != 0)
                x=x^i;
            else
                y=y^i;
        }
        int[] ch=new int[2];
         for(i=0;i<n;i++)
       if(x == arr.get(i))
       {
           ch[0]=y;
        ch[1]=x;
       } 
       else if(y == arr.get(i)){
           ch[0]=x;
        ch[1]=y;
       } 
        
        return ch;
    }
}
