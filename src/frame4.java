
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.*;

public class frame4 extends JFrame{
	JTextField t1, t2,t3;
	JLabel l1,l2,l3;
	JButton b, b1;
	
	int result=0;
	
	int num[]=new int[10];
	
	public frame4()
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
                sort(numbers, 0, numbers.length-1 );
                final long duration = System.nanoTime() - startTime;
                System.out.println("Nano seconds:"+duration);
                
                
                System.out.println(" ");
                System.out.println("TIME COMPLEXITY---O(nlog(n)");
                System.out.println(" ");
                System.out.println("SPACE COMPLEXITY---O(n)");
                System.out.println("Sorted Array:");
                System.out.println(Arrays.toString(numbers));
			}
			
		});
		
	
		
		
		
		
		setSize(500,500);
		setLayout(new FlowLayout());
		setVisible(true);
	}
	
	void merge(int arr[], int l, int m, int r)
    {
       
        int n1 = m - l + 1;
        int n2 = r - m;
 
       
        int L[] = new int[n1];
        int R[] = new int[n2];
        System.out.println(" ");
       
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
      
        int i = 0, j = 0;
 
       
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
            System.out.println(Arrays.toString(arr));
        }
 
       
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
       
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
      
    }
 
    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            
            int m = l + (r - l) / 2;
 
           
            sort(arr, l, m);
            sort(arr, m + 1, r);
         
           
            merge(arr, l, m, r);
            
        }
    }
 
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		frame4 f4=new frame4();
		
		

	}

}
