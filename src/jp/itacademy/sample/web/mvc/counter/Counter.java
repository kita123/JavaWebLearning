package jp.itacademy.sample.web.mvc.counter;

public class Counter {
	
	private int num;
	
	public Counter(){
		num=0;
	}
	
	public int getNum(){
		return num;
	}
	
	public void inc(){
		num++;
	}
}
