package com.mavenDemo;

public class App 
{
	public int add(int x, int y) {
		return x+y;
	}
	
	
	public int subtract(int x, int y) {
		return x-y;
	}
	
	
	public int multiply(int x, int y) {
		return x*y;
	}
	
	public int divide(int x, int y) {
		return x/y;
	}
	
    public static void main( String[] args )
    {
    	System.out.println("Hello World !.");
    	App app = new App();
    	System.out.println("10+20="+app.add(20, 10));
    	System.out.println("20-10="+app.subtract(20, 10));
    	System.out.println("20*10="+app.multiply(10, 20));
    	System.out.println("20/10="+app.divide(20, 10));
    }
}




