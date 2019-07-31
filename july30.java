package lovely;

import java.util.Scanner;

public class july30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		Scanner pop = new Scanner (System.in);
		
		String candy =new String();
	
		int blue= 0 ;
		String skating=" skating is $6 per person";
		String movies=" movies only $8 per person";
		String arcade="  arcade is only $40 for unlimited tokens";
		String zoo="zoo is only $15 per person";
		String carnival= " carnival all day passes are $30";
		String gocarts= " go carts are only $20 per person ";
		String drivein =" drive in is $10 per car";
		String name ="";
		String date ="";
		
		System.out.println("enter your name");
		name=pop.nextLine();
		
       System.out.println("would you like to be indoor or outdoor");
		date=pop.nextLine();
		
	   System.out.println("please enter your budget");
	    blue=pop.nextInt();
	    
	    
	    
	     if (date.equalsIgnoreCase("indoor") && blue <= 30) {
	     
	    	 System.out.println(skating);
	    	 System.out.println(movies);
	    	 System.out.println(arcade);
	     }
	    	 if (date.equalsIgnoreCase("outdoor") && blue <= 30) { 
	    		
	    		 System.out.println(zoo);
	    		 System.out.println(carnival);
	    		 System.out.println(gocarts);
	    		 System.out.println(drivein);
	     }
	    	
	    	 
	    	 }
	    	 }
	
