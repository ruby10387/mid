package com.fju.mid.Lucky;

import java.util.Random;
import java.util.Scanner;

public class Lucky {

	public static void main(String[] args) {
          Random x = new Random();
          System.out.print("Please enter a number:");
          Scanner scanner = new Scanner(System.in);
          String line = scanner.nextLine();
          int n = Integer.parseInt(line);
          for(int y=1; y<=6 ;y++){
              System.out.print(x.nextInt(10)+1 + " ");
          }
          System.out.println();
          if(n==x.nextInt(10)+1){
        	  System.out.println("Yes");
          }else{
        	  System.out.println("No");
          }	  
	}

}
