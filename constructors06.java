//Constructor length
package com.k2js.constructors.practice;

class Soap{
	String color, brand;
	int price;
	
	Soap(String color, String brand){
		this.color=color;
		this.brand=brand;
	}
	Soap(String color,String brand,int price){
		this(color,brand);
		this.price=price;
	}
	@Override
	public String toString(){
		String c="Color= "+this.color+"\t";
		String b="brand="+this.brand+"\t";
		String p="Price="+((this.price!=0)?this.price:"price is not available");
		return "Soap Details->" +c+b+p;
		
	}
}

class SoapTest{
	public static void main(String...abc){
		Soap s1=new Soap("green","chandrika");
		Soap s2=new Soap("Brown","pears", 45);
		
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