//Brute Force
import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getInversions(long arr[], int n) {
        // Write your code here.
        long c=0;
        for(int i=0;i<n;i++)
        {
          for(int j=0;j<n;j++)
          {
              if(arr[i]>arr[j] && i<j)
              {
                  c++;
              }
          }
        }
        return c;
    }
}

//Optimized using merge sort
import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getInversions(long arr[], int n) {
        // Write your code here.
        long[] temp=new long[n];
        long ans=mergesort(arr,temp,0,n-1);
        return ans;
    }
    public static long mergesort(long arr[], long temp[], int left, int right)
    {
        int mid;
        long c=0;
        if(right>left)
        {
            mid=(right+left)/2;
            c+=mergesort(arr,temp,left,mid);
            c+=mergesort(arr,temp,mid+1,right);
            c+=merge(arr,temp,left,mid+1,right);
        }
        return c;
    }
    public static long merge(long arr[], long temp[], int left, int mid, int right)
    {
        int i,j,k;
        long c=0;
        i=left;
        j=mid;
        k=left;
        while((i<=mid-1)&&(j<=right))
        {
            if(arr[i] <= arr[j]){
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
                c=c+(long)(mid-i);
            }
        }
        while(i<=mid-1)
            temp[k++]=arr[i++];
        while(j<=right)
            temp[k++]=arr[j++];
        for(i=left;i<=right;i++)
            arr[i]=temp[i];
        return c;
    }
}
