package com.tolltax;

import java.util.Scanner;

public class fourwheeler extends vehicle {

	public fourwheeler(int nofperson, int extratoll, int basictoll, String vehicleno,String vehitype) {
		super(nofperson, extratoll, basictoll, vehicleno,vehitype);
		
	}

	void displayfourwheeler() {
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter vehicle number: ");
		 vehicleno = sc.next();
		 System.out.println("Enter extra person: ");
		 nofperson = sc.nextInt();
		 System.out.println("------------------------------------");
		 System.out.println("    TOLL TAX RECIPT(FOUR-WHEELER)   ");
		 System.out.println("************************************");
		 System.out.println("NOTE: BASICTOLL IS 40RS  \nEXTRA CHARGE IS 40RS/PERSON");
		 System.out.println("----------------------------------");
		 System.out.println("Vehicle number: "+vehicleno);
		 System.out.println("Number of Extra person: "+nofperson);
		 System.out.println("----------------------------------");
		 
		 
		 if (nofperson>4)
		  {
	      
		totaltoll=(nofperson*40+40);
		System.out.print("Totaltoll is: "+totaltoll+"RS");
		
		  }
		  
		  
		  else if(nofperson<=4)
		  {
			  totaltoll=40;
			  System.out.print("Totaltoll is: "+totaltoll+"RS");
		  }
		  
		  else {
			  System.out.print("Invalid input");
			  sc.close();
			  
		  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

}
