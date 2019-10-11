//Constructor length
package com.k2js.constructors.practice;

class Biscuit{
	String brand,name;
	int price;
	
	Biscuit(String name, String brand){
		this.name=name;
		this.brand=brand;
	}
	Biscuit(String name, int price, String brand){
		this(name,brand);
		this.price=price;
	}
	@Override
	public String toString(){
		String b="brand="+this.brand+"\t";
		String n="name"+this.name+"\t";
		String p ="price"+((this.price!=0)?this.price:"price not available"+"\t");
		return "Biscuit details="+b+n+p;
	}
}

class BiscuitTest{
	public static void main(String...abc){
		Biscuit b1=new Biscuit("Mary Gold","ghss");
		Biscuit b2=new Biscuit("chocobar",35, "ITC");
		System.out.println(b1);
		System.out.println(b2);
		
	}
}

/*
D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\constructors\src>javac -d ..\bin com\k2js\constructors\practice\constructors03.java

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\constructors\src>java -cp ..\bin  com.k2js.constructors.practice.ChocolateTest
chocolate details=brand=brand not available     name5star       price10
chocolate details=brand=cadbburynamediary Milk Silk     price35
*/