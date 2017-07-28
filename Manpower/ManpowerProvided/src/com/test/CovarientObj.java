package com.test;

class A {
	
	int x=5;
}
class B extends A{
	
	int x=6;
}
class CovarientObj {
public A getObject(){
	System.out.println("In A");
	return new B();
}
}
class SubCovariantObj extends CovarientObj{
	
	public B getObject(){
		
		System.out.println("In B");
		return new B();
	}
	public static void main(String[] args){
		
		SubCovariantObj c=new SubCovariantObj();
		System.out.println(c.getObject().x);
	}
}
