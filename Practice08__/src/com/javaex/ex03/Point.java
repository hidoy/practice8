package com.javaex.ex03;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return  "x: " + x + "y: " + y + "입니다";
	}

}
