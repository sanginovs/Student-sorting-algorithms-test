// Java program for implementation of Selection Sort
class SelectionSort
{
    void sort(Student[] arr)
    {
    	
        int n = arr.length;
        int counter=0;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
           
            for (int j = i+1; j < n; j++){
            	counter+=1;
                if (arr[j].get_id() < arr[min_idx].get_id())
                    min_idx = j;
		            	
		            // Swap the found minimum element with the first
		            // element
		            int temp = arr[min_idx].get_id();
		            arr[min_idx].set_id(arr[i].get_id());
		            arr[i].set_id(temp);
            }
        }
        System.out.println("Number of comparisons:"+counter);
    }}