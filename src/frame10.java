
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.*;

public class frame10 extends JFrame{
	JTextField t1, t2,t3;
	JLabel l1,l2,l3;
	JButton b, b1;
	
	int result=0;
	
	int num[]=new int[10];
	
	public frame10()
	{
		
		b1=new JButton("SHOW ALL STEPS");
		b1.setBounds(234, 55, 85, 25);
		add(b1);

		
		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Scanner sc = null;
            	try {
					sc=new Scanner(new File("Algo.txt"));
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            	 //StringBuilder output = new StringBuilder();
            	Scanner scanner = null;
				try {
					scanner = new Scanner(new File("Algo.txt"));
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                int [] numbers = new int [10];
                int i = 0;
                while(scanner.hasNextInt()){
                   numbers[i++] = scanner.nextInt();
                   
                }
                System.out.println("Array Input From File:");
                System.out.println(Arrays.toString(numbers));
               
                final long startTime = System.nanoTime();
               quicksort(numbers, 0, numbers.length-1);
               final long duration = System.nanoTime() - startTime;
               System.out.println("Nano seconds:"+duration);
               System.out.println("Quick Sort:");
               System.out.println(Arrays.toString(numbers));
               
               
               final long startTime1 = System.nanoTime();
               modified_quicksort(numbers, 0, numbers.length-1, 5);
               final long duration1 = System.nanoTime() - startTime1;
               System.out.println("Modified Quick Sort:");
                System.out.println(Arrays.toString(numbers));
                System.out.println("Nano seconds:"+duration1);
			}
			
		});
		
	
		
		
		
		
		setSize(500,500);
		setLayout(new FlowLayout());
		setVisible(true);
	}


	void quicksort(int A[], int p, int r) {
	    if (p < r - 1) {
	        int q = partition(A, p, r);
	        quicksort(A, p, q);
	        quicksort(A, q + 1, r);
	    }
	}

	void modified_quicksort(int A[], int p, int r, int K) {
		
	    limited_quicksort(A, p, r, K);
	    insertion_sort(A, p, r);
	}

	void limited_quicksort(int A[], int p, int r, int treshold) {
	    if (r - p > treshold) {
	        int q = partition(A, p, r);
	        limited_quicksort(A, p, q, treshold);
	        limited_quicksort(A, q + 1, r, treshold);
	    }
	}

	int partition(int A[], int p, int r) {
	    int x, i, j, tmp;

	    x = A[r - 1];
	    i = p;

	    for (j = p; j < r - 1; j++) {
	        if (A[j] <= x) {
	            tmp = A[i];
	            A[i] = A[j];
	            A[j] = tmp;
	            i++;
	        }
	    }

	    tmp = A[i];
	    A[i] = A[r - 1];
	    A[r - 1] = tmp;

	    return i;
	}

	void insertion_sort(int A[], int p, int r) {
	    int i, j, key;

	    for (j = p + 1; j < r; j++) {
	        key = A[j];
	        for (i = j - 1; i >= p && A[i] > key; i--) {
	            A[i + 1] = A[i];
	        }
	        A[i + 1] = key;
	    }
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		frame10 f10=new frame10();
	
		

	}

}
