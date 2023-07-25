
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.*;

public class frame5 extends JFrame{
	JTextField t1, t2,t3;
	JLabel l1,l2,l3;
	JButton b, b1;
	
	int result=0;
	
	int num[]=new int[10];
	
	public frame5()
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
                System.out.println("Steps:");
                
                final long startTime = System.nanoTime();
                sort(numbers);
                final long duration = System.nanoTime() - startTime;
                System.out.println("Nano seconds:"+duration);
                
                
                System.out.println(" ");
                System.out.println("SPACE COMPLEXITY---O(1)");
                System.out.println("Sorted Array:");
                System.out.println(Arrays.toString(numbers));
			}
			
		});
		
	
		
		
		
		
		setSize(500,500);
		setLayout(new FlowLayout());
		setVisible(true);
	}
	
	public void sort(int arr[])
    {
        int N = arr.length;
 
        System.out.println("---O(n)");
        for (int i = N / 2 - 1; i >= 0; i--)
            heapify(arr, N, i);
        System.out.println("O(log(n)");
        for (int i = N - 1; i > 0; i--) {
        	
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
            heapify(arr, i, 0);
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("TIME COMPLEXITY---O(nlog(n)");
    }
 
    void heapify(int arr[], int N, int i)
    {
        int largest = i; 
        int l = 2 * i + 1; 
        int r = 2 * i + 2; 
 
      
        if (l < N && arr[l] > arr[largest])
            largest = l;
 
       
        if (r < N && arr[r] > arr[largest])
            largest = r;
 
        
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
 
            
            heapify(arr, N, largest);
        }
        
       
    }
 
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		frame5 f5=new frame5();
		
		

	}

}
