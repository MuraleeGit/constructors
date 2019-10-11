//Constructor length
package com.k2js.constructors.practice;

class Laptop{
	String brand;
	int size;
	int price;
	
	Laptop(String brand,int size){
		this.size=size;
		this.brand=brand;
	}
	Laptop(String brand, int price, int size){
		this(brand,size);
		this.price=price;
	}
	@Override
	public String toString(){
		String b="brand="+this.brand+"\t";
		String s="size"+this.size+"\t";
		String p ="price"+((this.price!=0)?this.price:"price not available"+"\t");
		return "Laptop details="+b+s+p;
	}
}

class LaptopTest{
	public static void main(String...abc){
		Laptop b1=new Laptop("Dell",14);
		Laptop b2=new Laptop("Lenovo",35000, 15);
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