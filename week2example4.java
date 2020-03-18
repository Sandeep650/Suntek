import java.lang.*;
import java.util.*;

class missing_number
{
    static int binary(int arr[],int low,int high)
    {
        int mid = (low+high)/2;

        if(arr[mid] == (arr[0]+mid))
        return binary(arr,mid+1,high);

        if(arr[mid] > (arr[0]+mid))
        {
            if(arr[mid-1] == (arr[0]+mid-1))
            return (arr[mid-1]+arr[0]);
            else
            return binary(arr,low,mid-1);
        }
        else
        return binary(arr,low,mid-1);
    }

    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,9,11,15,26};
        int n = arr.length;
        int result = binary(arr,0,n-1);
        System.out.println(result);
    }
}
