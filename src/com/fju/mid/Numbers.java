package com.fju.mid;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		System.out.print("Please enter a number:");
		     Scanner scanner = new Scanner(System.in);
             String line = scanner.nextLine();
             int n = Integer.parseInt(line);
             for(int x=1; x<=n ;x++){
            	 if(x>10){
            		 break;
            	 }	 
            	 System.out.print(x + " ");
            	 if(x%5 ==4){
            		 System.out.print("#" + " ");
            	 }
             }
            	 
             
               
	}

}
