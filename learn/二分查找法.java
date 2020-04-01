package leetcodeTrain.learn;

public class 二分查找法 {
    public  static<E> int binarySearch(int arr[],int n, int target){
        int l =0,r = n-1; //在范围内寻找target
        while(l<=r)
        {
            int mid = (l+r)/2;
            if(arr[mid] == target)
            {
                return mid;
            }
            if(target > arr[mid]){
                l = mid +1;
            }else{
                r = mid -1;
            }

        }
        return target;
    }

    public static void main(String[] args) {
        int n = 1000000;
        int[] hk = new int[10];
        System.out.println(binarySearch(hk,6,3));

    }
}
