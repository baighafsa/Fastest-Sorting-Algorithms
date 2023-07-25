
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Sorting extends JFrame{

	JLabel l;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;

	
	public Sorting() throws IOException
	{
		
		/*File myFile = new File("Algo.txt");
    	try {
   		
   		 myFile.createNewFile();
   	 }
   	 catch(IOException e)
   	 {
   		 System.out.println("Unable to create File");
   		 e.printStackTrace();
   		 
   	 }*/
    	
    	/*FileWriter writer = new FileWriter("ALgo.txt");
        Integer arr[] = { 34, 76, 12, 65, 31, 98, 1, 9, 25, 40 };
        int len = arr.length;
        for (int i = 0; i < len; i++) {
           writer.write(arr[i] + "\t"+ "");
        }
        writer.close();*/
        
        
		l=new JLabel("Sorting Algorithms");
		l.setBounds(92, 54, 96, 19);
		add(l);
		
		b1=new JButton("Bubble");
		b1.setBounds(234, 55, 85, 21);
		add(b1);
		
		b2=new JButton("Insertion");
		b2.setBounds(234, 55, 85, 21);
		add(b2);
		
		b3=new JButton("Merge");
		b3.setBounds(234, 55, 85, 21);
		add(b3);
		
		b4=new JButton("Heap");
		b4.setBounds(234, 55, 85, 21);
		add(b4);
		
		b5=new JButton("Quick");
		b5.setBounds(234, 55, 85, 21);
		add(b5);
		
		b6=new JButton("Radix");
		b6.setBounds(234, 55, 85, 21);
		add(b6);
		
		b7=new JButton("Counting");
		b7.setBounds(234, 55, 85, 21);
		add(b7);
		
		b8=new JButton("Bucket");
		b8.setBounds(234, 55, 85, 21);
		add(b8);
		
		b9=new JButton("QuickSort fast");
		b9.setBounds(234, 55, 85, 21);
		add(b9);
		
		b10=new JButton("O(n+k)");
		b10.setBounds(234, 55, 85, 21);
		add(b10);
		
		setSize(500, 500);
		setLayout(new FlowLayout());
		setVisible(true);
		
		b1.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						frame2 f = new frame2();
						
						f.setVisible(true);
					}
			
				});
		
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame3 f3=new frame3();
				f3.setVisible(true);
				
			}
			
		});
		
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame4 f4 = new frame4();
				f4.setVisible(true);
				
			}
			
		});
		
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame5 f5 = new frame5();
				f5.setVisible(true);
				
			}
			
		});
		
		b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame6 f6 = new frame6();
				f6.setVisible(true);
				
			}
			
		});
		
		b6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame7 f7 = new frame7();
				f7.setVisible(true);
				
			}
			
		});
		
		b7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame8 f8 = new frame8();
				f8.setVisible(true);
				
			}
			
		});
		
		b8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame9 f9 = new frame9();
				f9.setVisible(true);
				
			}
			
		});
		
		b9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame10 f10 = new frame10();
				f10.setVisible(true);
				
			}
			
		});
		
		b10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame11 f11 = new frame11();
				f11.setVisible(true);
				
			}
			
		});
		
		
		
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		new Sorting();

	}

}


