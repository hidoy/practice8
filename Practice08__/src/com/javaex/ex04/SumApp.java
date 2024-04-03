package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();
		
		String[] split = numLine.split(" ");
		for(int i=0;i<split.length;i++) {
			sum=sum+Integer.parseInt(split[i]);
			System.out.println(sum);
		}
		
		
		
		System.out.println("합:" + sum);
		
		sc.close();
	}

}
