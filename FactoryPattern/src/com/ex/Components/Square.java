package com.ex.Components;

import com.ex.factoryIF.Shape;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}
