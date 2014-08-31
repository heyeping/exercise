package com.hyp;
class Animal{
	public void move(){
		System.out.println("动物可以移动");
	}
}
class Dog extends Animal{
	public void move(){
		super.move();
		System.out.println("狗可以跑");
	}
}
public class TestDog {
	public static void main(String args[]){
    Animal a=new Animal();
    Dog b=new Dog();
    a.move();
    b.move();
	}
}
