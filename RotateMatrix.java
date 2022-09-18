import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        // Write your code here.
       int top=0, down=n-1, left=0, right=m-1;
        int dir=0, prev=-1;
        while(top<=down && left<=right){
            if(dir==0)
            {
                if(top==right || down==left)
                    break;
                prev=mat.get(top+1).get(left);
                for(int i=left;i<=right;i++)
                {
                    int temp=mat.get(top).get(i);
                    mat.get(top).set(i,prev);
                    prev=temp;
                }
                top++;
            }
            else if(dir==1)
            {
                for(int i=top;i<=down;i++)
                {
                    int temp=mat.get(i).get(right);
                    mat.get(i).set(right,prev);
                    prev=temp;
                }
                right--;
            }
            else if(dir==2)
            {
                for(int i=right;i>=left;i--)
                {
                    int temp=mat.get(down).get(i);
                    mat.get(down).set(i,prev);
                    prev=temp;
                }
                down--;
            }
            else if(dir==3)
            {
                for(int i=down;i>=top;i--)
                {
                    int temp=mat.get(i).get(left);
                    mat.get(i).set(left,prev);
                    prev=temp;
                }
                left++;
            }
            dir=(dir+1)%4;
        }
    }
}
