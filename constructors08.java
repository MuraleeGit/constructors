//Constructor length
package com.k2js.constructors.practice;

class Shirt{
	String color, brand;
	int price;
	
	Shirt(String brand, int price){
		
		this.brand=brand;
		this.price=price;
	}
	Shirt(String color,String brand,int price){
		
		this(brand,price);
		this.color=color;
	}
	@Override
	public String toString(){
		String c="Color= "+((this.color!=null)?this.color:"color not available");
		String b="brand="+this.brand+"\t";
		String p="Price="+this.price+"\t";
		return "Shirt Details->" +c+b+p;
		
	}
}

class ShirtTest{
	public static void main(String...abc){
		Shirt s1=new Shirt("Arrow",2500);
		Shirt s2=new Shirt("Red","Redtape",1999);
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
/*
D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\constructors\src>javac -d ..\bin com\k2js\constructors\practice\constructors03.java

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\constructors\src>java -cp ..\bin  com.k2js.constructors.practice.ChocolateTest
chocolate details=brand=brand not available     name5star       price10
chocolate details=brand=cadbburynamediary Milk Silk     price35
*/