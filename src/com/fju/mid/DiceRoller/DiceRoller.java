package com.fju.mid.DiceRoller;

import java.util.Random;

public class DiceRoller {

	public static void main(String[] args) {
		Random x = new Random();
		int n1 = x.nextInt(6)+1;
		int n2 = x.nextInt(6)+1;
		int n3 = x.nextInt(6)+1;
		for(int z=1; z>=1 ;z++){
		        System.out.print(n1 +" ");
		        System.out.print(n2 +" ");
		        System.out.print(n3 +" ");
		    if(n1==n2){
			    break;
		    }else{
		    	if(n1==n3){
		    		break;
		    	}else{
		    		if(n2==n3){
		    			break;
		    		}
		    	}
		    }
		    System.out.println();
		}
		System.out.println();
		System.out.println("1點出現次");
		System.out.println("2點出現次");
		System.out.println("3點出現次");
		System.out.println("4點出現次");
		System.out.println("5點出現次");
		System.out.println("6點出現次");
	}

}
