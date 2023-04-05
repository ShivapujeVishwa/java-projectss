package com;

public class CalculatorImp implements Calculator {
	@Override
	public int add(int x,int y) {
		return x+y;
	}
	@Override
	public int substract(int x,int y) {
		return x-y;
	}
	@Override
	public int multiplication(int x,int y) {
		return x*y;
	}
	@Override
	public int division(int x,int y) {
		if (y!=0) {
		return x/y;
		}
		return -1;
	}
	@Override
	public String DisplayErrorMessage() {
		return "Invalid choice:";
	}
	

}
