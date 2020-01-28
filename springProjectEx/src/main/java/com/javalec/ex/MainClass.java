package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// MyCalculator myCalculator = new MyCalculator();
		// myCalculator.setCalculator(new Calculator());
		String configLoc = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
		MyCalculator mycalculator = ctx.getBean("MyCalculator", MyCalculator.class);
		mycalculator.add();
		mycalculator.sub();
		mycalculator.div();
		mycalculator.mult();
		
	}

}
