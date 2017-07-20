import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.Scanner;

public class RandomGenerator
{
	private Scanner scan;
    private Formatter output;
    
    
    
    public Student[] readFile(String filename){
    	try{
    		
    		if (filename.equals("test100.txt"))
    				{
    			int x=100;
    			
        		Student[] array1= new Student[x];	
        		scan = new Scanner(new File(filename));
        		int counter=0;
        		while(scan.hasNext()){
        			String string_number = scan.next();
        			int num = Integer.parseInt(string_number);
        			Student newstudent=new Student(num);
        			array1[counter]=newstudent;
        			counter+=1;}
        		return array1;
    			}
    		else if(filename.equals("test500.txt"))
    				{
        		int x=500;
        		
        		Student[] array1= new Student[x];	
        		scan = new Scanner(new File(filename));
        		int counter=0;
        		while(scan.hasNext()){
        			String string_number = scan.next();
        			int num = Integer.parseInt(string_number);
        			Student newstudent=new Student(num);
        			array1[counter]=newstudent;
        			counter+=1;}
        		return array1;
        		}
			else if(filename.equals("test1000.txt"))
					{
        		int x=1000;
        		
        		Student[] array1= new Student[x];	
        		scan = new Scanner(new File(filename));
        		int counter=0;
        		while(scan.hasNext()){
        			String string_number = scan.next();
        			int num = Integer.parseInt(string_number);
        			Student newstudent=new Student(num);
        			array1[counter]=newstudent;
        			counter+=1;}
        		return array1;
        		    }
			else if(filename.equals("test5000.txt"))
					{
        		int x=5000;
        		
        		Student[] array1= new Student[x];	
        		scan = new Scanner(new File(filename));
        		int counter=0;
        		while(scan.hasNext()){
        			String string_number = scan.next();
        			int num = Integer.parseInt(string_number);
        			Student newstudent=new Student(num);
        			array1[counter]=newstudent;
        			counter+=1;}
        		return array1;
        		}
		
    			
    		
    	}
    	catch(Exception e){
    		System.out.println("No file");
    		return null;
    	}
		return null;
		
    	
    	
    }
    	
    	
    void printSortedArray(Student[] arr)
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i].get_id() + " ");
        System.out.println("\n");
    }
    	
    
    public void createFile(String filename)
    {
        {
            try
            {
                output = new Formatter(filename);
                ArrayList<Integer> list = new ArrayList<Integer>();
                for (int i=1; i<6000; i++) {
                    list.add(new Integer(i));
                }
                Collections.shuffle(list);
                int x=0;
                if (filename.equals("test100.txt")){
                	x=100;
                }
                else if(filename.equals("test500.txt")){
                	x=500;
                }
                else if(filename.equals("test1000.txt")){
                	x=1000;
                }
                else if(filename.equals("test5000.txt")){
                	x=5000;
                }
                for (int i=0; i<x; i++) {
                    output.format("%s",list.get(i)+"\n");
                }
                output.close();
            }
            catch(FileNotFoundException fileNotFoundException)
            {
                System.err.println("Error");
            }
        }
        
  
    	 
    	 
     
     
    }

  

public static void main(String[] args){
	RandomGenerator generator= new RandomGenerator();
	InsertionSort insertion_sorting= new InsertionSort();
	BubbleSort bubble_sorting = new BubbleSort();
	SelectionSort selection_sorting = new SelectionSort();
	Scanner in = new Scanner(System.in);
	System.out.println("Welcome to Student Sorting Program. Three sorting algorithms are used: Bubble Sort | Selection Sort | Insertion Sort\n");
	
	
	int choice=0;
	while(choice != 5) {                                // Loop to continue the program 
	System.out.println("\nTo generate a file");
	System.out.println("With 100 students, click 1:\nWith 500 students, click 2:\nWith 1000 students, click 3:\nWith 5000 students, click 4:\nTo Exit, click 5:");
		
	choice=in.nextInt();
	if (choice == 1) {                                 // Allows the student to register for a course
		generator.createFile("test100.txt");
		Student[] unsorted_student_array=generator.readFile("test100.txt");
		Student[] unsorted_students_two= unsorted_student_array;
		Student[] unsorted_students_three= unsorted_student_array;
		System.out.println("Sorted with Insertion Sort(100):");
		insertion_sorting.sort(unsorted_student_array);
		generator.printSortedArray(unsorted_student_array);
		
		System.out.println("Sorted with Bubble Sort(100):");
		bubble_sorting.bubbleSort(unsorted_students_two);
		generator.printSortedArray(unsorted_students_two);
		
		System.out.println("Sorted with Selection Sort(100):");
		selection_sorting.sort(unsorted_students_three);
		generator.printSortedArray(unsorted_students_three);
		
		
		
	}
	else if(choice==2) {                              //Allows the student to drop a course
		generator.createFile("test500.txt");
		Student[] unsorted_student_array=generator.readFile("test500.txt");
		Student[] unsorted_students_two= unsorted_student_array;
		Student[] unsorted_students_three= unsorted_student_array;
		System.out.println("Sorted with Insertion Sort(500):");
		insertion_sorting.sort(unsorted_student_array);
		generator.printSortedArray(unsorted_student_array);
		
		System.out.println("Sorted with Bubble Sort(500):");
		bubble_sorting.bubbleSort(unsorted_students_two);
		generator.printSortedArray(unsorted_students_two);
		
		System.out.println("Sorted with Selection Sort(500):");
		selection_sorting.sort(unsorted_students_three);
		generator.printSortedArray(unsorted_students_three);
		
	}
	else if(choice==3) {                             //Allows the student to search for their name
		generator.createFile("test1000.txt");
		Student[] unsorted_student_array=generator.readFile("test1000.txt");
		Student[] unsorted_students_two= unsorted_student_array;
		Student[] unsorted_students_three= unsorted_student_array;
		System.out.println("Sorted with Insertion Sort(1000):");
		insertion_sorting.sort(unsorted_student_array);
		generator.printSortedArray(unsorted_student_array);
		
		System.out.println("Sorted with Bubble Sort(1000):");
		bubble_sorting.bubbleSort(unsorted_students_two);
		generator.printSortedArray(unsorted_students_two);
		
		System.out.println("Sorted with Selection Sort(1000):");
		selection_sorting.sort(unsorted_students_three);
		generator.printSortedArray(unsorted_students_three);
	}
	else if(choice==4){
		generator.createFile("test5000.txt");
		Student[] unsorted_student_array=generator.readFile("test5000.txt");
		Student[] unsorted_students_two= unsorted_student_array;
		Student[] unsorted_students_three= unsorted_student_array;
		System.out.println("Sorted with Insertion Sort(5000):");
		insertion_sorting.sort(unsorted_student_array);
		generator.printSortedArray(unsorted_student_array);
		
		System.out.println("Sorted with Bubble Sort(5000):");
		bubble_sorting.bubbleSort(unsorted_students_two);
		generator.printSortedArray(unsorted_students_two);
		
		System.out.println("Sorted with Selection Sort(5000):");
		selection_sorting.sort(unsorted_students_three);
		generator.printSortedArray(unsorted_students_three);
		
	}
	else if(choice==5){
		break;
	}
	}
	System.out.println("Good Bye");
	}}	
	
	


  