

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.*;

public class frame7 extends JFrame{
	JTextField t1, t2,t3;
	JLabel l1,l2,l3;
	JButton b, b1;
	
	int result=0;
	
	int num[]=new int[10];
	
	public frame7()
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
                radixSort(numbers, 10);
                final long duration = System.nanoTime() - startTime;
                System.out.println("Nano seconds:"+duration);
                
                
                System.out.println(" ");
                System.out.println("TIME COMPLEXITY---O(nk)");
                System.out.println(" ");
                System.out.println("SPACE COMPLEXITY---O(n+k)");
                System.out.println("Sorted Array:");
                System.out.println(Arrays.toString(numbers));
			}
			
		});
		
	
		
		
		
		
		setSize(500,500);
		setLayout(new FlowLayout());
		setVisible(true);
	}
	void countingSort(int array[], int size, int place) {
	    int[] output = new int[size + 1];
	    int max = array[0];
	    for (int i = 1; i < size; i++) {
	      if (array[i] > max)
	        max = array[i];
	    }
	    int[] count = new int[max + 1];

	    for (int i = 0; i < max; ++i)
	      count[i] = 0;

	    for (int i = 0; i < size; i++)
	      count[(array[i] / place) % 10]++;
	    
	   

	 
	    for (int i = 1; i < 10; i++)
	      count[i] += count[i - 1];
	    
	    System.out.println(Arrays.toString(array));

	    for (int i = size - 1; i >= 0; i--) {
	      output[count[(array[i] / place) % 10] - 1] = array[i];
	      count[(array[i] / place) % 10]--;
	    }
	    System.out.println(Arrays.toString(array));

	    for (int i = 0; i < size; i++)
	      array[i] = output[i];
	  }
	
	  int getMax(int array[], int n) {
	    int max = array[0];
	    System.out.println("---O(n)");
	    for (int i = 1; i < n; i++)
	      if (array[i] > max)
	        max = array[i];
	    return max;
	  }

	  void radixSort(int array[], int size) {
	  
	    int max = getMax(array, size);
	    System.out.println(" ");
        System.out.println("---O(k)");
	    for (int place = 1; max / place > 0; place *= 10)
	    {
	      countingSort(array, size, place);
	    }
	    
	  }
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		frame7 f7=new frame7();
		
		

	}

}
