package com.javaex.ex07;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			Point p=(Point)obj;
			return x==p.x;
		}
		else {
			return super.equals(obj);
		}
	}

	
}
