package com.javaex.ex01;

public class LastNumberApp {

	public static void main(String[] args) {

		// 수정하지 마세요
		lastValue();
	}


	//런타임시 오류발생
	public static void lastValue() {

		int[] intArray = new int[3];
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;

		int result;
		
		try {
			result = intArray[3];
			System.out.println(result);
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("배열의 범위를 넘었습니다");
		}
		catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
		
	}

}
