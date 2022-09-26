import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
public class Solution {
  public static String fourSum(int[] arr, int target, int n) {
      // Write your code here.
      if(n==0)
      {
          return "No";
      }
      Arrays.sort(arr);
      for(int i=0;i<n;i++)
      {
          for(int j=i+1;j<n;j++)
          {
              int tar2=target-arr[j]-arr[i];
              int front = j+1;
              int back = n-1;
              while(front < back)
              {
                  int two=arr[front]+arr[back];
                  if(two<tar2)
                      front++;
                  else if(two>tar2)
                      back--;
                  else
                      return "Yes";
              }
              while(j<n-1 && arr[j]==arr[j+1])
              {
                  j++;
              }
          }
          while(i<n-1 && arr[i]==arr[i+1])
                {
                    i++;
                }
      }
          return "No";
      
  }
}
