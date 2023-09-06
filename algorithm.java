
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
// Selection Sort
// Time:O(n^2) 
// Space: O(1)

static void selectSort(int arr[]) {
     int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[i])
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
}

// Merge Sort
// Time: O(n Log n)
// Space: O(n)

private static void mergeSort(int[] array) {
		
		int length = array.length;
		if (length <= 1) return; //base case
		
		int middle = length / 2;
		int[] leftArray = new int[middle];
		int[] rightArray = new int[length - middle];
		
		int i = 0; //left array
		int j = 0; //right array
		
		for(; i < length; i++) {
			if(i < middle) {
				leftArray[i] = array[i];
			}
			else {
				rightArray[j] = array[i];
				j++;
			}
		}
		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray, rightArray, array);
	}
	
	private static void merge(int[] leftArray, int[] rightArray, int[] array) {
		
		int leftSize = array.length / 2;
		int rightSize = array.length - leftSize;
		int i = 0, l = 0, r = 0; //indices
		
		//check the conditions for merging
		while(l < leftSize && r < rightSize) {
			if(leftArray[l] < rightArray[r]) {
				array[i] = leftArray[l];
				i++;
				l++;
			}
			else {
				array[i] = rightArray[r];
				i++;
				r++;
			}
		}
		while(l < leftSize) {
			array[i] = leftArray[l];
			i++;
			l++;
		}
		while(r < rightSize) {
			array[i] = rightArray[r];
			i++;
			r++;
		}
	}

  	  // quick sort = moves smaller elements to left of a pivot.
    	//			   recursively divide array in 2 partitions

    	//                       run-time complexity = Best case O(n log(n))
    	//				   		                   Average case O(n log(n))
    	//				   		                   Worst case O(n^2) if already sorted
    	
    	//                       space complexity    =  O(log(n)) due to recursion
    quickSort(arr,0,arr,arr.length-1);
    static quickSort(int arr, int start, int end)
    {
      if(end <= start) return;
		    int pivot = partition(array, start, end);
      quickSort(arr,pivot + 1,end);
      quickSort(arr,start,pivot-1);
     }
  
    static partition(arr,start,end){
     	int pivot = array[end];
      int i = start - 1;
      for(int j = start; j <= end; j++){
          if(arr[j] < pivot){
             i++;
            	int temp = array[i];
         				array[i] = array[j];
         				array[j] = temp;
          }
      }
      i++;
      int temp = array[i];
      array[i] = array[end];
      array[end] = temp;
     
      return i;
    }
