package bigining.BinarySearch;

public class binarysearchaAgo {
    public static void main(String[] args) {
        int[] arr ={10,15,21,34,81,105,180,500,614};
        int target = 21;
        int n = arr.length;
        int high = n-1;
        int low = 0;
        boolean flag = false;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<target)  
                low = mid+1;
            else if(arr[mid]>target)  
                high = mid-1;
            else {
                flag = true;
                System.out.println("Element found: " + arr[mid] + " at index " + mid);
                break;
            }
        }

        if(!flag) {
            System.out.println("Element not found");
        }
    }
}
