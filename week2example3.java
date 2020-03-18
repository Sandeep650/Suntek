import java.lang.*;
import java.util.*;

class frequency
{
   static int binary(int arr[],int low,int high,int value,int count)
    {
        int mid=(low+high)/2;

        if(arr[mid]==value)
        {
            count++;
            int s=mid;
            if(arr[s+1]==value)
            {
                while((s+1)!=arr.length && arr[s+1]==value)
                {
                    count++;
                    s++;
                }
            }
            if(arr[mid-1]==value)
            {
                 while((mid)!=0 && arr[mid-1]==value)
                 {
                    count++;
                    mid--;
                 }
            }
            return count;
        }
        if(arr[mid]>value)
        return binary(arr,low,mid-1,value,count);
        else
        return binary(arr,mid+1,high,value,count);
    }
    public static void main(String args[])
    {
        int n,k;
       int arr[]={-1,5,5,4,3,-1,-1};
       k=-1;
       n=arr.length;
        Arrays.sort(arr);
       int freq = binary(arr,0,n-1,k,0);
       System.out.println(freq);
    }
}
