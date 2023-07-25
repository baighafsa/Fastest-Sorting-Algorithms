

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.*;

public class frame9 extends JFrame{
	JTextField t1, t2,t3;
	JLabel l1,l2,l3;
	JButton b, b1;
	
	int result=0;
int num[]=new int[10];
	
	public frame9()
	{
		
		b1=new JButton("SHOW ALL STEPS");
		b1.setBounds(234, 55, 85, 25);
		add(b1);

		
		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
				float arr[] = { (float)0.988, (float)0.635,
                        (float)0.524, (float)0.5624,
                        (float)0.2667, (float)0.0928 };
  
                      int n = arr.length;
          
                System.out.println("Array Input From File:");
                for(int i=0; i<arr.length; i++)
                {
                	System.out.print(arr[i]);
                }
                
                System.out.println("\nSteps:");
                final long startTime = System.nanoTime();
                bucketSort(arr, n);
                final long duration = System.nanoTime() - startTime;
                System.out.println("Nano seconds:"+duration);
                
                System.out.println(" ");
                System.out.println("TIME COMPLEXITY---O(n+k)");
                System.out.println(" ");
                System.out.println("SPACE COMPLEXITY---O(n)");
                System.out.println("Sorted Array:");
                for (float el : arr) {
                    System.out.print(el + " ");
                }
             
			}
			
		});
		
	
			
		
		
		
		setSize(500,500);
		setLayout(new FlowLayout());
		setVisible(true);
	}
	
	static void bucketSort(float arr[], int n)
    {
        if (n <= 0)
            return;
  
        
        @SuppressWarnings("unchecked")
        Vector<Float>[] buckets = new Vector[n];
  
        for (int i = 0; i < n; i++) {
            buckets[i] = new Vector<Float>();
        }
  
        
        for (int i = 0; i < n; i++) {
            float idx = arr[i] * n;
            buckets[(int)idx].add(arr[i]);
        }
  
       
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
           
        }
  
       
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
                
            }
            System.out.println(Arrays.toString(arr));
        }
    }
  

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		frame9 f9=new frame9();
		//int[] array= {34,76,12,65,31,98,1,9,25,40};
		
		
		

	}

}
