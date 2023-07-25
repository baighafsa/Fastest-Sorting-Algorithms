
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.*;

public class frame2 extends JFrame{
	JTextField t1, t2,t3;
	JLabel l1,l2,l3;
	JButton b, b1;
	
	int result=0;
	
	int num[]=new int[10];
	
	public frame2()
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
                bubbleSort(numbers);
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
	
	public static void bubbleSort(int[] num ) {
        int j;
        boolean flag = true;   // set flag to true to begin first pass
        int temp;   //holding variable

        System.out.println("---O(n)");
        while ( flag ) {
            flag= false;
            
            for( j=0;  j < num.length -1;  j++ ) {
            	
                if ( num[ j ] < num[j+1] )  {
                    temp = num[ j ];               
                    num[ j ] = num[ j+1 ];
                    num[ j+1 ] = temp;
                    flag = true; 
                   
                } 
               
               
                
            } 
            System.out.println(Arrays.toString(num));
            
           
        }
        System.out.println("---O(n)");
        System.out.println(" ");
        System.out.println("TIME COMPLEXITY---O(n^2)");
    } 
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		frame2 f2=new frame2();
		
		

	}

}
