// Java program for implementation of Insertion Sort
class InsertionSort
{
    /*Function to sort array using insertion sort*/
    void sort(Student[] arr)
    {
        int n = arr.length;
        int counter=0;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i].get_id();
            int j = i-1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j>=0 && arr[j].get_id() > key)
            {
                arr[j+1].set_id(arr[j].get_id());
                j = j-1;
                counter+=1;  //counting number of comparisons
            }
            arr[j+1].set_id(key);
        }
        System.out.println("Number of comparisons:"+counter);
        
    }
}