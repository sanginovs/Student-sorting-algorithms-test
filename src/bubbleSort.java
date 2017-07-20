// Java program for implementation of Bubble Sort
class BubbleSort
{
    void bubbleSort(Student[] arr)
    {
        int n = arr.length;
        int counter=0;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
            	counter+=1;
                if (arr[j].get_id() > arr[j+1].get_id())
                {
                    // swap temp and arr[i]
                    int temp = arr[j].get_id();
                    arr[j].set_id(arr[j+1].get_id());
                    arr[j+1].set_id(temp);
                }
        		
        }}
        		System.out.println("Number of comparisons:"+counter);
        		
    }
    
}
    
 
   
  
    
