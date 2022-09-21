import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	static boolean findTargetInMatrix(ArrayList<ArrayList<Integer>> mat, int m, int n, int target) {
		// Write your code here.
        for(int i =0; i<m;i++){
           if(target>=mat.get(i).get(0) && target<=mat.get(i).get(n-1)){
               int j = 0;
               while(j<n){
                   if(mat.get(i).get(j) == target) return true;
                   j++;
               }
               return false;
            }
       }
       return false;
	}
    
}
