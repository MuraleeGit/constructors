//Constructor length
package com.k2js.constructors.practice;

class ToothPaste{
	String color, brand;
	int price;
	
	ToothPaste(String color, int price){
		this.color=color;
		this.price=price;
	}
	ToothPaste(String color,String brand,int price){
		this(color,price);
		this.brand=brand;
	}
	@Override
	public String toString(){
		String c="Color= "+this.color+"\t";
		String b="brand="+((this.brand!=null)?this.brand:"brand is not available");
		String p="Price="+this.price+"\t";
		return "Toothpaste Details->" +c+b+p;
		
	}
}

class ToothPasteTest{
	public static void main(String...abc){
		ToothPaste t1=new ToothPaste("white",105);
		ToothPaste t2=new ToothPaste("pink","colgate",250);
		
		System.out.println(t1);
		System.out.println(t2);
	}
}
/*
D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\constructors\src>javac -d ..\bin com\k2js\constructors\practice\constructors03.java

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\constructors\src>java -cp ..\bin  com.k2js.constructors.practice.ChocolateTest
chocolate details=brand=brand not available     name5star       price10
chocolate details=brand=cadbburynamediary Milk Silk     price35
*/