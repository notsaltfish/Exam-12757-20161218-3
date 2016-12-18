package com.chen.Exam_12757_20161218_3;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("请输入工资：");
    	double salary  = scanner.nextDouble();
    	double gap = salary-3500;
    	double tax=0.0;
    	double firstClassTax = 1500*0.03;
    	double secondClassTax = 3000*0.1;
    	double thirdClassTax = 4500*0.2;
    	double fourthClassTax = 26000*0.25;
    	double fifthClassTax = 20000*0.3;
    	double sixthClassTax = 25000*0.35;
    	if(gap<=1500){
    		tax = gap*0.03;
    	}else if(1500<gap && gap<=4500){
    		tax = firstClassTax+(gap-1500)*0.1;
    	}else if(4500<gap && gap<=9000){
    		tax = firstClassTax+secondClassTax+(gap-4500)*0.2;
    	}else if(9000<gap && gap<=35000){
    		tax = firstClassTax+secondClassTax+thirdClassTax+(gap-9000)*0.25;
    	}else if(35000< gap && gap<=55000){
    		tax = firstClassTax+secondClassTax+thirdClassTax+fourthClassTax+
    				0.3*(gap-35000);
    	}else if (55000<gap &&gap<=80000){
    		tax = firstClassTax+secondClassTax+thirdClassTax+fourthClassTax+
    				fifthClassTax+0.35*(gap-55000);
    	}else if(80000<gap){
    		tax = firstClassTax+secondClassTax+thirdClassTax+fourthClassTax+
    				fifthClassTax+sixthClassTax+(gap-80000)*0.45;
    	}
    	
    	System.out.println("所需要交纳的税费为："+tax);
    }
}
