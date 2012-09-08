package jp.itacademy.sample.web.mvc.bmi;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {
	
	private double height;
	private double weight;
	
	public Person(double height,double weight){
		this.height=height;
		this .weight=weight;
	}
	
	public double getHeight(){
		return height;
	}
	
	public double getWeight(){
		return weight;
	}
	
	public double getBmi(){
		double bmi=weight/Math.pow(height/100, 2);
		return new BigDecimal(bmi)
			.setScale(2,RoundingMode.HALF_UP)
			.doubleValue();
		
	}

}
