package com.ex.Components;

import com.ex.factoryIF.Shape;

public class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}