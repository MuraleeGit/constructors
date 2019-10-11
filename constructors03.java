//Constructor length
package com.k2js.constructors.practice;

class Chocolate{
	String brand,name;
	int price;
	
	Chocolate(String name, int price){
		this.name=name;
		this.price=price;
	}
	Chocolate(String name, int price, String brand){
		this(name,price);
		this.brand=brand;
	}
	@Override
	public String toString(){
		String b="brand="+((this.brand!=null)?this.brand:"brand not available"+"\t");
		String n="name"+this.name+"\t";
		String p ="price"+this.price;
		return "chocolate details="+b+n+p;
	}
}

class ChocolateTest{
	public static void main(String...abc){
		Chocolate c1=new Chocolate("5star",10);
		Chocolate c2=new Chocolate("diary Milk Silk",35, "cadbbury");
		System.out.println(c1);
		System.out.println(c2);
		
	}
}

/*
D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\constructors\src>javac -d ..\bin com\k2js\constructors\practice\constructors03.java

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\constructors\src>java -cp ..\bin  com.k2js.constructors.practice.ChocolateTest
chocolate details=brand=brand not available     name5star       price10
chocolate details=brand=cadbburynamediary Milk Silk     price35
*/