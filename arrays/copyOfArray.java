package arrays;

public class copyOfArray {
    public static void main(String[] args) {
        int[] arr = {30,10,40,23,89,34};
        //for each loop
       for(int ele: arr){
           System.out.print(ele+" ");
       }
        System.out.println();
//       int[] nums = arr;  //shallow copy
//        nums[0] = 70;
//         for(int ele : nums){
//           System.out.print(ele+" ");
//        }
        int[] brr = new int [arr.length];
        for(int i=0;i<arr.length;i++){
            brr[i] = arr[i];
        }
        brr[0] = 100;
        System.out.println(arr[0]);
    }
}
