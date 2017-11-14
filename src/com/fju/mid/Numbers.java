package com.fju.mid;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		System.out.println("請輸入一個數字");
		     Scanner scanner = new Scanner(System.in);
             String line = scanner.nextLine();
             int n = Integer.parseInt(line);
             for(int x=1; x<=n ;x++){
            	 System.out.print(x);
             }
               
	}

}
