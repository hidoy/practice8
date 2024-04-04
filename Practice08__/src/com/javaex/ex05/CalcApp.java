package com.javaex.ex05;


import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	String s1=new String();
    	while(true) {
	    	s1=sc.nextLine();
	    	if(s1.equals("/q")) {
	    		break;
	    	}
	    	if(s1.contains("+")) {
	    		
	    		String[] split=s1.split("\\s*\\+\\s*");
	    		int a=Integer.parseInt(split[0]);
	    		int b=Integer.parseInt(split[1]);
	    		Add add=new Add();
	    		add.setValue(a,b);
	    		System.out.println(add.calculate());
	    	}
	    	else if(s1.contains("-")) {
	    		String[] split=s1.split("\\s*\\*\\s*");
	    		int a=Integer.parseInt(split[0]);
	    		int b=Integer.parseInt(split[1]);
	    		Sub sub=new Sub();
	    		sub.setValue(a,b);
	    		System.out.println(sub.calculate());
	    	}
	    	else if(s1.contains("/")) {
	    		String[] split=s1.split("\\s*\\/\\s*");
	    		int a=Integer.parseInt(split[0]);
	    		int b=Integer.parseInt(split[1]);
	    		Div div=new Div();
	    		div.setValue(a,b);
	    		System.out.println(div.calculate());
	    	}
	    	else if(s1.contains("*")) {
	    		String[] split=s1.split("\\s*\\*\\s*");
	    		int a=Integer.parseInt(split[0]);
	    		int b=Integer.parseInt(split[1]);
	    		Mul mul=new Mul();
	    		mul.setValue(a,b);
	    		System.out.println(mul.calculate());
	    	}
	    	else {
	    		System.out.println("알 수 없는 연산입니다");
	    	}
	    	
    	}
    	sc.close();
    }
}
