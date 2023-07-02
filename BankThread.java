package com.trinity;

import java.util.Scanner;

public class BankThread extends Thread{
	     int total = 100;
	 
	    void withdrawn(String name, int withdrawal)
	    {
	 
	        if (total >= withdrawal) {
	            System.out.println(name + " withdrawn "  + withdrawal);
	            total = total - withdrawal;
	 
	            try {

	                Thread.sleep(5000);
	            }
	 
	            catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	            System.out.println(total);
	        }

	        else {
	 
	            System.out.println(name+ " you can not withdraw "+ withdrawal);
	                               
	            System.out.println("your balance is: " + total);
	 
	 
	            try {
	                Thread.sleep(1000);
	            }
	            catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	 
   public static void main(String[] args) {
	    Scanner ip=new Scanner(System.in);
//	    System.out.println("Enter a name: ");
//	    String name=ip.next();
//	    System.out.println("Enter a withdrawl amount");
//	    int withdrawal=ip.nextInt();
       BankThread b=new BankThread();
       System.out.println("Enter name and witdraw");
	    b.withdrawn(ip.next(), ip.nextInt());
	    b.start();
	    
	    
	    
          } 

}

	