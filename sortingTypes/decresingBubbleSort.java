package sortingTypes;

// Class for Bubble Sort in Decreasing Order
public class decresingBubbleSort {

    // Method to sort array in decreasing order
    public void sort(int[] arr) {
        int n = arr.length;

        // Outer loop -> runs for passes
        for (int x = 0; x < n - 1; x++) {
            boolean flag = true; // to check if swapping happened or not

            // Inner loop -> compares adjacent elements
            for (int i = 0; i < n - 1 - x; i++) {
                
                // If current element is smaller than next -> swap (for decreasing order)
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i + 1];  // store next element in temp
                    arr[i + 1] = arr[i];    // shift current element forward
                    arr[i] = temp;          // put larger element at earlier position
                    flag = false;           // swapping happened, so array was not sorted yet
                }
            }

            // If no swapping happened in this pass -> array already sorted, break
            if (flag == true)
                break;
        }
    }

    // Main method to test the sorting
    public static void main(String[] args) {
        int[] arr = { -3, 2, 2, 0, 64, -1 };  // input array

        decresingBubbleSort st = new decresingBubbleSort(); 
        st.sort(arr);  // calling sort method

        // Printing sorted array
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
