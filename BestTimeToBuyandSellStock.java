import java.io.*;
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int pr=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<prices.size();i++)
        {
            min=Math.min(min,prices.get(i));
            pr=Math.max(pr,prices.get(i)-min);
        }
        return pr;
    }
}