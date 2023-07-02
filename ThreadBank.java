package com.trinity;

public class ThreadBank  
{   
	void withdrawn(String name, int withdrawal)
    {
         int total=100;
         if (total >= withdrawal) {
            System.out.println(name + " withdrawn "  + withdrawal);
            total = total - withdrawal;
 
            System.out.println(total);
 
            //  Making the thread sleep for 1 second after
            //   each withdrawal
 
            // Try block to check for exceptions
            try {
 
                // Making thread to sleep for 1 second
                Thread.sleep(1000);
            }
 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
         
         
         class ThreadWithdrawal extends Thread {
        	 
        	 ThreadBank object;
     	    String name;
     	    int dollar;
     	 
     	    // Constructor of this method
     	    ThreadWithdrawal(ThreadBank ob, String name, int money)
     	    {
     	        this.object = ob;
     	        this.name = name;
     	        this.dollar = money;
     	    }
     	 
     	    // run() method for thread
     	    public void run() { 
     	    	object.withdrawn(name, dollar); 
     	    	}
     	    }
     	}
	class GFG {
		 
	    // Main driver method
	    public static void main(String[] args)
	    {
	        // Declaring an object of Bank class and passing the
	        // object along with other parameters to the
	        // ThreadWithdrawal and ThreadDeposit class. This
	        // will be required to call withdrawn and deposit
	        // methods from those class
	 
	        // Creating an object of class1
	        ThreadBank obj = new ThreadBank();
//	 
//	        ThreadWithdrawal t1 = new ThreadWithdrawal(obj, "Arnab", 20);
//
//	        ThreadWithdrawal t2= new ThreadWithdrawal(obj, "Monodwip", 40);
//	            
//	        ThreadDeposit t3  = new ThreadDeposit(obj, "Mukta", 35);
	       
	 
	        // When a program calls the start() method, a new
	        // thread is created and then the run() method is
	        // executed.
	 
	        // Starting threads created above
//	        t1.start();
//	        t2.start();
//	        t3.start();
	      
	    }
}












}


