
 // Insertion Sort
 // Time:O(n^2) 
 // Space: O(1)
public insertionSort(int [] arr){
        int i,j,key;
        for(i = 1; i < arr.length; i++){
            j = i - 1;
            key = arr[i];
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
         arr[j+1] = key;
  }
}

// Bubble Sort
// Time:O(n^2) 
// Space: O(1)

 static void bubbleSort(int arr[], int n) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] và arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // Nếu không có phần tử nào để hoán đổi
            // bên trong vòng lặp thì Break
            if (swapped == false)
                break;
        }
