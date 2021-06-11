package com.inheritance;

public class test {

	public static void main(String[] args) {
		//static poymorphism -- compile time polymorphism (polymorphism means one to many methods / method overriding
		bmw  b = new bmw();
		b.satrt();
		b.theftSaftey();
		b.stop();
		b.refuel();
		
	System.out.println("=============");	
		car c = new car();
		c.start();
		c.refuel();
		c.stop();
		
	System.out.println("=========");
	//top casting	
	car c1 = new bmw(); // child class object can be referred by parent class reference variable is called dynamic polymorphism
	//or run time polymorphism
	c1.start();
	c1.stop();
	c1.refuel();
	
	//down casting
	bmw b1 = (bmw)new car();         //clascastexception
		
		
	}
	

}
