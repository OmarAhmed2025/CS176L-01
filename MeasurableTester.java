import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
   This program demonstrates the measurable Country class.
*/
public class MeasurableTester
{
	private static final int FRAME_WIDTH = 240; // Constants for frame  width and hieght 
	private static final int FRAME_HEIGHT = 160;

   public static void main(String[] args)
   {
     final  int SIZE = 5;
	  //Countries
	  System.out.println("Countries Data");
	  Measurable[] countries = new Measurable[4];
      countries[0] = new Country("Uruguay", 176220);
      countries[1] = new Country("Thailand", 513120);
      countries[2] = new Country("Belgium", 30510);
      countries[3] = new Country("France",450000);
      
      double avg=Data.average(countries);
      System.out.println("Average area: " + avg);
      System.out.println("Expected: 239950");
      System.out.println("");
      
      double maxData = Data.max(countries);
      System.out.println("Maximum area: " + maxData);
      System.out.println("Expected: 513120");
      System.out.println("");
      
      double minData = Data.min(countries);
      System.out.println("Minimum area: " + minData);
      System.out.println("Expected: 176220");
      System.out.println("");
      
      //Bank Accounts
      System.out.println("Bank account data");
      Measurable[] bank = new Measurable[3];
      bank[0] = new BankAccount(176220);
      bank[1] = new BankAccount(513120);
      bank[2] = new BankAccount(30510);
      
      avg=Data.average(bank);
      System.out.println("Average balance: " + avg);
      System.out.println("Expected: 239950");
      System.out.println("");
      
      maxData = Data.max(bank);
      System.out.println("Maximum balance: " + maxData);
      System.out.println("Expected: 513120");
      System.out.println("");
      
      minData = Data.min(bank);
      System.out.println("Minimum balance: " + minData);
      System.out.println("Expected: 176220");
      System.out.println("");
      // Quiz
      System.out.println("Quizzes Data");
      Measurable[] quizzes = new Measurable[SIZE];
      quizzes[0] = new Quiz(95);
      quizzes[1] = new Quiz(80);
      quizzes[2] = new Quiz(90);
      quizzes[3] = new Quiz(50);
      quizzes[4] = new Quiz(75);
      
      avg = Data.average(quizzes);
      System.out.println("Average score: " + avg);
      System.out.println("Expected: 78.0 ");
      System.out.println("");
      
      maxData = Data.max(quizzes);
      System.out.println("Maximum score: " + maxData);
      System.out.println("Expected: 95.0 ");
      System.out.println("");
       minData = Data.min(quizzes);
      System.out.println("Minimum score: " + minData);
      System.out.println("Expected: 50.0");
      System.out.println("");
      
      Scanner input = new Scanner(System.in);
   
      	  System.out.println("VERSION TWO");
      	  System.out.println();
    	  System.out.print("Enter metric to use, 1 for maximum, 2 for minimum, 3 for average: ");
   	   		 int whichMetric = input.nextInt();  
      

	   
	  
	   String metricNeeded= "average";

		   
	   
	   if (whichMetric == 1)
	  {
		   metricNeeded = "Maximum";
	  }
	   if (whichMetric == 2) 
	  {
		  metricNeeded = "Minimum";
	  }
	   if (whichMetric == 3) 
	  {
		  metricNeeded = "Average";
		if(whichMetric == -1) {
			metricNeeded = "End";
		}
	  }
	 
 
//Creating the frame and the panel  

	  JPanel programPanel = new JPanel();
	  JFrame measurableFrame = new JFrame();
	  measurableFrame.add(programPanel);

//Create the button and the listener      
    JButton measurableButton = new JButton("Get " + metricNeeded + " Balance");
    programPanel.add(measurableButton);
    ActionListener measurableListener = new ButtonListener(bank,metricNeeded);
    measurableButton .addActionListener(measurableListener);

   
    JButton measurableButton2 = new JButton("Get " + metricNeeded + " Area");
    programPanel.add(measurableButton2);
    ActionListener measurableListener2 = new ButtonListener(countries,metricNeeded);
    measurableButton2.addActionListener(measurableListener2);
    
 
    JButton measurableButton3 = new JButton("Get " + metricNeeded + " Score");
    programPanel.add(measurableButton3);
    ActionListener measurableListener3 = new ButtonListener(quizzes,metricNeeded);
    measurableButton3.addActionListener(measurableListener3);
   
    
  
    measurableFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
    measurableFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    measurableFrame.setVisible(true);
	   	
	    
      }
   }
