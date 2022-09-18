import java.util.* ;
import java.io.*; 
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        // write your code here.
      Arrays.sort(intervals,(a,b)->a.start-b.start);
        ArrayList<Interval> res = new ArrayList<Interval>();
        int i,end;
        for(i=0;i<intervals.length;)
        {
            end=i+1;
            while(end<intervals.length && intervals[end].start < 1+intervals[i].finish)
            {
                intervals[i].finish=Math.max(intervals[i].finish, intervals[end].finish);
                end++;
            }
            res.add(intervals[i]);
            i=end;
        }
        return res;
    }
}
