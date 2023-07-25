

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.*;

public class frame6 extends JFrame{
	JTextField t1, t2,t3;
	JLabel l1,l2,l3;
	JButton b, b1;
	
	int result=0;
	
	int num[]=new int[10];
	
	public frame6()
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
                quickSort(numbers, 0, numbers.length-1);
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
	public static void quickSort(int[] a, int p, int r)
    {
        if(p<r)
        {
            int q = Partition(a, p,r);
            quickSort(a, p, q-1);
            quickSort(a, q+1, r);
        }
       
    }

    private static int Partition(int[] a, int p, int r)
    {
        int x = a[r];

        int i = p-1;
        int temp=0;

        for(int j=p; j<r; j++)
        {
            if(a[j]<=x)
            {
                i++;
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        System.out.println(Arrays.toString(a));
        temp = a[i+1];
        a[i+1] = a[r];
        a[r] = temp;
       
    
        return (i+1);
    }
    
       

	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		frame6 f6=new frame6();
		
		

	}

}
