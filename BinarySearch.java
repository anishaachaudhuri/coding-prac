//import java.util.*;
public class BinarySearch 
{
    public static void main(String args[])
    {
        int arr[]={10,20,30,35,40,50,70,75};
        int target=35;
        boolean result=search(arr,target,0,arr.length-1);
        System.out.println(result);
    }
    private static boolean search (int arr[],int target, int lb, int ub)
    {
        int mid=lb+(ub-lb)/2;
        if (lb>ub) return false;
        if (arr[mid]==target) return true;
        if (arr[mid]<target) return search(arr,target,mid+1,ub);
        else return search(arr,target,lb,mid-1);
    }
}
