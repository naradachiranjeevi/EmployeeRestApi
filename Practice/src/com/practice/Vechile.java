package com.practice;

 interface Vechile {
	 public default void m1() {
	 	 }
	 public default void  m2() {
	 }
	 
    public void start();
	public static  void clean(){
		System.out.println("cleaning completed....");
	}
	}
	class Car implements Vechile{
		public void clean(){
			System.out.println("cleaning completed....");
		}
		public void start() {
			System.out.println("car start...");
		}
		 public static void main(String[] args) {
			Car c = new Car();
			Vechile.clean();
			c.start();
		 }
}
