
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.*;

public class frame3 extends JFrame{
	JTextField t1, t2,t3;
	JLabel l1,l2,l3;
	JButton b, b1;
	
	int result=0;
	
	int num[]=new int[10];
	
	public frame3()
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
                insertionSort(numbers, 10);
                final long duration = System.nanoTime() - startTime;
                System.out.println("Nano seconds:"+duration);
                
                System.out.println(" ");
                System.out.println("TIME COMPLEXITY---O(n^2)");
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
	
	public static void insertionSort(int arr[], int n)
	{
	    int i, key, j;
	    System.out.println("---O(n)");
	    for (i = 1; i < n; i++)
	    {
	        key = arr[i];
	        j = i - 1;
	        
	        while (j >= 0 && arr[j] > key)
	        {
	            arr[j + 1] = arr[j];
	            j = j - 1;
	        }
	        arr[j + 1] = key;
	        System.out.println(Arrays.toString(arr));
	    }
	    System.out.println("---O(n)");
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		frame3 f3=new frame3();
		
		

	}

}
